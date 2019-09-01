package com.juan.nino.moviesrappiapp.ui.view.base

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.juan.nino.moviesrappiapp.MoviesRappiApplication
import com.juan.nino.moviesrappiapp.di.AppComponent
import androidx.recyclerview.widget.GridLayoutManager
import com.juan.nino.moviesrappiapp.R
import com.juan.nino.moviesrappiapp.model.MovieModel
import com.juan.nino.moviesrappiapp.ui.adapter.MoviesAdapter
import com.juan.nino.moviesrappiapp.ui.view.fragment.popular.PopularMoviesFragmentDirections
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.DEFAULT_PAGE
import jp.wasabeef.recyclerview.animators.LandingAnimator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_detail_movie.*
import kotlinx.android.synthetic.main.fragment_movie_list.*

/**
 * @author Juan Sebastian Niño
 */
open class BaseFragment : Fragment() {

    protected lateinit var baseActivity: BaseActivity
    protected var adapter: MoviesAdapter? = null
    protected var popularMovies = ArrayList<MovieModel>()
    protected var ratedMovies = ArrayList<MovieModel>()
    protected var upcomingMovies = ArrayList<MovieModel>()
    protected var isRefreshed = false
    protected var nextPage = DEFAULT_PAGE
    protected var maxPages = DEFAULT_PAGE + 1

    protected val appComponent: AppComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        (activity?.application as MoviesRappiApplication).appComponent
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is BaseActivity) {
            baseActivity = context
        }
    }

    protected fun showLoading(show: Boolean) {
        baseActivity.showLoading(show)
    }

    protected fun showError(show: Boolean) {
        baseActivity.showError(show)
    }

    protected fun showMovies(show: Boolean) {
        baseActivity.showMovies(show)
    }

    protected fun showLoadingMoreMovies(show: Boolean) {
       baseActivity.showLoadingMoreMovies(show)
    }

    protected fun setupMoviesAdapter(mAdapter: MoviesAdapter,
                                     mLayoutManager: GridLayoutManager) {
        with(recyclerViewMovies) {
            layoutManager = mLayoutManager
            itemAnimator = LandingAnimator()
            adapter = mAdapter
            invalidate()
        }
    }

    protected fun showMainToolBar(show: Boolean) {
        baseActivity.showToolBar(show)
    }

    protected fun showMovieDetails(navDirections: NavDirections) {
        showLoadingMoreMovies(false)
        Navigation.findNavController(baseActivity, R.id.navHostFragment).navigate(navDirections)
    }

}