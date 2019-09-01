package com.juan.nino.moviesrappiapp.ui.view.base

import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import android.transition.Slide
import android.view.*
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.juan.nino.moviesrappiapp.R
import javax.inject.Inject
import android.view.View.OnClickListener
import androidx.navigation.*
import com.arlib.floatingsearchview.FloatingSearchView.OnFocusChangeListener
import com.juan.nino.moviesrappiapp.ui.view.fragment.popular.PopularMoviesFragment
import com.juan.nino.moviesrappiapp.ui.view.fragment.topRated.TopRatedMoviesFragment
import com.juan.nino.moviesrappiapp.ui.view.fragment.upcoming.UpcomingMoviesFragment
import com.juan.nino.moviesrappiapp.ui.view.search.SearchMovieActivity
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.MOVIE_TYPE_KEY
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.POPULAR_MOVIES_TYPE
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.RATED_MOVIES_TYPE
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.SEARCH_ACTIVITY_REQUEST
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.UPCOMING_MOVIES_TYPE
import kotlinx.android.synthetic.main.activity_main.*
import com.juan.nino.moviesrappiapp.model.MovieModel
import com.juan.nino.moviesrappiapp.ui.view.fragment.popular.PopularMoviesFragmentDirections
import com.juan.nino.moviesrappiapp.ui.view.fragment.topRated.TopRatedMoviesFragmentDirections
import com.juan.nino.moviesrappiapp.ui.view.fragment.upcoming.UpcomingMoviesFragmentDirections
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.MOVIE_SELECTED_KEY
import com.juan.nino.moviesrappiapp.utils.showSnackInformation
import com.juan.nino.moviesrappiapp.utils.startAnimationLoading

/**
 * @author Juan Sebastian Niño
 */
class MainActivity : BaseActivity(), OnClickListener, OnFocusChangeListener {

    @Inject
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        window.exitTransition = Slide(Gravity.LEFT)
        window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimary)

        setupViews()
    }

    private fun setupViews() {
        navController = findNavController(R.id.navHostFragment)
        findViewById<BottomNavigationView>(R.id.bottomNavigationMovies).setupWithNavController(navController)

        tryAgainButton.setOnClickListener(this@MainActivity)
        searchMovie.setOnFocusChangeListener(this@MainActivity)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        searchMovie.clearSearchFocus()
        hideKeyboard()
        if (requestCode == SEARCH_ACTIVITY_REQUEST && resultCode == RESULT_OK && data != null) {
            data.let {
                val movieType = it.getIntExtra(MOVIE_TYPE_KEY, POPULAR_MOVIES_TYPE)
                val movie = it.getParcelableExtra<MovieModel>(MOVIE_SELECTED_KEY)
                onMovieDetailsForSearching(movieType, movie)
            }
        }
    }

    private fun onMovieDetailsForSearching(movieType: Int, movie: MovieModel) {
        try {
            val actionDetail = getFragmentActionDetail(movieType, movie)
            Navigation.findNavController(this@MainActivity, R.id.navHostFragment).navigate(actionDetail)
            overridePendingTransition(R.animator.slide_up_in, R.animator.slide_up_out)
        } catch (e: Exception) {
            navController.navigate(R.id.actionPopular)
        }
    }

    private fun getCurrentFragment() =
        when (navHostFragment.childFragmentManager.primaryNavigationFragment) {
            is PopularMoviesFragment -> POPULAR_MOVIES_TYPE
            is TopRatedMoviesFragment -> RATED_MOVIES_TYPE
            is UpcomingMoviesFragment -> UPCOMING_MOVIES_TYPE
            else -> POPULAR_MOVIES_TYPE
        }

    private fun getFragmentActionDetail(movieType: Int, movie: MovieModel) =
        when(movieType) {
            POPULAR_MOVIES_TYPE -> PopularMoviesFragmentDirections.actionDetail(movie)
            RATED_MOVIES_TYPE -> TopRatedMoviesFragmentDirections.actionDetail(movie)
            UPCOMING_MOVIES_TYPE -> UpcomingMoviesFragmentDirections.actionDetail(movie)
            else -> PopularMoviesFragmentDirections.actionDetail(movie)
        }


    private fun goToSearchActivity() {
        val intent =  Intent(this, SearchMovieActivity::class.java)
        intent.putExtra(MOVIE_TYPE_KEY, getCurrentFragment())

        startActivityForResult(intent , SEARCH_ACTIVITY_REQUEST)
        overridePendingTransition(R.animator.fade_in, R.animator.fade_out)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, null)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_about_me -> {
                showSnackInformation(this@MainActivity)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            tryAgainButton.id -> {
                navController.navigate(
                    when (getCurrentFragment()) {
                        POPULAR_MOVIES_TYPE -> R.id.actionPopular
                        RATED_MOVIES_TYPE -> R.id.actionRated
                        UPCOMING_MOVIES_TYPE -> R.id.actionUpcoming
                        else -> R.id.actionPopular
                    }
                )
            }
        }
    }

    override fun onFocusCleared() {
    }

    override fun onFocus() {
        goToSearchActivity()
    }

}
