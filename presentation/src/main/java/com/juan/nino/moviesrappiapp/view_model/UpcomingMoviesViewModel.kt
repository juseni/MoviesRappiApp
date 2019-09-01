package com.juan.nino.moviesrappiapp.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.juan.nino.domain.interactor.usecases.UpcomingMoviesUseCase
import com.juan.nino.moviesrappiapp.model.MovieModel
import com.juan.nino.moviesrappiapp.view_model.base.BaseViewModel
import com.juan.nino.moviesrappiapp.model.MovieModel.Companion.transformMovie
import com.juan.nino.moviesrappiapp.model.MoviesInformationModel
import com.juan.nino.moviesrappiapp.model.MoviesInformationModel.Companion.transform
import java.lang.IllegalArgumentException

/**
 * @author Juan Sebastian Niño
 */
class UpcomingMoviesViewModel(private val upcomingMoviesUseCase: UpcomingMoviesUseCase) : BaseViewModel() {

    private val upcomingMoviesResponse = MutableLiveData<List<MovieModel>>()

    fun loadUpcomingMovies(page: Int) {
        disposables.add(
            upcomingMoviesUseCase.execute(page)
                .subscribe({
                    if (it.results.isEmpty()) {
                        loadErrorScreen()
                    } else {
                        moviesInformation.value = transform(it)
                        upcomingMoviesResponse.value = transformMovie(it.results)
                        loadSuccessScreen()
                    }
                } , {
                    loadErrorScreen()
                })
        )
    }

    fun loadUpcomingMoviesSearch() {
        disposables.add(
            upcomingMoviesUseCase.executeSearch()
                .subscribe({
                    upcomingMoviesResponse.value = transformMovie(it.results)
                }, {
                    throw IllegalArgumentException("Invalid type")
                })
        )
    }

    fun getUpcomingMovies(): LiveData<List<MovieModel>> = upcomingMoviesResponse

    fun getMovieInformation(): LiveData<MoviesInformationModel> = moviesInformation
}