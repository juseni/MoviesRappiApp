package com.juan.nino.domain.repositories

import com.juan.nino.domain.model.MoviesInformation
import io.reactivex.Single

/**
 * @author Juan Sebastian Niño
 */
interface UpcomingMoviesRepository {
    fun getUpcomingMovies(page: Int): Single<MoviesInformation>

    fun getUpcomingMoviesSearch(): Single<MoviesInformation>
}