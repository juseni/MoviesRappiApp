package com.juan.nino.moviesrappiapp.model

import android.os.Parcelable
import com.juan.nino.domain.model.Movie
import kotlinx.android.parcel.Parcelize

/**
 * @author Juan Sebastian Niño
 */
@Parcelize
data class MovieModel(
    val vote_count: Int? = 0,
    val id: Int? = 0,
    val video: Boolean? = false,
    val vote_average: Double? = 0.0,
    val title: String? = "",
    val popularity: Double? = 0.0,
    val poster_path: String? = "",
    val original_language: String? = "",
    val original_title: String? = "",
    val backdrop_path: String? = "",
    val adult: Boolean? = false,
    val overview: String? = "",
    val release_date: String? = ""
): Parcelable {
    companion object {
        fun transformMovie(movies: List<Movie>): List<MovieModel> {
            return movies.map { movie ->
                with(movie) {
                    MovieModel(
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
            }
        }
    }
}
