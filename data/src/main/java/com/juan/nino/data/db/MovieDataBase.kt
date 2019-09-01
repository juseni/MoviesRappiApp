package com.juan.nino.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.juan.nino.data.db.dao.PopularMoviesDao
import com.juan.nino.data.db.dao.RatedMoviesDao
import com.juan.nino.data.db.dao.UpcomingMoviesDao
import com.juan.nino.data.db.entity.PopularMovieEntity
import com.juan.nino.data.db.entity.RatedMovieEntity
import com.juan.nino.data.db.entity.UpcomingMovieEntity

/**
 * @author Juan Sebastian Niño
 */
@Database(entities = [PopularMovieEntity::class, RatedMovieEntity::class,
    UpcomingMovieEntity::class],
    version = 2)
abstract class MovieDataBase : RoomDatabase() {

    abstract fun popularMoviesDao(): PopularMoviesDao
    abstract fun ratedMoviesDao(): RatedMoviesDao
    abstract fun upcomingMoviesDao(): UpcomingMoviesDao

    companion object {
        @Volatile
        private var instance: MovieDataBase? = null
        private val LOCK = Any()
        private const val DATABASE_NAME = "movie_table"

        fun getInstance(context: Context) = instance ?: synchronized(
            LOCK
        ) {
            instance
                ?: buildDatabase(context).also { instance = it }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                MovieDataBase::class.java,
                DATABASE_NAME
            ).fallbackToDestructiveMigration()
                .build()
    }
}