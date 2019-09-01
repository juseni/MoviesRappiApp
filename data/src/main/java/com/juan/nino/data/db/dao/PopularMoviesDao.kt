package com.juan.nino.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.juan.nino.data.db.entity.PopularMovieEntity
import io.reactivex.Single

/**
 * @author Juan Sebastian Niño
 */
@Dao
interface PopularMoviesDao {

    @Query("SELECT * FROM popular_movies_table")
    fun getPopularMovies(): Single<List<PopularMovieEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertPopularMovies(movies: List<PopularMovieEntity>?)

    @Query("DELETE FROM popular_movies_table")
    fun deletePopularMovies()


}