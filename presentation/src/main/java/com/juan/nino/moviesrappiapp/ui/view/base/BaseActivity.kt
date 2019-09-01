package com.juan.nino.moviesrappiapp.ui.view.base

import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.juan.nino.moviesrappiapp.MoviesRappiApplication
import com.juan.nino.moviesrappiapp.di.AppComponent
import com.juan.nino.moviesrappiapp.utils.startAnimationLoading
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View

/**
 * @author Juan Sebastian Niño
 */
open class BaseActivity : AppCompatActivity() {
    protected val appComponent: AppComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        (application as MoviesRappiApplication).appComponent
    }

    fun showLoading(show: Boolean) {
        when(show) {
            true -> loadingApp.visibility = VISIBLE
            false -> loadingApp.visibility = GONE
        }
    }

    fun showError(show: Boolean) {
        when(show) {
            true -> errorApp.visibility = VISIBLE
            false -> errorApp.visibility = GONE
        }
    }

    fun showMovies(show: Boolean) {
        when(show) {
            true -> moviesContainer.visibility = VISIBLE
            false -> moviesContainer.visibility = GONE
        }
    }

    fun showLoadingMoreMovies(show: Boolean) {
        when(show) {
            true -> {
                progressBarMovies.visibility = VISIBLE
                startAnimationLoading()
            }
            false -> progressBarMovies.visibility = GONE
        }
    }

    fun showToolBar(show: Boolean) {
        when(show) {
            true -> toolbar.visibility = VISIBLE
            false -> toolbar.visibility = GONE
        }
    }

    fun hideKeyboard() {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        var view = getCurrentFocus()
        if (view == null) {
            view = View(this)
        }
        imm.hideSoftInputFromWindow(view!!.getWindowToken(), 0)
    }

    private fun startAnimationLoading() {
        startAnimationLoading(this, movieLoadingIcon)
    }

}