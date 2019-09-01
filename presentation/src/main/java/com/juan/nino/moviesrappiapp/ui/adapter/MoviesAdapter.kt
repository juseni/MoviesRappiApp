package com.juan.nino.moviesrappiapp.ui.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.juan.nino.moviesrappiapp.R
import com.juan.nino.moviesrappiapp.model.MovieModel
import com.juan.nino.moviesrappiapp.utils.GlideApp
import com.juan.nino.moviesrappiapp.utils.bindMovieRecyclerView
import kotlinx.android.synthetic.main.movie_item.view.*
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.IMAGE_URL_PATH
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.POPULAR_MOVIES_TYPE
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.RATED_MOVIES_TYPE
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.UPCOMING_MOVIES_TYPE
import com.juan.nino.moviesrappiapp.utils.getProgressBar
import com.juan.nino.moviesrappiapp.utils.stringFormatDate

/**
 * @author Juan Sebastian Niño
 */
class MoviesAdapter(private val context: Context,
                    private var onMovieClickListener: OnMovieClickListener) : RecyclerView.Adapter<BaseViewHolder<MovieModel>>() {

    private var movies: MutableList<MovieModel>? = ArrayList()
    private var movieType: Int = POPULAR_MOVIES_TYPE

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<MovieModel> {
        val view = LayoutInflater.from(context).inflate(R.layout.movie_item, parent, false)
        return MovieHolder(context, view, this.movies, onMovieClickListener)
    }

    override fun getItemCount(): Int {
        return movies?.size ?: 0
    }

    override fun onBindViewHolder(holder: BaseViewHolder<MovieModel>, position: Int) {
        holder.onBind(movies?.get(position) as MovieModel)
    }


    inner class MovieHolder(
        private val context: Context,
        itemView: View?,
        movies: MutableList<MovieModel>?,
        private val onMovieClick: OnMovieClickListener? = null
    ) : BaseViewHolder<MovieModel>(itemView!!) {

        init {
            itemView!!.setOnClickListener { _ ->
                movies?.get(adapterPosition)?.let {
                    onMovieClick?.onMovieClicked(it)
                }
            }
        }

        override fun onBind(item: MovieModel) {
            bindMovieRecyclerView(context, itemView, item, movieType)
        }
    }

    private fun add(movie: MovieModel) {
        this.movies?.add(movie)
    }

    fun addMovies(movies: List<Any>, movieType: Int) {
        if (movies.size == this.movies!!.size) {
            notifyDataSetChanged()
            return
        }

        this.movieType = movieType
        val oldLength = this.movies!!.size
        val newLength = movies.size

        removedAndAddMoreMovies(oldLength)

        movies.forEach {
            if (!this.movies?.contains(it)!!) {
                add(it as MovieModel)
            }
        }
        notifyItemRangeInserted(oldLength - 1, newLength)

    }

    private fun removedAndAddMoreMovies(position: Int) {
        if (this.movies?.size!! > 0) {
            this.movies?.removeAt(position - 1)
        }
        notifyDataSetChanged()
    }
}