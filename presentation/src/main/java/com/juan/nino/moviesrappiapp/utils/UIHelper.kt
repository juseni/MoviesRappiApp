package com.juan.nino.moviesrappiapp.utils

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AlertDialog
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.juan.nino.moviesrappiapp.R
import com.juan.nino.moviesrappiapp.model.MovieModel
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants
import kotlinx.android.synthetic.main.movie_item.view.*

/**
 * @author Juan Sebastian Niño
 */
fun getProgressBar(context: Context): CircularProgressDrawable {
    val circularProgressDrawable =CircularProgressDrawable(context)
    circularProgressDrawable.strokeWidth = 5f
    circularProgressDrawable.centerRadius = 30f
    circularProgressDrawable.start()
    return circularProgressDrawable
}

fun bindMovieRecyclerView(context: Context, itemView: View, item:MovieModel, movieType: Int) {
    item.let {
        itemView.movieTitle.text = it.title
        when(movieType) {
            MoviesRappiConstants.POPULAR_MOVIES_TYPE -> itemView.movieSubtitle.text = context.getString(
                R.string.popular_movie_card_subtitle, it.popularity.toString())
            MoviesRappiConstants.RATED_MOVIES_TYPE -> itemView.movieSubtitle.text = context.getString(
                R.string.rated_movie_card_subtitle, it.vote_average.toString())
            MoviesRappiConstants.UPCOMING_MOVIES_TYPE -> itemView.movieSubtitle.text = context.getString(
                R.string.upcoming_movie_card_subtitle, stringFormatDate(it.release_date!!))
        }

        GlideApp.with(context)
            .load(MoviesRappiConstants.IMAGE_URL_PATH + it.poster_path)
            .placeholder(getProgressBar(context))
            .error(R.drawable.ic_no_movie_image)
            .fallback(R.drawable.ic_no_movie_image)
            .into(itemView.posterMovie)
    }
}

fun showSnackInformation(activity: Activity) {
    val view = activity.layoutInflater.inflate(R.layout.about_me, null, false)
    val alertDialog = AlertDialog.Builder(activity).create()

    with(alertDialog) {
        setView(view)
        setCanceledOnTouchOutside(true)
        show()
    }
}

fun startAnimationLoading(context: Context, view: View) {
    val animation = AnimationUtils.loadAnimation(context, R.anim.move_loading)
    view.startAnimation(animation)
}
