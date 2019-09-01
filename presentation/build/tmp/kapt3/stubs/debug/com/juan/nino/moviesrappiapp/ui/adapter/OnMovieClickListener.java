package com.juan.nino.moviesrappiapp.ui.adapter;

import java.lang.System;

/**
 * @author Juan Sebastian Niño
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/juan/nino/moviesrappiapp/ui/adapter/OnMovieClickListener;", "", "onMovieClicked", "", "itemView", "Lcom/juan/nino/moviesrappiapp/model/MovieModel;", "presentation_debug"})
public abstract interface OnMovieClickListener {
    
    public abstract void onMovieClicked(@org.jetbrains.annotations.NotNull()
    com.juan.nino.moviesrappiapp.model.MovieModel itemView);
}