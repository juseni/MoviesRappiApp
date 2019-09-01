package com.juan.nino.data.respositories

import com.google.gson.Gson
import com.juan.nino.data.db.dao.UpcomingMoviesDao
import com.juan.nino.data.db.entity.MovieInformationEntity
import com.juan.nino.data.db.entity.UpcomingMovieEntity
import com.juan.nino.data.platform.NetworkHandler
import com.juan.nino.data.source.source.MoviesApi
import com.juan.nino.domain.model.MoviesInformation
import com.juan.nino.domain.repositories.UpcomingMoviesRepository
import io.reactivex.Single
import javax.inject.Inject
import com.juan.nino.data.source.source.MoviesApi.Companion.UPCOMING_MOVIES

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
        private const val INIT_DATE = "2019-06-15"
        private const val END_DATE = "2019-12-15"
    }

    private fun insertUpcomingMoviesPersistence(upcomingMovies: List<UpcomingMovieEntity>?) {
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
                        ) as List<UpcomingMovieEntity>
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
        return upcomingMoviesdao.getUpcomingMovies().map {
            MovieInformationEntity.transform(
                MovieInformationEntity(
                    0, UpcomingMovieEntity.transform(it),
                    0, 0
                )
            )
        }
    }
}