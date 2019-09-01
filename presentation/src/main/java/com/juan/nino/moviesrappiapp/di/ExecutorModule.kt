package com.juan.nino.moviesrappiapp.di

import com.juan.nino.domain.executor.PostExecutionThread
import com.juan.nino.domain.executor.ThreadExecutor
import com.juan.nino.moviesrappiapp.executor.JobExecutor
import com.juan.nino.moviesrappiapp.executor.UIThread
import dagger.Binds
import dagger.Module

/**
 * @author Juan Sebastian Niño
 */
@Module
abstract class ExecutorModule {
    @Binds
    abstract fun bindThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor

    @Binds
    abstract fun bindPostExecutionThread(uiThread: UIThread): PostExecutionThread
}