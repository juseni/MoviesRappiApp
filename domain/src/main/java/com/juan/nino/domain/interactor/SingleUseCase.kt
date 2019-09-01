package com.juan.nino.domain.interactor

import com.juan.nino.domain.executor.PostExecutionThread
import com.juan.nino.domain.executor.ThreadExecutor
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

/**
 * @author Juan Sebastian Niño
 */
abstract class SingleUseCase<M>(
    threadExecutor: ThreadExecutor,
    postExecutionThread: PostExecutionThread
) {

    private val threadExecutorScheduler: Scheduler = Schedulers.from(threadExecutor)

    private val postExecutionThreadScheduler: Scheduler = postExecutionThread.scheduler

    abstract fun buildObservable(page: Int): Single<M>

    abstract fun buildObservableSearch(): Single<M>

    fun execute(page: Int): Single<M> {
        return buildObservable(page).subscribeOn(threadExecutorScheduler)
            .observeOn(postExecutionThreadScheduler)
    }

    fun executeSearch(): Single<M> {
            return buildObservableSearch().subscribeOn(threadExecutorScheduler)
                .observeOn(postExecutionThreadScheduler)
    }
}