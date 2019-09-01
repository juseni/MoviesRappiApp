package com.juan.nino.moviesrappiapp.view_model;

import java.lang.System;

/**
 * @author Juan Sebastian Niño
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/juan/nino/moviesrappiapp/view_model/RatedMoviesViewModel;", "Lcom/juan/nino/moviesrappiapp/view_model/base/BaseViewModel;", "ratedMoviesUseCase", "Lcom/juan/nino/domain/interactor/usecases/RatedMoviesUseCase;", "(Lcom/juan/nino/domain/interactor/usecases/RatedMoviesUseCase;)V", "ratedMoviesResponse", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/juan/nino/moviesrappiapp/model/MovieModel;", "getMovieInformation", "Landroidx/lifecycle/LiveData;", "Lcom/juan/nino/moviesrappiapp/model/MoviesInformationModel;", "getRatedMovies", "loadRatedMovies", "", "page", "", "loadRatedMoviesSearch", "presentation_debug"})
public final class RatedMoviesViewModel extends com.juan.nino.moviesrappiapp.view_model.base.BaseViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.juan.nino.moviesrappiapp.model.MovieModel>> ratedMoviesResponse = null;
    private final com.juan.nino.domain.interactor.usecases.RatedMoviesUseCase ratedMoviesUseCase = null;
    
    public final void loadRatedMovies(int page) {
    }
    
    public final void loadRatedMoviesSearch() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.juan.nino.moviesrappiapp.model.MovieModel>> getRatedMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.juan.nino.moviesrappiapp.model.MoviesInformationModel> getMovieInformation() {
        return null;
    }
    
    public RatedMoviesViewModel(@org.jetbrains.annotations.NotNull()
    com.juan.nino.domain.interactor.usecases.RatedMoviesUseCase ratedMoviesUseCase) {
        super();
    }
}