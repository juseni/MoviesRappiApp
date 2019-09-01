package com.juan.nino.moviesrappiapp.di;

import java.lang.System;

/**
 * @author Juan Sebastian Niño
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/juan/nino/moviesrappiapp/di/AppComponent;", "", "inject", "", "popularMoviesFragment", "Lcom/juan/nino/moviesrappiapp/ui/view/fragment/popular/PopularMoviesFragment;", "topRatedMoviesFragment", "Lcom/juan/nino/moviesrappiapp/ui/view/fragment/topRated/TopRatedMoviesFragment;", "upcomingMoviesFragment", "Lcom/juan/nino/moviesrappiapp/ui/view/fragment/upcoming/UpcomingMoviesFragment;", "searchMovieActivity", "Lcom/juan/nino/moviesrappiapp/ui/view/search/SearchMovieActivity;", "presentation_debug"})
@dagger.Component(modules = {com.juan.nino.moviesrappiapp.di.AppModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.ui.view.fragment.popular.PopularMoviesFragment popularMoviesFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.ui.view.fragment.topRated.TopRatedMoviesFragment topRatedMoviesFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.ui.view.fragment.upcoming.UpcomingMoviesFragment upcomingMoviesFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.ui.view.search.SearchMovieActivity searchMovieActivity);
}