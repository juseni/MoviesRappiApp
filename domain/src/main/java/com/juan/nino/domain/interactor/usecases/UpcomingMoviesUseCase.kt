package com.juan.nino.domain.interactor.usecases

import com.juan.nino.domain.executor.PostExecutionThread
import com.juan.nino.domain.executor.ThreadExecutor
import com.juan.nino.domain.interactor.SingleUseCase
import com.juan.nino.domain.model.MoviesInformation
import com.juan.nino.domain.repositories.UpcomingMoviesRepository
import io.reactivex.Single
import javax.inject.Inject

/**
 * @author Juan Sebastian Niño
 */
class UpcomingMoviesUseCase @Inject constructor(
    private val upcomingMoviesRepository: UpcomingMoviesRepository,
    threadExecutor: ThreadExecutor,
    postExecutionThread: PostExecutionThread
) : SingleUseCase<MoviesInformation>(threadExecutor, postExecutionThread){

    override fun buildObservableSearch(): Single<MoviesInformation> =
        upcomingMoviesRepository.getUpcomingMoviesSearch()


    override fun buildObservable(page: Int): Single<MoviesInformation> =
        upcomingMoviesRepository.getUpcomingMovies(page)
}