package com.juan.nino.moviesrappiapp.ui.view.fragment.detail


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.transition.TransitionInflater
import com.google.android.material.appbar.AppBarLayout

import com.juan.nino.moviesrappiapp.R
import com.juan.nino.moviesrappiapp.model.MovieModel
import com.juan.nino.moviesrappiapp.ui.view.base.BaseFragment
import com.juan.nino.moviesrappiapp.utils.GlideApp
import kotlinx.android.synthetic.main.fragment_detail_movie.*
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.IMAGE_URL_PATH
import com.juan.nino.moviesrappiapp.utils.getProgressBar
import com.juan.nino.moviesrappiapp.utils.stringFormatDate
import javax.inject.Inject
import kotlin.math.abs

/**
 * @author Juan Sebastian Niño
 */
class DetailMovieFragment : BaseFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedElementEnterTransition = TransitionInflater.from(context).inflateTransition(android.R.transition.move)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setCustomActionBar()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val movie = arguments?.let { DetailMovieFragmentArgs.fromBundle(it) }
        setupMovieDetails(movie!!.movie)
    }

    private fun setCustomActionBar() {
        baseActivity.setSupportActionBar(detailsToolbar)
        showMainToolBar(false)
        baseActivity.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupMovieDetails(movie: MovieModel) {

        GlideApp.with(this@DetailMovieFragment)
            .load(IMAGE_URL_PATH + movie.poster_path)
            .placeholder(getProgressBar(context!!))
            .error(R.drawable.ic_no_movie_image)
            .fallback(R.drawable.ic_no_movie_image)
            .into(posterImageView)

        GlideApp.with(this@DetailMovieFragment)
            .load(IMAGE_URL_PATH + movie.backdrop_path)
            .placeholder(getProgressBar(context!!))
            .error(R.drawable.ic_place_holder_background)
            .fallback(R.drawable.ic_place_holder_background)
            .centerCrop()
            .into(backdropImageView)

        collapsingToolbar.title = movie.title
        collapsingToolbar.setExpandedTitleColor(ContextCompat.getColor(context!!, android.R.color.transparent))
        collapsingToolbar.setCollapsedTitleTextColor(ContextCompat.getColor(context!!, R.color.colorAccent))

        titleText.text = movie.title
        averageText.text = getString(R.string.text_vote_average, movie.vote_average.toString())
        releaseDateText.text = stringFormatDate(movie.release_date!!)
        votesText.text = movie.vote_count.toString()
        languageText.text = movie.original_language
        overviewText.text = movie.overview
        popularText.text = movie.popularity.toString()

        appBar.addOnOffsetChangedListener(AppBarLayout.BaseOnOffsetChangedListener<AppBarLayout> { appBarLayout, verticalOffset ->
            if (abs(verticalOffset) - appBarLayout!!.totalScrollRange == 0)
                posterImageView!!.visibility = View.GONE
            else
                posterImageView!!.visibility = View.VISIBLE
        })
    }


}
