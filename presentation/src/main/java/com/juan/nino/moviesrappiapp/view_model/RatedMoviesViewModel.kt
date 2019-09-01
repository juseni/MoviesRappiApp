package com.juan.nino.moviesrappiapp.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.juan.nino.domain.interactor.usecases.RatedMoviesUseCase
import com.juan.nino.moviesrappiapp.model.MovieModel
import com.juan.nino.moviesrappiapp.view_model.base.BaseViewModel
import com.juan.nino.moviesrappiapp.model.MovieModel.Companion.transformMovie
import com.juan.nino.moviesrappiapp.model.MoviesInformationModel
import com.juan.nino.moviesrappiapp.model.MoviesInformationModel.Companion.transform
import java.lang.IllegalArgumentException

/**
 * @author Juan Sebastian Niño
 */
class RatedMoviesViewModel(private val ratedMoviesUseCase: RatedMoviesUseCase) : BaseViewModel() {

    private val ratedMoviesResponse = MutableLiveData<List<MovieModel>>()

    fun loadRatedMovies(page: Int) {
        disposables.add(
            ratedMoviesUseCase.execute(page)
                .subscribe({
                    if (it.results.isEmpty()) {
                        loadErrorScreen()
                    } else {
                        moviesInformation.value = transform(it)
                        ratedMoviesResponse.value = transformMovie(it.results)
                        loadSuccessScreen()
                    }
                } , {
                   loadErrorScreen()
                })
        )
    }

    fun loadRatedMoviesSearch() {
        disposables.add(
            ratedMoviesUseCase.executeSearch()
                .subscribe({
                    ratedMoviesResponse.value = transformMovie(it.results)
                }, {
                    throw IllegalArgumentException("Invalid type")
                })
        )
    }

    fun getRatedMovies(): LiveData<List<MovieModel>> = ratedMoviesResponse

    fun getMovieInformation(): LiveData<MoviesInformationModel> = moviesInformation
}