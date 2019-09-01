package com.juan.nino.moviesrappiapp.executor;

import java.lang.System;

/**
 * @author Juan Sebastian Niño
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/juan/nino/moviesrappiapp/executor/JobExecutor;", "Lcom/juan/nino/domain/executor/ThreadExecutor;", "()V", "threadPoolExecutor", "Ljava/util/concurrent/Executor;", "execute", "", "runnable", "Ljava/lang/Runnable;", "Companion", "presentation_debug"})
@javax.inject.Singleton()
public final class JobExecutor implements com.juan.nino.domain.executor.ThreadExecutor {
    private final java.util.concurrent.Executor threadPoolExecutor = null;
    private static final int THREAD_POOL = 3;
    public static final com.juan.nino.moviesrappiapp.executor.JobExecutor.Companion Companion = null;
    
    @java.lang.Override()
    public void execute(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable runnable) {
    }
    
    @javax.inject.Inject()
    public JobExecutor() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/juan/nino/moviesrappiapp/executor/JobExecutor$Companion;", "", "()V", "THREAD_POOL", "", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}