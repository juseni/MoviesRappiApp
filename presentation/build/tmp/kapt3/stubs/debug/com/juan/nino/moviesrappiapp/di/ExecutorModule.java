package com.juan.nino.moviesrappiapp.di;

import java.lang.System;

/**
 * @author Juan Sebastian Niño
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/juan/nino/moviesrappiapp/di/ExecutorModule;", "", "()V", "bindPostExecutionThread", "Lcom/juan/nino/domain/executor/PostExecutionThread;", "uiThread", "Lcom/juan/nino/moviesrappiapp/executor/UIThread;", "bindThreadExecutor", "Lcom/juan/nino/domain/executor/ThreadExecutor;", "jobExecutor", "Lcom/juan/nino/moviesrappiapp/executor/JobExecutor;", "presentation_debug"})
@dagger.Module()
public abstract class ExecutorModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.juan.nino.domain.executor.ThreadExecutor bindThreadExecutor(@org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.executor.JobExecutor jobExecutor);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.juan.nino.domain.executor.PostExecutionThread bindPostExecutionThread(@org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.executor.UIThread uiThread);
    
    public ExecutorModule() {
        super();
    }
}