package com.juan.nino.data.db.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 * @author Juan Sebastian Niño
 */
@Entity(tableName = "popular_movies_table",
    indices = arrayOf(Index(value = ["id", "title"],
        unique = true)))
data class PopularMovieEntity(
    @PrimaryKey(autoGenerate = true)
    val customId: Int?,
    val vote_count: Int?,
    val id: Int?,
    val video: Boolean?,
    val vote_average: Double?,
    val title: String?,
    val popularity: Double?,
    val poster_path: String?,
    val original_language: String?,
    val original_title: String?,
    val backdrop_path: String?,
    val adult: Boolean?,
    val overview: String?,
    val release_date: String?
) {
    companion object {
        fun transformPopularMoviesPersistence(movieEntity: MovieEntity) =
            with(movieEntity) {
                PopularMovieEntity(
                    null,
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

        fun transform(popularMoviesEntity: List<PopularMovieEntity>) =
            popularMoviesEntity.map { transform(it)  }

        fun transform(popularMovieEntity: PopularMovieEntity) =
            with(popularMovieEntity) {
                MovieEntity(
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