package com.juan.nino.data.source.source

import com.juan.nino.data.db.entity.MovieInformationEntity
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Response
import retrofit2.http.Headers

/**
 * @author Juan Sebastian Niño
 */
interface MoviesApi {

    companion object {
        private const val DISCOVER_MOVIES = "discover/movie"
        private const val SORT_MOVIE_BY = "sort_by"
        private const val INIT_DATE_SEARCH = "primary_release_date.gte"
        private const val END_DATE_SEARCH = "primary_release_date.lte"
        private const val PAGE = "page"

        const val POPULAR_MOVIES = 0x0001
        const val TOP_RATED_MOVIES = 0x0002
        const val UPCOMING_MOVIES = 0x0003
        const val API_AUTH_TOKEN = "api_key"
    }

    @Headers("Content-Type: application/json")
    @GET(DISCOVER_MOVIES)
    fun getPopularOrRatedMovies(
        @Query(SORT_MOVIE_BY) sortBy: String,
        @Query(PAGE) page: Int
    ): Single<Response<MovieInformationEntity>>

    @GET(DISCOVER_MOVIES)
    fun getUpcomingMovies(
        @Query(INIT_DATE_SEARCH) initDate: String,
        @Query(END_DATE_SEARCH) finishDate: String,
        @Query(PAGE) page: Int
    ): Single<Response<MovieInformationEntity>>
}