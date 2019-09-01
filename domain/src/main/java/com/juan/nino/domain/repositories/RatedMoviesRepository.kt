package com.juan.nino.domain.repositories

import com.juan.nino.domain.model.MoviesInformation
import io.reactivex.Single

/**
 * @author Juan Sebastian Niño
 */
interface RatedMoviesRepository {
    fun getRatedMovies(page: Int): Single<MoviesInformation>

    fun getRatedMoviesSearch(): Single<MoviesInformation>
}