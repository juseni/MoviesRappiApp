package com.juan.nino.moviesrappiapp.ui.view.search

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.arlib.floatingsearchview.FloatingSearchView.*
import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion
import com.juan.nino.moviesrappiapp.R
import com.juan.nino.moviesrappiapp.model.MovieModel
import com.juan.nino.moviesrappiapp.ui.adapter.OnMovieClickListener
import com.juan.nino.moviesrappiapp.ui.adapter.SearchMoviesAdapter
import com.juan.nino.moviesrappiapp.ui.view.base.BaseActivity
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.MOVIE_SELECTED_KEY
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.MOVIE_TYPE_KEY
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.POPULAR_MOVIES_TYPE
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.RATED_MOVIES_TYPE
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.UPCOMING_MOVIES_TYPE
import com.juan.nino.moviesrappiapp.utils.showSnackInformation
import com.juan.nino.moviesrappiapp.view_model.PopularMoviesViewModel
import com.juan.nino.moviesrappiapp.view_model.RatedMoviesViewModel
import com.juan.nino.moviesrappiapp.view_model.UpcomingMoviesViewModel
import jp.wasabeef.recyclerview.animators.LandingAnimator
import kotlinx.android.synthetic.main.activity_search_movie.*
import javax.inject.Inject

/**
 * @author Juan Sebastian Niño
 */
class SearchMovieActivity : BaseActivity(), OnSearchListener,
    OnMovieClickListener, OnQueryChangeListener, OnHomeActionClickListener, OnMenuItemClickListener {

    @Inject
    lateinit var vmFactory: ViewModelProvider.Factory

    private lateinit var popularMoviesViewModel: PopularMoviesViewModel
    private lateinit var ratedMoviesViewModel: RatedMoviesViewModel
    private lateinit var upcomingMoviesViewModel: UpcomingMoviesViewModel
    private var searchAdapter: SearchMoviesAdapter? = null


    private var movieType: Int = POPULAR_MOVIES_TYPE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this@SearchMovieActivity)
        setContentView(R.layout.activity_search_movie)

        setSupportActionBar(toolbarSearch)

        intent.extras?.let {
            if (it.containsKey(MOVIE_TYPE_KEY)) {
                movieType = it.getInt(MOVIE_TYPE_KEY)
            }
        }

        setupSearchView()

        popularMoviesViewModel = ViewModelProviders.of(this, vmFactory)[PopularMoviesViewModel::class.java]
        ratedMoviesViewModel = ViewModelProviders.of(this, vmFactory)[RatedMoviesViewModel::class.java]
        upcomingMoviesViewModel = ViewModelProviders.of(this, vmFactory)[UpcomingMoviesViewModel::class.java]

        setupObservers()
    }

    private fun setupSearchView() {
        searchMovies.setOnMenuItemClickListener(this@SearchMovieActivity)
        searchMovies.setOnHomeActionClickListener(this@SearchMovieActivity)
        searchMovies.setOnQueryChangeListener(this@SearchMovieActivity)
        searchMovies.setSearchHint(getSearchViewHint().toString())
        searchMovies.setSearchFocused(true)
        searchMovies.setOnSearchListener(this@SearchMovieActivity)
    }

    private fun getSearchViewHint() =
        when(movieType) {
            POPULAR_MOVIES_TYPE -> getString(R.string.searching_text, getText(R.string.popular))
            RATED_MOVIES_TYPE -> getString(R.string.searching_text, getText(R.string.top_rated))
            UPCOMING_MOVIES_TYPE -> getString(R.string.searching_text, getText(R.string.upcoming))
            else -> getText(R.string.search)
        }


    private fun setupObservers(){
        when(movieType) {
            POPULAR_MOVIES_TYPE -> setupPopularMovies()
            RATED_MOVIES_TYPE -> setupRatedMovies()
            UPCOMING_MOVIES_TYPE -> setupUpcomingMovies()
        }
    }

    private fun setupPopularMovies() {
        popularMoviesViewModel.getPopularMovies().observe(this, Observer<List<MovieModel>> { movies ->
            setupRecyclerView(movies)
        })
        popularMoviesViewModel.loadPopularMoviesSearch()
    }

    private fun setupRatedMovies() {
        ratedMoviesViewModel.getRatedMovies().observe(this, Observer<List<MovieModel>> { movies ->
            setupRecyclerView(movies)
        })
        ratedMoviesViewModel.loadRatedMoviesSearch()
    }

    private fun setupUpcomingMovies() {
        upcomingMoviesViewModel.getUpcomingMovies().observe(this, Observer<List<MovieModel>> { movies ->
            setupRecyclerView(movies)
        })
        upcomingMoviesViewModel.loadUpcomingMoviesSearch()
    }

    private fun setupRecyclerView(moviesToFilter: List<MovieModel>?) {
        if (searchAdapter == null) {
            searchAdapter = SearchMoviesAdapter(moviesToFilter as ArrayList<MovieModel>,
                movieType, this@SearchMovieActivity)
        }
        val mLayoutManager = GridLayoutManager(this@SearchMovieActivity,
            MoviesRappiConstants.COLUMN_LINES_ADAPTER)

        with(recyclerViewSearchMovie) {
            layoutManager = mLayoutManager
            itemAnimator = LandingAnimator()
            adapter = searchAdapter
            invalidate()
        }
    }

    override fun onSearchAction(currentQuery: String?) {
        searchAdapter!!.filter.filter(currentQuery)
    }

    override fun onSuggestionClicked(searchSuggestion: SearchSuggestion?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSearchTextChanged(oldQuery: String?, newQuery: String?) {
        searchAdapter!!.filter.filter(newQuery)
    }

    override fun onHomeClicked() {
        onBackPressed()
    }

    override fun onActionMenuItemSelected(item: MenuItem?) {
        when(item!!.itemId) {
            R.id.action_about_me -> {
                showSnackInformation(this@SearchMovieActivity)
            }
        }
    }

    override fun onMovieClicked(itemView: MovieModel) {
        hideKeyboard()
        val intent = Intent()
        intent.putExtra(MOVIE_SELECTED_KEY, itemView)
        intent.putExtra(MOVIE_TYPE_KEY, movieType)
        setResult(Activity.RESULT_OK, intent)
        finish()
        overridePendingTransition(R.animator.back_in, R.animator.back_out)
    }

    override fun onBackPressed() {
        hideKeyboard()
        super.onBackPressed()
        finish()
        overridePendingTransition(R.animator.back_in, R.animator.back_out)
    }
}
