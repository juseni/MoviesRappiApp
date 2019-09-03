package com.juan.nino.moviesrappiapp.ui.view.fragment.topRated;

import java.lang.System;

/**
 * @author Juan Sebastian Niño
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020\u0013H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006$"}, d2 = {"Lcom/juan/nino/moviesrappiapp/ui/view/fragment/topRated/TopRatedMoviesFragment;", "Lcom/juan/nino/moviesrappiapp/ui/view/base/BaseFragment;", "Lcom/juan/nino/moviesrappiapp/ui/adapter/OnMovieClickListener;", "()V", "networkHandler", "Lcom/juan/nino/data/platform/NetworkHandler;", "getNetworkHandler", "()Lcom/juan/nino/data/platform/NetworkHandler;", "setNetworkHandler", "(Lcom/juan/nino/data/platform/NetworkHandler;)V", "viewModel", "Lcom/juan/nino/moviesrappiapp/view_model/RatedMoviesViewModel;", "vmFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getVmFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setVmFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getPage", "", "loadRatedMoviesWithPage", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onMovieClicked", "itemView", "Lcom/juan/nino/moviesrappiapp/model/MovieModel;", "setupObservers", "setupViews", "presentation_debug"})
public final class TopRatedMoviesFragment extends com.juan.nino.moviesrappiapp.ui.view.base.BaseFragment implements com.juan.nino.moviesrappiapp.ui.adapter.OnMovieClickListener {
    private com.juan.nino.moviesrappiapp.view_model.RatedMoviesViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory vmFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.juan.nino.data.platform.NetworkHandler networkHandler;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getVmFactory() {
        return null;
    }
    
    public final void setVmFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.juan.nino.data.platform.NetworkHandler getNetworkHandler() {
        return null;
    }
    
    public final void setNetworkHandler(@org.jetbrains.annotations.NotNull()
    com.juan.nino.data.platform.NetworkHandler p0) {
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
    
    private final void loadRatedMoviesWithPage() {
    }
    
    private final void setupObservers() {
    }
    
    @java.lang.Override()
    public void onMovieClicked(@org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.model.MovieModel itemView) {
    }
    
    public TopRatedMoviesFragment() {
        super();
    }
}