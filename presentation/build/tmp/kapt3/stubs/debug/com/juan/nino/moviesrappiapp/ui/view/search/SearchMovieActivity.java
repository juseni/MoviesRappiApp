package com.juan.nino.moviesrappiapp.ui.view.search;

import java.lang.System;

/**
 * @author Juan Sebastian Niño
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019H\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001cH\u0016J\u0012\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u001cH\u0016J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0016J\u0012\u0010\'\u001a\u00020\u001c2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001c\u0010*\u001a\u00020\u001c2\b\u0010+\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010-\u001a\u00020\u001c2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020\u001cH\u0002J\b\u00101\u001a\u00020\u001cH\u0002J\b\u00102\u001a\u00020\u001cH\u0002J\u0018\u00103\u001a\u00020\u001c2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020&\u0018\u000105H\u0002J\b\u00106\u001a\u00020\u001cH\u0002J\b\u00107\u001a\u00020\u001cH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u00068"}, d2 = {"Lcom/juan/nino/moviesrappiapp/ui/view/search/SearchMovieActivity;", "Lcom/juan/nino/moviesrappiapp/ui/view/base/BaseActivity;", "Lcom/arlib/floatingsearchview/FloatingSearchView$OnSearchListener;", "Lcom/juan/nino/moviesrappiapp/ui/adapter/OnMovieClickListener;", "Lcom/arlib/floatingsearchview/FloatingSearchView$OnQueryChangeListener;", "Lcom/arlib/floatingsearchview/FloatingSearchView$OnHomeActionClickListener;", "Lcom/arlib/floatingsearchview/FloatingSearchView$OnMenuItemClickListener;", "()V", "movieType", "", "popularMoviesViewModel", "Lcom/juan/nino/moviesrappiapp/view_model/PopularMoviesViewModel;", "ratedMoviesViewModel", "Lcom/juan/nino/moviesrappiapp/view_model/RatedMoviesViewModel;", "searchAdapter", "Lcom/juan/nino/moviesrappiapp/ui/adapter/SearchMoviesAdapter;", "upcomingMoviesViewModel", "Lcom/juan/nino/moviesrappiapp/view_model/UpcomingMoviesViewModel;", "vmFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getVmFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setVmFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getSearchViewHint", "", "kotlin.jvm.PlatformType", "onActionMenuItemSelected", "", "item", "Landroid/view/MenuItem;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onHomeClicked", "onMovieClicked", "itemView", "Lcom/juan/nino/moviesrappiapp/model/MovieModel;", "onSearchAction", "currentQuery", "", "onSearchTextChanged", "oldQuery", "newQuery", "onSuggestionClicked", "searchSuggestion", "Lcom/arlib/floatingsearchview/suggestions/model/SearchSuggestion;", "setupObservers", "setupPopularMovies", "setupRatedMovies", "setupRecyclerView", "moviesToFilter", "", "setupSearchView", "setupUpcomingMovies", "presentation_debug"})
public final class SearchMovieActivity extends com.juan.nino.moviesrappiapp.ui.view.base.BaseActivity implements com.arlib.floatingsearchview.FloatingSearchView.OnSearchListener, com.juan.nino.moviesrappiapp.ui.adapter.OnMovieClickListener, com.arlib.floatingsearchview.FloatingSearchView.OnQueryChangeListener, com.arlib.floatingsearchview.FloatingSearchView.OnHomeActionClickListener, com.arlib.floatingsearchview.FloatingSearchView.OnMenuItemClickListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory vmFactory;
    private com.juan.nino.moviesrappiapp.view_model.PopularMoviesViewModel popularMoviesViewModel;
    private com.juan.nino.moviesrappiapp.view_model.RatedMoviesViewModel ratedMoviesViewModel;
    private com.juan.nino.moviesrappiapp.view_model.UpcomingMoviesViewModel upcomingMoviesViewModel;
    private com.juan.nino.moviesrappiapp.ui.adapter.SearchMoviesAdapter searchAdapter;
    private int movieType;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getVmFactory() {
        return null;
    }
    
    public final void setVmFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupSearchView() {
    }
    
    private final java.lang.CharSequence getSearchViewHint() {
        return null;
    }
    
    private final void setupObservers() {
    }
    
    private final void setupPopularMovies() {
    }
    
    private final void setupRatedMovies() {
    }
    
    private final void setupUpcomingMovies() {
    }
    
    private final void setupRecyclerView(java.util.List<com.juan.nino.moviesrappiapp.model.MovieModel> moviesToFilter) {
    }
    
    @java.lang.Override()
    public void onSearchAction(@org.jetbrains.annotations.Nullable()
    java.lang.String currentQuery) {
    }
    
    @java.lang.Override()
    public void onSuggestionClicked(@org.jetbrains.annotations.Nullable()
    com.arlib.floatingsearchview.suggestions.model.SearchSuggestion searchSuggestion) {
    }
    
    @java.lang.Override()
    public void onSearchTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.String oldQuery, @org.jetbrains.annotations.Nullable()
    java.lang.String newQuery) {
    }
    
    @java.lang.Override()
    public void onHomeClicked() {
    }
    
    @java.lang.Override()
    public void onActionMenuItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
    }
    
    @java.lang.Override()
    public void onMovieClicked(@org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.model.MovieModel itemView) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public SearchMovieActivity() {
        super();
    }
}