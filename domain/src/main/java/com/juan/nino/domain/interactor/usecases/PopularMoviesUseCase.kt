package com.juan.nino.domain.interactor.usecases

import com.juan.nino.domain.executor.PostExecutionThread
import com.juan.nino.domain.executor.ThreadExecutor
import com.juan.nino.domain.interactor.SingleUseCase
import com.juan.nino.domain.model.Movie
import com.juan.nino.domain.model.MoviesInformation
import com.juan.nino.domain.repositories.PopularMoviesRepository
import io.reactivex.Single
import javax.inject.Inject

/**
 * @author Juan Sebastian Niño
 */
class PopularMoviesUseCase @Inject constructor(
    private val popularMoviesRepository: PopularMoviesRepository,
    threadExecutor: ThreadExecutor,
    postExecutionThread: PostExecutionThread
) : SingleUseCase<MoviesInformation>(threadExecutor, postExecutionThread) {

    override fun buildObservableSearch(): Single<MoviesInformation> =
        popularMoviesRepository.getPopularMoviesSearch()


    override fun buildObservable(page: Int): Single<MoviesInformation> =
        popularMoviesRepository.getPopularMovies(page)
}