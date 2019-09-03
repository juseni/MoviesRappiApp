package com.juan.nino.data.respositories

import com.google.gson.Gson
import com.juan.nino.data.db.dao.UpcomingMoviesDao
import com.juan.nino.data.db.entity.MovieInformationEntity
import com.juan.nino.data.db.entity.UpcomingMovieEntity
import com.juan.nino.data.platform.NetworkHandler
import com.juan.nino.data.source.source.MoviesApi
import com.juan.nino.data.source.source.MoviesApi.Companion.DEFAULT_PAGE
import com.juan.nino.domain.model.MoviesInformation
import com.juan.nino.domain.repositories.UpcomingMoviesRepository
import io.reactivex.Single
import javax.inject.Inject
import com.juan.nino.data.source.source.MoviesApi.Companion.UPCOMING_MOVIES
import java.text.SimpleDateFormat
import java.util.*

/**
 * @author Juan Sebastian Niño
 */
class UpcomingMoviesRepositoryImpl @Inject constructor(
    val gson: Gson,
    val api: MoviesApi,
    val upcomingMoviesdao: UpcomingMoviesDao,
    val networkHandler: NetworkHandler
) : UpcomingMoviesRepository {

    companion object {
        private var INIT_DATE = "2019-06-15"
        private var END_DATE = "2019-12-15"
        private const val SIX_MONTHS_ADDITION = 6
    }

    init {
        val currentTime = Calendar.getInstance()
        INIT_DATE = formatDateForService(currentTime.time)
        currentTime.add(Calendar.MONTH, SIX_MONTHS_ADDITION)
        END_DATE = formatDateForService(currentTime.time)
    }

    private fun formatDateForService(date: Date): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
        return dateFormat.format(date)
    }

    private fun insertUpcomingMoviesPersistence(upcomingMovies: List<UpcomingMovieEntity>?, currentPage: Int) {
        if(currentPage == DEFAULT_PAGE) {
            upcomingMoviesdao.deleteUpcomingMovies()
        }
        upcomingMoviesdao.insertUpcomingMovies(upcomingMovies)
    }

    override fun getUpcomingMovies(page: Int): Single<MoviesInformation> {
        if (networkHandler.isConnected()) {
            return api.getUpcomingMovies(INIT_DATE, END_DATE, page).flatMap { response ->
                if (response.isSuccessful) {
                    insertUpcomingMoviesPersistence(
                        MovieInformationEntity.transformPersistance(
                            response.body()?.results,
                            UPCOMING_MOVIES
                        ) as List<UpcomingMovieEntity>, page
                    )
                    val upcomingMovies = MovieInformationEntity.transform(response.body()!!)
                    Single.just(upcomingMovies)
                } else {
                    Single.error(Exception("No data received"))
                }
            }
        } else {
            return getUpcomingMoviesPersistence()
        }
    }

    override fun getUpcomingMoviesSearch(): Single<MoviesInformation> {
        return getUpcomingMoviesPersistence()
    }

    private fun getUpcomingMoviesPersistence(): Single<MoviesInformation> {
        return try {
            upcomingMoviesdao.getUpcomingMovies().map {
                MovieInformationEntity.transform(
                    MovieInformationEntity(
                        0, UpcomingMovieEntity.transform(it),
                        0, 0
                    )
                )
            }
        } catch (e: Exception) {
            Single.error(Exception("No data received"))
        }
    }
}