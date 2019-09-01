package com.juan.nino.domain.repositories

import com.juan.nino.domain.model.MoviesInformation
import io.reactivex.Single

/**
 * @author Juan Sebastian Niño
 */
interface PopularMoviesRepository {

    fun getPopularMovies(page: Int): Single<MoviesInformation>

    fun getPopularMoviesSearch(): Single<MoviesInformation>

}