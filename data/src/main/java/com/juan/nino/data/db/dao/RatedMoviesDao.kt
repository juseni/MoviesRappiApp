package com.juan.nino.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.juan.nino.data.db.entity.RatedMovieEntity
import io.reactivex.Single
/**
 * @author Juan Sebastian Niño
 */
@Dao
interface RatedMoviesDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertRatedMovies(movies: List<RatedMovieEntity>?)

    @Query("SELECT * FROM rated_movies_table")
    fun getRatedMovies(): Single<List<RatedMovieEntity>>

    @Query("DELETE FROM rated_movies_table")
    fun deleteRatedMovies()
}