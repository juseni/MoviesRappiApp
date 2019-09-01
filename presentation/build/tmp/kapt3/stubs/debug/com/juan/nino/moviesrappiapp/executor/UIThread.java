package com.juan.nino.moviesrappiapp.executor;

import java.lang.System;

/**
 * @author Juan Sebastian Niño
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/juan/nino/moviesrappiapp/executor/UIThread;", "Lcom/juan/nino/domain/executor/PostExecutionThread;", "()V", "scheduler", "Lio/reactivex/Scheduler;", "getScheduler", "()Lio/reactivex/Scheduler;", "presentation_debug"})
@javax.inject.Singleton()
public final class UIThread implements com.juan.nino.domain.executor.PostExecutionThread {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler getScheduler() {
        return null;
    }
    
    @javax.inject.Inject()
    public UIThread() {
        super();
    }
}