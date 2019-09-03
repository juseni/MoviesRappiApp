package com.juan.nino.moviesrappiapp.di

import com.juan.nino.data.platform.NetworkHandler
import com.juan.nino.moviesrappiapp.ui.view.fragment.detail.DetailMovieFragment
import com.juan.nino.moviesrappiapp.ui.view.fragment.popular.PopularMoviesFragment
import com.juan.nino.moviesrappiapp.ui.view.fragment.topRated.TopRatedMoviesFragment
import com.juan.nino.moviesrappiapp.ui.view.fragment.upcoming.UpcomingMoviesFragment
import com.juan.nino.moviesrappiapp.ui.view.search.SearchMovieActivity
import dagger.Component
import javax.inject.Singleton

/**
 * @author Juan Sebastian Niño
 */
@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(popularMoviesFragment: PopularMoviesFragment)
    fun inject(topRatedMoviesFragment: TopRatedMoviesFragment)
    fun inject(upcomingMoviesFragment: UpcomingMoviesFragment)
    fun inject(detailMovieFragment: DetailMovieFragment)

    fun inject(searchMovieActivity: SearchMovieActivity)

}