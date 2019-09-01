package com.juan.nino.moviesrappiapp.ui.adapter;

import java.lang.System;

/**
 * @author Juan Sebastian Niño
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004:\u0001\u001dB1\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\u001e\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/juan/nino/moviesrappiapp/ui/adapter/SearchMoviesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/juan/nino/moviesrappiapp/ui/adapter/BaseViewHolder;", "Lcom/juan/nino/moviesrappiapp/model/MovieModel;", "Landroid/widget/Filterable;", "moviesToFilter", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "movieType", "", "onMovieClickListener", "Lcom/juan/nino/moviesrappiapp/ui/adapter/OnMovieClickListener;", "(Ljava/util/ArrayList;ILcom/juan/nino/moviesrappiapp/ui/adapter/OnMovieClickListener;)V", "moviesFiltered", "getMoviesFiltered", "()Ljava/util/ArrayList;", "setMoviesFiltered", "(Ljava/util/ArrayList;)V", "getFilter", "Landroid/widget/Filter;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SearchViewHolder", "presentation_debug"})
public final class SearchMoviesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.juan.nino.moviesrappiapp.ui.adapter.BaseViewHolder<com.juan.nino.moviesrappiapp.model.MovieModel>> implements android.widget.Filterable {
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.juan.nino.moviesrappiapp.model.MovieModel> moviesFiltered;
    private final java.util.ArrayList<com.juan.nino.moviesrappiapp.model.MovieModel> moviesToFilter = null;
    private final int movieType = 0;
    private final com.juan.nino.moviesrappiapp.ui.adapter.OnMovieClickListener onMovieClickListener = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.juan.nino.moviesrappiapp.model.MovieModel> getMoviesFiltered() {
        return null;
    }
    
    public final void setMoviesFiltered(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.juan.nino.moviesrappiapp.model.MovieModel> p0) {
    }
    
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    public SearchMoviesAdapter(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.juan.nino.moviesrappiapp.model.MovieModel> moviesToFilter, int movieType, @org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.ui.adapter.OnMovieClickListener onMovieClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/juan/nino/moviesrappiapp/ui/adapter/SearchMoviesAdapter$SearchViewHolder;", "Lcom/juan/nino/moviesrappiapp/ui/adapter/BaseViewHolder;", "Lcom/juan/nino/moviesrappiapp/model/MovieModel;", "context", "Landroid/content/Context;", "itemView", "Landroid/view/View;", "onMovieClickListener", "Lcom/juan/nino/moviesrappiapp/ui/adapter/OnMovieClickListener;", "(Lcom/juan/nino/moviesrappiapp/ui/adapter/SearchMoviesAdapter;Landroid/content/Context;Landroid/view/View;Lcom/juan/nino/moviesrappiapp/ui/adapter/OnMovieClickListener;)V", "onBind", "", "item", "presentation_debug"})
    public final class SearchViewHolder extends com.juan.nino.moviesrappiapp.ui.adapter.BaseViewHolder<com.juan.nino.moviesrappiapp.model.MovieModel> {
        private final android.content.Context context = null;
        private final com.juan.nino.moviesrappiapp.ui.adapter.OnMovieClickListener onMovieClickListener = null;
        
        @java.lang.Override()
        public void onBind(@org.jetbrains.annotations.NotNull()
        com.juan.nino.moviesrappiapp.model.MovieModel item) {
        }
        
        public SearchViewHolder(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.juan.nino.moviesrappiapp.ui.adapter.OnMovieClickListener onMovieClickListener) {
            super(null);
        }
    }
}