package com.juan.nino.moviesrappiapp.di;

import java.lang.System;

/**
 * @author Juan Sebastian Niño
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0017H\u0007J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J(\u0010\"\u001a\u00020#2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J \u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020%H\u0007J\u0010\u0010)\u001a\u00020*2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J(\u0010+\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J \u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020.H\u0007J/\u00102\u001a\u0002032%\u00104\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001e06\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u001e07\u00a2\u0006\u0002\b805H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/juan/nino/moviesrappiapp/di/AppModule;", "", "application", "Lcom/juan/nino/moviesrappiapp/MoviesRappiApplication;", "(Lcom/juan/nino/moviesrappiapp/MoviesRappiApplication;)V", "provideContext", "Landroid/content/Context;", "provideGson", "Lcom/google/gson/Gson;", "provideNavigatorController", "Landroidx/navigation/NavController;", "context", "providePopularMoviesDataSource", "Lcom/juan/nino/data/db/dao/PopularMoviesDao;", "providePopularMoviesRepository", "Lcom/juan/nino/data/source/respositories/PopularMoviesRepositoryImpl;", "gson", "api", "Lcom/juan/nino/data/source/source/MoviesApi;", "dao", "networkHandler", "Lcom/juan/nino/data/platform/NetworkHandler;", "providePopularMoviesUsecase", "Lcom/juan/nino/domain/interactor/usecases/PopularMoviesUseCase;", "popularMoviesRepositoryImpl", "threadExecutor", "Lcom/juan/nino/domain/executor/ThreadExecutor;", "postExecutionThread", "Lcom/juan/nino/domain/executor/PostExecutionThread;", "providePopularMoviesViewModel", "Landroidx/lifecycle/ViewModel;", "popularMoviesUseCase", "provideRatedMoviesDataSource", "Lcom/juan/nino/data/db/dao/RatedMoviesDao;", "provideRatedMoviesRepository", "Lcom/juan/nino/data/respositories/RatedMoviesRepositoryImpl;", "provideRatedMoviesUsecase", "Lcom/juan/nino/domain/interactor/usecases/RatedMoviesUseCase;", "ratedMoviesRepositoryImpl", "provideRatedMoviesViewModel", "ratedMoviesUseCase", "provideUpcomingMoviesDataSource", "Lcom/juan/nino/data/db/dao/UpcomingMoviesDao;", "provideUpcomingMoviesRepository", "Lcom/juan/nino/data/respositories/UpcomingMoviesRepositoryImpl;", "provideUpcomingMoviesUsecase", "Lcom/juan/nino/domain/interactor/usecases/UpcomingMoviesUseCase;", "upcomingMoviesRepositoryImpl", "provideUpcomingMoviesViewModel", "upcomingMoviesUseCase", "provideViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "providers", "", "Ljava/lang/Class;", "Ljavax/inject/Provider;", "Lkotlin/jvm/JvmSuppressWildcards;", "presentation_debug"})
@dagger.Module(includes = {com.juan.nino.moviesrappiapp.di.ExecutorModule.class, com.juan.nino.moviesrappiapp.di.NetworkModule.class})
public final class AppModule {
    private final com.juan.nino.moviesrappiapp.MoviesRappiApplication application = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.juan.nino.data.source.respositories.PopularMoviesRepositoryImpl providePopularMoviesRepository(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    com.juan.nino.data.source.source.MoviesApi api, @org.jetbrains.annotations.NotNull()
    com.juan.nino.data.db.dao.PopularMoviesDao dao, @org.jetbrains.annotations.NotNull()
    com.juan.nino.data.platform.NetworkHandler networkHandler) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.juan.nino.data.respositories.RatedMoviesRepositoryImpl provideRatedMoviesRepository(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    com.juan.nino.data.source.source.MoviesApi api, @org.jetbrains.annotations.NotNull()
    com.juan.nino.data.db.dao.RatedMoviesDao dao, @org.jetbrains.annotations.NotNull()
    com.juan.nino.data.platform.NetworkHandler networkHandler) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.juan.nino.data.respositories.UpcomingMoviesRepositoryImpl provideUpcomingMoviesRepository(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    com.juan.nino.data.source.source.MoviesApi api, @org.jetbrains.annotations.NotNull()
    com.juan.nino.data.db.dao.UpcomingMoviesDao dao, @org.jetbrains.annotations.NotNull()
    com.juan.nino.data.platform.NetworkHandler networkHandler) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.juan.nino.domain.interactor.usecases.PopularMoviesUseCase providePopularMoviesUsecase(@org.jetbrains.annotations.NotNull()
    com.juan.nino.data.source.respositories.PopularMoviesRepositoryImpl popularMoviesRepositoryImpl, @org.jetbrains.annotations.NotNull()
    com.juan.nino.domain.executor.ThreadExecutor threadExecutor, @org.jetbrains.annotations.NotNull()
    com.juan.nino.domain.executor.PostExecutionThread postExecutionThread) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.juan.nino.domain.interactor.usecases.RatedMoviesUseCase provideRatedMoviesUsecase(@org.jetbrains.annotations.NotNull()
    com.juan.nino.data.respositories.RatedMoviesRepositoryImpl ratedMoviesRepositoryImpl, @org.jetbrains.annotations.NotNull()
    com.juan.nino.domain.executor.ThreadExecutor threadExecutor, @org.jetbrains.annotations.NotNull()
    com.juan.nino.domain.executor.PostExecutionThread postExecutionThread) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.juan.nino.domain.interactor.usecases.UpcomingMoviesUseCase provideUpcomingMoviesUsecase(@org.jetbrains.annotations.NotNull()
    com.juan.nino.data.respositories.UpcomingMoviesRepositoryImpl upcomingMoviesRepositoryImpl, @org.jetbrains.annotations.NotNull()
    com.juan.nino.domain.executor.ThreadExecutor threadExecutor, @org.jetbrains.annotations.NotNull()
    com.juan.nino.domain.executor.PostExecutionThread postExecutionThread) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final androidx.lifecycle.ViewModelProvider.Factory provideViewModelFactory(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Class<? extends androidx.lifecycle.ViewModel>, javax.inject.Provider<androidx.lifecycle.ViewModel>> providers) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final androidx.navigation.NavController provideNavigatorController(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.juan.nino.data.db.dao.PopularMoviesDao providePopularMoviesDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.juan.nino.data.db.dao.RatedMoviesDao provideRatedMoviesDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.juan.nino.data.db.dao.UpcomingMoviesDao provideUpcomingMoviesDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.juan.nino.moviesrappiapp.view_model.PopularMoviesViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Provides()
    public final androidx.lifecycle.ViewModel providePopularMoviesViewModel(@org.jetbrains.annotations.NotNull()
    com.juan.nino.domain.interactor.usecases.PopularMoviesUseCase popularMoviesUseCase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.juan.nino.moviesrappiapp.view_model.RatedMoviesViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Provides()
    public final androidx.lifecycle.ViewModel provideRatedMoviesViewModel(@org.jetbrains.annotations.NotNull()
    com.juan.nino.domain.interactor.usecases.RatedMoviesUseCase ratedMoviesUseCase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.juan.nino.moviesrappiapp.view_model.UpcomingMoviesViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Provides()
    public final androidx.lifecycle.ViewModel provideUpcomingMoviesViewModel(@org.jetbrains.annotations.NotNull()
    com.juan.nino.domain.interactor.usecases.UpcomingMoviesUseCase upcomingMoviesUseCase) {
        return null;
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.MoviesRappiApplication application) {
        super();
    }
}