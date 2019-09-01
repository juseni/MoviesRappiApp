package com.juan.nino.moviesrappiapp.ui.adapter;

import java.lang.System;

/**
 * @author Juan Sebastian Niño
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\u001c\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0013\u001a\u00020\nH\u0016J\u001e\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/juan/nino/moviesrappiapp/ui/adapter/MoviesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/juan/nino/moviesrappiapp/ui/adapter/BaseViewHolder;", "Lcom/juan/nino/moviesrappiapp/model/MovieModel;", "context", "Landroid/content/Context;", "onMovieClickListener", "Lcom/juan/nino/moviesrappiapp/ui/adapter/OnMovieClickListener;", "(Landroid/content/Context;Lcom/juan/nino/moviesrappiapp/ui/adapter/OnMovieClickListener;)V", "movieType", "", "movies", "", "add", "", "movie", "addMovies", "", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removedAndAddMoreMovies", "MovieHolder", "presentation_debug"})
public final class MoviesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.juan.nino.moviesrappiapp.ui.adapter.BaseViewHolder<com.juan.nino.moviesrappiapp.model.MovieModel>> {
    private java.util.List<com.juan.nino.moviesrappiapp.model.MovieModel> movies;
    private int movieType;
    private final android.content.Context context = null;
    private com.juan.nino.moviesrappiapp.ui.adapter.OnMovieClickListener onMovieClickListener;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.juan.nino.moviesrappiapp.ui.adapter.BaseViewHolder<com.juan.nino.moviesrappiapp.model.MovieModel> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.ui.adapter.BaseViewHolder<com.juan.nino.moviesrappiapp.model.MovieModel> holder, int position) {
    }
    
    private final void add(com.juan.nino.moviesrappiapp.model.MovieModel movie) {
    }
    
    public final void addMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> movies, int movieType) {
    }
    
    private final void removedAndAddMoreMovies(int position) {
    }
    
    public MoviesAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.ui.adapter.OnMovieClickListener onMovieClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/juan/nino/moviesrappiapp/ui/adapter/MoviesAdapter$MovieHolder;", "Lcom/juan/nino/moviesrappiapp/ui/adapter/BaseViewHolder;", "Lcom/juan/nino/moviesrappiapp/model/MovieModel;", "context", "Landroid/content/Context;", "itemView", "Landroid/view/View;", "movies", "", "onMovieClick", "Lcom/juan/nino/moviesrappiapp/ui/adapter/OnMovieClickListener;", "(Lcom/juan/nino/moviesrappiapp/ui/adapter/MoviesAdapter;Landroid/content/Context;Landroid/view/View;Ljava/util/List;Lcom/juan/nino/moviesrappiapp/ui/adapter/OnMovieClickListener;)V", "onBind", "", "item", "presentation_debug"})
    public final class MovieHolder extends com.juan.nino.moviesrappiapp.ui.adapter.BaseViewHolder<com.juan.nino.moviesrappiapp.model.MovieModel> {
        private final android.content.Context context = null;
        private final com.juan.nino.moviesrappiapp.ui.adapter.OnMovieClickListener onMovieClick = null;
        
        @java.lang.Override()
        public void onBind(@org.jetbrains.annotations.NotNull()
        com.juan.nino.moviesrappiapp.model.MovieModel item) {
        }
        
        public MovieHolder(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        android.view.View itemView, @org.jetbrains.annotations.Nullable()
        java.util.List<com.juan.nino.moviesrappiapp.model.MovieModel> movies, @org.jetbrains.annotations.Nullable()
        com.juan.nino.moviesrappiapp.ui.adapter.OnMovieClickListener onMovieClick) {
            super(null);
        }
    }
}