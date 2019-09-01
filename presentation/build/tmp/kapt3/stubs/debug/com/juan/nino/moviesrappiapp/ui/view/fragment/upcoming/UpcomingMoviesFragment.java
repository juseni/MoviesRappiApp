package com.juan.nino.moviesrappiapp.ui.view.fragment.upcoming;

import java.lang.System;

/**
 * @author Juan Sebastian Niño
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0002J\b\u0010\u001d\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/juan/nino/moviesrappiapp/ui/view/fragment/upcoming/UpcomingMoviesFragment;", "Lcom/juan/nino/moviesrappiapp/ui/view/base/BaseFragment;", "Lcom/juan/nino/moviesrappiapp/ui/adapter/OnMovieClickListener;", "()V", "viewModel", "Lcom/juan/nino/moviesrappiapp/view_model/UpcomingMoviesViewModel;", "vmFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getVmFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setVmFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getPage", "", "loadUpcomingMoviesWithPage", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onMovieClicked", "itemView", "Lcom/juan/nino/moviesrappiapp/model/MovieModel;", "setupObservers", "setupViews", "presentation_debug"})
public final class UpcomingMoviesFragment extends com.juan.nino.moviesrappiapp.ui.view.base.BaseFragment implements com.juan.nino.moviesrappiapp.ui.adapter.OnMovieClickListener {
    private com.juan.nino.moviesrappiapp.view_model.UpcomingMoviesViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory vmFactory;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getVmFactory() {
        return null;
    }
    
    public final void setVmFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViews() {
    }
    
    private final void getPage() {
    }
    
    private final void loadUpcomingMoviesWithPage() {
    }
    
    private final void setupObservers() {
    }
    
    @java.lang.Override()
    public void onMovieClicked(@org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.model.MovieModel itemView) {
    }
    
    public UpcomingMoviesFragment() {
        super();
    }
}