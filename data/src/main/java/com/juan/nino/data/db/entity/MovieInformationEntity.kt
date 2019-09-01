package com.juan.nino.data.db.entity

import com.google.gson.annotations.SerializedName
import com.juan.nino.data.source.source.MoviesApi.Companion.POPULAR_MOVIES
import com.juan.nino.domain.model.Movie
import com.juan.nino.domain.model.MoviesInformation
import com.juan.nino.data.db.entity.PopularMovieEntity.Companion.transformPopularMoviesPersistence
import com.juan.nino.data.source.source.MoviesApi.Companion.TOP_RATED_MOVIES
import com.juan.nino.data.db.entity.RatedMovieEntity.Companion.transformRatedMoviesPersistence
import com.juan.nino.data.db.entity.UpcomingMovieEntity.Companion.transformUpcomingMoviesPersistence

/**
 * @author Juan Sebastian Niño
 */
data class MovieInformationEntity(
    @SerializedName(value = "page") var pages: Int? = 0,
    val results: List<MovieEntity>? = null,
    var total_pages: Int? = 0,
    var total_results: Int? = 0
) {
    companion object {
        fun transform(movieInformationEntity: MovieInformationEntity) =
            with(movieInformationEntity) {
                MoviesInformation(
                    pages!!,
                    results!!.map { transform(it) },
                    total_pages!!,
                    total_results!!
                )
            }

        fun transform(movieEntity: MovieEntity) =
            with(movieEntity) {
                Movie(
                    vote_count,
                    id,
                    video,
                    vote_average,
                    title,
                    popularity,
                    poster_path,
                    original_language,
                    original_title,
                    backdrop_path,
                    adult,
                    overview,
                    release_date
                )
            }

        fun transformPersistance(moviesEntity: List<MovieEntity>?, movieType: Int) =
            when (movieType) {
                POPULAR_MOVIES -> moviesEntity?.map { transformPopularMoviesPersistence(it) }
                TOP_RATED_MOVIES -> moviesEntity?.map { transformRatedMoviesPersistence(it) }
                else -> moviesEntity?.map { transformUpcomingMoviesPersistence(it) }
            }
    }
}