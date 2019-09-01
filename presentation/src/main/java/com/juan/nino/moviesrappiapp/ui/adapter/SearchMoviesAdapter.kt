package com.juan.nino.moviesrappiapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.juan.nino.moviesrappiapp.R
import com.juan.nino.moviesrappiapp.model.MovieModel
import com.juan.nino.moviesrappiapp.utils.bindMovieRecyclerView

/**
 * @author Juan Sebastian Niño
 */
class SearchMoviesAdapter(
    private val moviesToFilter: ArrayList<MovieModel>?,
    private val movieType: Int,
    private val onMovieClickListener: OnMovieClickListener
) : RecyclerView.Adapter<BaseViewHolder<MovieModel>>(), Filterable {

    var moviesFiltered: ArrayList<MovieModel>? = arrayListOf()

    init {
        moviesFiltered = moviesToFilter
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<MovieModel> {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_item, parent, false)

        return SearchViewHolder(parent.context, itemView, onMovieClickListener)
    }

    override fun getItemCount() = moviesFiltered!!.size


    override fun onBindViewHolder(holder: BaseViewHolder<MovieModel>, position: Int) {
        holder.onBind(moviesFiltered?.get(position) as MovieModel)
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(charSequence: CharSequence): FilterResults {
                val charString = charSequence.toString()
                if (charString.isEmpty()) {
                    moviesFiltered = moviesToFilter
                } else {
                    val filteredList = ArrayList<MovieModel>()
                    moviesToFilter?.forEach {
                        if (it.title?.toLowerCase()?.contains(charString.toLowerCase())!!) {
                            filteredList.add(it)
                        }
                    }
                    moviesFiltered = filteredList
                }

                val filterResults = FilterResults()
                filterResults.values = moviesFiltered
                return filterResults
            }

            override fun publishResults(charSequence: CharSequence, filterResults: FilterResults) {
                moviesFiltered = filterResults.values as ArrayList<MovieModel>
                notifyDataSetChanged()
            }
        }

    }

    inner class SearchViewHolder(
        private val context: Context,
        itemView: View,
        private val onMovieClickListener: OnMovieClickListener
    ) : BaseViewHolder<MovieModel>(itemView) {

        init {
            itemView.setOnClickListener { _ ->
                moviesFiltered?.get(adapterPosition)?.let {
                    onMovieClickListener.onMovieClicked(it)
                }
            }
        }

        override fun onBind(item: MovieModel) {
            bindMovieRecyclerView(context, itemView, item, movieType)
        }

    }

}
