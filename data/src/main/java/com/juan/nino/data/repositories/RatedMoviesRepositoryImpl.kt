package com.juan.nino.data.respositories

import com.google.gson.Gson
import com.juan.nino.data.db.dao.RatedMoviesDao
import com.juan.nino.data.db.entity.MovieInformationEntity
import com.juan.nino.data.db.entity.RatedMovieEntity
import com.juan.nino.data.platform.NetworkHandler
import com.juan.nino.data.source.source.MoviesApi
import com.juan.nino.data.source.source.MoviesApi.Companion.DEFAULT_PAGE
import com.juan.nino.domain.model.MoviesInformation
import com.juan.nino.domain.repositories.RatedMoviesRepository
import io.reactivex.Single
import javax.inject.Inject
import com.juan.nino.data.source.source.MoviesApi.Companion.TOP_RATED_MOVIES

/**
 * @author Juan Sebastian Niño
 */
class RatedMoviesRepositoryImpl @Inject constructor(
    val gson: Gson,
    val api: MoviesApi,
    val ratedMoviesdao: RatedMoviesDao,
    val networkHandler: NetworkHandler
) : RatedMoviesRepository {

    companion object {
        private const val RATED_MOVIES_SORT_BY = "vote_average.desc"
    }

    private fun insertRatedMoviesPersistence(ratedMovies: List<RatedMovieEntity>?, currentPage: Int) {
        if (currentPage == DEFAULT_PAGE) {
            ratedMoviesdao.deleteRatedMovies()
        }
        ratedMoviesdao.insertRatedMovies(ratedMovies)
    }

    override fun getRatedMovies(page: Int): Single<MoviesInformation> {
        if (networkHandler.isConnected()) {
            return api.getPopularOrRatedMovies(RATED_MOVIES_SORT_BY, page).flatMap { response ->
                if (response.isSuccessful) {
                    insertRatedMoviesPersistence(
                        MovieInformationEntity.transformPersistance(
                            response.body()?.results,
                            TOP_RATED_MOVIES
                        ) as List<RatedMovieEntity>, page
                    )
                    val ratedMovies = MovieInformationEntity.transform(response.body()!!)
                    Single.just(ratedMovies)
                } else {
                    Single.error(Exception("No data received"))
                }
            }
        } else {
            return getRatedMoviesPersistence()
        }
    }

    override fun getRatedMoviesSearch(): Single<MoviesInformation> {
        return getRatedMoviesPersistence()
    }

    private fun getRatedMoviesPersistence(): Single<MoviesInformation> {
        return try {
            ratedMoviesdao.getRatedMovies().map {
                MovieInformationEntity.transform(
                    MovieInformationEntity(
                        0, RatedMovieEntity.transform(it),
                        0, 0
                    )
                )
            }
        } catch (e: Exception) {
            Single.error(Exception("No data received"))
        }
    }
}