package com.juan.nino.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.juan.nino.data.db.entity.UpcomingMovieEntity
import io.reactivex.Single
/**
 * @author Juan Sebastian Niño
 */
@Dao
interface UpcomingMoviesDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertUpcomingMovies(movies: List<UpcomingMovieEntity>?)

    @Query("SELECT * FROM upcoming_movies_table")
    fun getUpcomingMovies(): Single<List<UpcomingMovieEntity>>

    @Query("DELETE FROM upcoming_movies_table")
    fun deleteUpcomingMovies()
}