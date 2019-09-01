package com.juan.nino.moviesrappiapp.executor

import com.juan.nino.domain.executor.ThreadExecutor
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author Juan Sebastian Niño
 */
@Singleton
class JobExecutor
@Inject
constructor() : ThreadExecutor {

    companion object {
        private const val THREAD_POOL = 3
    }

    private val threadPoolExecutor: Executor = Executors.newFixedThreadPool(THREAD_POOL)

    override fun execute(runnable: Runnable) {
        threadPoolExecutor.execute(runnable)
    }
}