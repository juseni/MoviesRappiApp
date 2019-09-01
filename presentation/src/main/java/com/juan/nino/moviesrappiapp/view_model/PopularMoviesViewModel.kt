package com.juan.nino.moviesrappiapp.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.juan.nino.domain.interactor.usecases.PopularMoviesUseCase
import com.juan.nino.moviesrappiapp.model.MovieModel
import com.juan.nino.moviesrappiapp.view_model.base.BaseViewModel
import com.juan.nino.moviesrappiapp.model.MovieModel.Companion.transformMovie
import com.juan.nino.moviesrappiapp.model.MoviesInformationModel
import com.juan.nino.moviesrappiapp.model.MoviesInformationModel.Companion.transform
import java.lang.IllegalArgumentException

/**
 * @author Juan Sebastian Niño
 */
class PopularMoviesViewModel(private val popularMoviesUseCase: PopularMoviesUseCase) : BaseViewModel() {

    private val popularMoviesResponse = MutableLiveData<List<MovieModel>>()

    fun loadPopularMovies(page: Int) {
        disposables.add(
            popularMoviesUseCase.execute(page)
                .subscribe({
                    if (it.results.isEmpty()) {
                        loadErrorScreen()
                    } else {
                        moviesInformation.value = transform(it)
                        popularMoviesResponse.value = transformMovie(it.results)
                        loadSuccessScreen()
                    }
                }, {
                    loadErrorScreen()
                })
        )
    }

    fun loadPopularMoviesSearch() {
        disposables.add(
            popularMoviesUseCase.executeSearch()
                .subscribe({
                    popularMoviesResponse.value = transformMovie(it.results)
                }, {
                    throw IllegalArgumentException("Invalid type")
                })
        )
    }

    fun getPopularMovies(): LiveData<List<MovieModel>> = popularMoviesResponse

    fun getMovieInformation(): LiveData<MoviesInformationModel> = moviesInformation
}