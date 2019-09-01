package com.juan.nino.moviesrappiapp.view_model.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.juan.nino.moviesrappiapp.model.MoviesInformationModel
import io.reactivex.disposables.CompositeDisposable

/**
 * @author Juan Sebastian Niño
 */
open class BaseViewModel : ViewModel() {

    val isLoading = MutableLiveData<Boolean>()
    val isError = MutableLiveData<Boolean>()
    val showMovies = MutableLiveData<Boolean>()
    val moviesInformation = MutableLiveData<MoviesInformationModel>()
    protected val disposables = CompositeDisposable()

    init {
        resetStatus()
    }

    private fun resetStatus() {
        isLoading.value = true
        isError.value = false
        showMovies.value = false
    }


    override fun onCleared() {
        super.onCleared()
        disposables.dispose()
    }

    protected fun loadErrorScreen() {
        showMovies.value = false
        isLoading.value = false
        isError.value = true
    }

    protected fun loadSuccessScreen() {
        isLoading.value = false
        isError.value = false
        showMovies.value = true
    }

}