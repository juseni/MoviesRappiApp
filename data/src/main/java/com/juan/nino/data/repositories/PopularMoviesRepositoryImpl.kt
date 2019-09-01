package com.juan.nino.data.source.respositories

import com.google.gson.Gson
import com.juan.nino.data.db.dao.PopularMoviesDao
import com.juan.nino.data.db.entity.MovieInformationEntity
import com.juan.nino.data.db.entity.PopularMovieEntity
import com.juan.nino.data.source.source.MoviesApi
import com.juan.nino.domain.model.MoviesInformation
import com.juan.nino.domain.repositories.PopularMoviesRepository
import io.reactivex.Single
import javax.inject.Inject
import com.juan.nino.data.db.entity.MovieInformationEntity.Companion.transformPersistance
import com.juan.nino.data.platform.NetworkHandler
import com.juan.nino.data.source.source.MoviesApi.Companion.POPULAR_MOVIES

/**
 * @author Juan Sebastian Niño
 */
class PopularMoviesRepositoryImpl @Inject constructor(
    val gson: Gson,
    val api: MoviesApi,
    val popularMoviesdao: PopularMoviesDao,
    val networkHandler: NetworkHandler
) : PopularMoviesRepository {

    companion object {
        private const val POPULAR_MOVIES_SORT_BY = "popularity.desc"
    }

    private fun insertPopularMoviesPersistence(popularMovies: List<PopularMovieEntity>?) {
        popularMoviesdao.insertPopularMovies(popularMovies)
    }

    override fun getPopularMovies(page: Int): Single<MoviesInformation> {
        if (networkHandler.isConnected()) {
            return api.getPopularOrRatedMovies(POPULAR_MOVIES_SORT_BY, page).flatMap { response ->
                if (response.isSuccessful) {
                    insertPopularMoviesPersistence(transformPersistance(response.body()?.results,
                        POPULAR_MOVIES) as List<PopularMovieEntity>
                    )
                    val popularMovies = MovieInformationEntity.transform(response.body()!!)
                    Single.just(popularMovies)
                } else {
                    Single.error(Exception("No data received"))
                }
            }
        } else {
            return getPopularMoviesPersistence()
        }
    }

    override fun getPopularMoviesSearch(): Single<MoviesInformation> {
        return getPopularMoviesPersistence()
    }

    private fun getPopularMoviesPersistence(): Single<MoviesInformation> {
        return popularMoviesdao.getPopularMovies().map {
            MovieInformationEntity.transform(
                MovieInformationEntity(
                    0, PopularMovieEntity.transform(it),
                    0, 0
                )
            )
        }
    }


}