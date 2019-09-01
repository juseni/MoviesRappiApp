package com.juan.nino.domain.interactor.usecases

import com.juan.nino.domain.executor.PostExecutionThread
import com.juan.nino.domain.executor.ThreadExecutor
import com.juan.nino.domain.interactor.SingleUseCase
import com.juan.nino.domain.model.MoviesInformation
import com.juan.nino.domain.repositories.RatedMoviesRepository
import io.reactivex.Single
import javax.inject.Inject

/**
 * @author Juan Sebastian Niño
 */
class RatedMoviesUseCase @Inject constructor(
    private val ratedMoviesRepository: RatedMoviesRepository,
    threadExecutor: ThreadExecutor,
    postExecutionThread: PostExecutionThread
) : SingleUseCase<MoviesInformation>(threadExecutor, postExecutionThread) {

    override fun buildObservableSearch(): Single<MoviesInformation> =
        ratedMoviesRepository.getRatedMoviesSearch()

    override fun buildObservable(page: Int): Single<MoviesInformation> =
    ratedMoviesRepository.getRatedMovies(page)
}