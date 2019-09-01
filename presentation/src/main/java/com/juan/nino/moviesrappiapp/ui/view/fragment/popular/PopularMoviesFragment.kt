package com.juan.nino.moviesrappiapp.ui.view.fragment.popular


import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.juan.nino.moviesrappiapp.R
import com.juan.nino.moviesrappiapp.model.MovieModel
import com.juan.nino.moviesrappiapp.model.MoviesInformationModel
import com.juan.nino.moviesrappiapp.ui.adapter.MoviesAdapter
import com.juan.nino.moviesrappiapp.ui.adapter.OnMovieClickListener
import com.juan.nino.moviesrappiapp.ui.view.base.BaseFragment
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.COLUMN_LINES_ADAPTER
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.POPULAR_MOVIES_TYPE
import com.juan.nino.moviesrappiapp.view_model.PopularMoviesViewModel
import javax.inject.Inject
import kotlinx.android.synthetic.main.fragment_movie_list.*

/**
 * @author Juan Sebastian Niño
 */
class PopularMoviesFragment : BaseFragment(), OnMovieClickListener {

    private lateinit var viewModel: PopularMoviesViewModel

    @Inject
    lateinit var vmFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_popular_movies, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        showMainToolBar(true)
        super.onActivityCreated(savedInstanceState)
        setupViews()
        setupObservers()
    }

    private fun setupObservers() {
        viewModel = ViewModelProviders.of(this, vmFactory)[PopularMoviesViewModel::class.java]

        viewModel.getPopularMovies().observe(this, Observer<List<MovieModel>> { movies ->
            movies.forEach {
                if (!popularMovies.contains(it)) {
                    popularMovies.add(it)
                }
            }
            showLoadingMoreMovies(false)

            adapter?.addMovies(popularMovies, POPULAR_MOVIES_TYPE)
            isRefreshed = false
        })

        viewModel.getMovieInformation().observe(this,
            Observer<MoviesInformationModel> { movieInformation ->
                nextPage = movieInformation.page + 1
                maxPages = movieInformation.total_pages
            })

        viewModel.showMovies.observe(this, Observer {
            showMovies(it ?: false)
        })

        viewModel.isLoading.observe(this, Observer {
            showLoading(it ?: false)
        })

        viewModel.isError.observe(this, Observer {
            showError(it ?: false)
        })

        if (popularMovies.isEmpty()) {
            loadPopularMoviesWithPage()
        }
    }

    private fun setupViews() {

        adapter = MoviesAdapter(
            this@PopularMoviesFragment.requireContext(), this@PopularMoviesFragment
        )

        val layoutManager = GridLayoutManager(activity, COLUMN_LINES_ADAPTER)

        setupMoviesAdapter(adapter!!, layoutManager)
        recyclerViewMovies?.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                val visibleItemCount = layoutManager.childCount
                val pastVisibleItem = layoutManager.findFirstCompletelyVisibleItemPosition()
                val totalItems = layoutManager.itemCount + 1

                if ((visibleItemCount + pastVisibleItem) >= totalItems && !isRefreshed &&
                    nextPage <= maxPages && nextPage != 0) {
                    isRefreshed = true
                    getPage()
                }
            }
        })
    }

    private fun getPage() {
        showLoadingMoreMovies(true)
        Handler().postDelayed({
            loadPopularMoviesWithPage()
        }, 5000)
    }

    private fun loadPopularMoviesWithPage() {
        viewModel.loadPopularMovies(nextPage)
    }

    override fun onMovieClicked(itemView: MovieModel) {
        showMovieDetails(PopularMoviesFragmentDirections.actionDetail(itemView))
    }

}
