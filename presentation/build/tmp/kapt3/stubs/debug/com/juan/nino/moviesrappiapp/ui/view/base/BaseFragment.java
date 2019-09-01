package com.juan.nino.moviesrappiapp.ui.view.base;

import java.lang.System;

/**
 * @author Juan Sebastian Niño
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0018\u00104\u001a\u0002012\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u000207H\u0004J\u0010\u00108\u001a\u0002012\u0006\u00109\u001a\u00020\u0016H\u0004J\u0010\u0010:\u001a\u0002012\u0006\u00109\u001a\u00020\u0016H\u0004J\u0010\u0010;\u001a\u0002012\u0006\u00109\u001a\u00020\u0016H\u0004J\u0010\u0010<\u001a\u0002012\u0006\u00109\u001a\u00020\u0016H\u0004J\u0010\u0010=\u001a\u0002012\u0006\u0010>\u001a\u00020?H\u0004J\u0010\u0010@\u001a\u0002012\u0006\u00109\u001a\u00020\u0016H\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR \u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R \u0010*\u001a\b\u0012\u0004\u0012\u00020%0$X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\'\"\u0004\b,\u0010)R \u0010-\u001a\b\u0012\u0004\u0012\u00020%0$X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\'\"\u0004\b/\u0010)\u00a8\u0006A"}, d2 = {"Lcom/juan/nino/moviesrappiapp/ui/view/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/juan/nino/moviesrappiapp/ui/adapter/MoviesAdapter;", "getAdapter", "()Lcom/juan/nino/moviesrappiapp/ui/adapter/MoviesAdapter;", "setAdapter", "(Lcom/juan/nino/moviesrappiapp/ui/adapter/MoviesAdapter;)V", "appComponent", "Lcom/juan/nino/moviesrappiapp/di/AppComponent;", "getAppComponent", "()Lcom/juan/nino/moviesrappiapp/di/AppComponent;", "appComponent$delegate", "Lkotlin/Lazy;", "baseActivity", "Lcom/juan/nino/moviesrappiapp/ui/view/base/BaseActivity;", "getBaseActivity", "()Lcom/juan/nino/moviesrappiapp/ui/view/base/BaseActivity;", "setBaseActivity", "(Lcom/juan/nino/moviesrappiapp/ui/view/base/BaseActivity;)V", "isRefreshed", "", "()Z", "setRefreshed", "(Z)V", "maxPages", "", "getMaxPages", "()I", "setMaxPages", "(I)V", "nextPage", "getNextPage", "setNextPage", "popularMovies", "Ljava/util/ArrayList;", "Lcom/juan/nino/moviesrappiapp/model/MovieModel;", "getPopularMovies", "()Ljava/util/ArrayList;", "setPopularMovies", "(Ljava/util/ArrayList;)V", "ratedMovies", "getRatedMovies", "setRatedMovies", "upcomingMovies", "getUpcomingMovies", "setUpcomingMovies", "onAttach", "", "context", "Landroid/content/Context;", "setupMoviesAdapter", "mAdapter", "mLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "showError", "show", "showLoading", "showLoadingMoreMovies", "showMainToolBar", "showMovieDetails", "navDirections", "Landroidx/navigation/NavDirections;", "showMovies", "presentation_debug"})
public class BaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    protected com.juan.nino.moviesrappiapp.ui.view.base.BaseActivity baseActivity;
    @org.jetbrains.annotations.Nullable()
    private com.juan.nino.moviesrappiapp.ui.adapter.MoviesAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.juan.nino.moviesrappiapp.model.MovieModel> popularMovies;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.juan.nino.moviesrappiapp.model.MovieModel> ratedMovies;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.juan.nino.moviesrappiapp.model.MovieModel> upcomingMovies;
    private boolean isRefreshed;
    private int nextPage;
    private int maxPages;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appComponent$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.juan.nino.moviesrappiapp.ui.view.base.BaseActivity getBaseActivity() {
        return null;
    }
    
    protected final void setBaseActivity(@org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.ui.view.base.BaseActivity p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.juan.nino.moviesrappiapp.ui.adapter.MoviesAdapter getAdapter() {
        return null;
    }
    
    protected final void setAdapter(@org.jetbrains.annotations.Nullable()
    com.juan.nino.moviesrappiapp.ui.adapter.MoviesAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<com.juan.nino.moviesrappiapp.model.MovieModel> getPopularMovies() {
        return null;
    }
    
    protected final void setPopularMovies(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.juan.nino.moviesrappiapp.model.MovieModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<com.juan.nino.moviesrappiapp.model.MovieModel> getRatedMovies() {
        return null;
    }
    
    protected final void setRatedMovies(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.juan.nino.moviesrappiapp.model.MovieModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<com.juan.nino.moviesrappiapp.model.MovieModel> getUpcomingMovies() {
        return null;
    }
    
    protected final void setUpcomingMovies(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.juan.nino.moviesrappiapp.model.MovieModel> p0) {
    }
    
    protected final boolean isRefreshed() {
        return false;
    }
    
    protected final void setRefreshed(boolean p0) {
    }
    
    protected final int getNextPage() {
        return 0;
    }
    
    protected final void setNextPage(int p0) {
    }
    
    protected final int getMaxPages() {
        return 0;
    }
    
    protected final void setMaxPages(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.juan.nino.moviesrappiapp.di.AppComponent getAppComponent() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    protected final void showLoading(boolean show) {
    }
    
    protected final void showError(boolean show) {
    }
    
    protected final void showMovies(boolean show) {
    }
    
    protected final void showLoadingMoreMovies(boolean show) {
    }
    
    protected final void setupMoviesAdapter(@org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.ui.adapter.MoviesAdapter mAdapter, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.GridLayoutManager mLayoutManager) {
    }
    
    protected final void showMainToolBar(boolean show) {
    }
    
    protected final void showMovieDetails(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavDirections navDirections) {
    }
    
    public BaseFragment() {
        super();
    }
}