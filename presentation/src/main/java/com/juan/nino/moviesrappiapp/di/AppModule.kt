package com.juan.nino.moviesrappiapp.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import android.content.Context
import androidx.navigation.NavController
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.juan.nino.data.db.MovieDataBase.Companion.getInstance
import com.juan.nino.data.db.dao.PopularMoviesDao
import com.juan.nino.data.db.dao.RatedMoviesDao
import com.juan.nino.data.db.dao.UpcomingMoviesDao
import com.juan.nino.data.platform.NetworkHandler
import com.juan.nino.data.respositories.RatedMoviesRepositoryImpl
import com.juan.nino.data.respositories.UpcomingMoviesRepositoryImpl
import com.juan.nino.data.source.respositories.PopularMoviesRepositoryImpl
import com.juan.nino.data.source.source.MoviesApi
import com.juan.nino.domain.executor.PostExecutionThread
import com.juan.nino.domain.executor.ThreadExecutor
import com.juan.nino.domain.interactor.usecases.PopularMoviesUseCase
import com.juan.nino.domain.interactor.usecases.RatedMoviesUseCase
import com.juan.nino.domain.interactor.usecases.UpcomingMoviesUseCase
import com.juan.nino.moviesrappiapp.MoviesRappiApplication
import com.juan.nino.moviesrappiapp.view_model.PopularMoviesViewModel
import com.juan.nino.moviesrappiapp.view_model.RatedMoviesViewModel
import com.juan.nino.moviesrappiapp.view_model.UpcomingMoviesViewModel
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Provider
import javax.inject.Singleton

/**
 * @author Juan Sebastian Niño
 */
@Module(includes = [ExecutorModule::class, NetworkModule::class])
class AppModule(private val application: MoviesRappiApplication) {

    @Singleton
    @Provides
    fun provideGson(): Gson {
        return GsonBuilder().create()
    }

    @Singleton
    @Provides
    fun provideContext(): Context {
        return application
    }

    @Singleton
    @Provides
    fun providePopularMoviesRepository(gson: Gson, api: MoviesApi,
                                       dao: PopularMoviesDao,
                                       networkHandler: NetworkHandler): PopularMoviesRepositoryImpl {
        return PopularMoviesRepositoryImpl(gson, api, dao, networkHandler)
    }

    @Singleton
    @Provides
    fun provideRatedMoviesRepository(gson: Gson, api: MoviesApi,
                                     dao: RatedMoviesDao,
                                     networkHandler: NetworkHandler): RatedMoviesRepositoryImpl {
        return RatedMoviesRepositoryImpl(gson, api, dao, networkHandler)
    }

    @Singleton
    @Provides
    fun provideUpcomingMoviesRepository(gson: Gson, api: MoviesApi,
                                        dao: UpcomingMoviesDao,
                                        networkHandler: NetworkHandler): UpcomingMoviesRepositoryImpl {
        return UpcomingMoviesRepositoryImpl(gson, api, dao, networkHandler)
    }

    @Singleton
    @Provides
    fun providePopularMoviesUsecase(
        popularMoviesRepositoryImpl: PopularMoviesRepositoryImpl,
        threadExecutor: ThreadExecutor,
        postExecutionThread: PostExecutionThread
    ): PopularMoviesUseCase {
        return PopularMoviesUseCase(popularMoviesRepositoryImpl, threadExecutor, postExecutionThread)
    }

    @Singleton
    @Provides
    fun provideRatedMoviesUsecase(
        ratedMoviesRepositoryImpl: RatedMoviesRepositoryImpl,
        threadExecutor: ThreadExecutor,
        postExecutionThread: PostExecutionThread
    ): RatedMoviesUseCase {
        return RatedMoviesUseCase(ratedMoviesRepositoryImpl, threadExecutor, postExecutionThread)
    }

    @Singleton
    @Provides
    fun provideUpcomingMoviesUsecase(
        upcomingMoviesRepositoryImpl: UpcomingMoviesRepositoryImpl,
        threadExecutor: ThreadExecutor,
        postExecutionThread: PostExecutionThread
    ): UpcomingMoviesUseCase {
        return UpcomingMoviesUseCase(upcomingMoviesRepositoryImpl, threadExecutor, postExecutionThread)
    }

    @Singleton
    @Provides
    fun provideViewModelFactory(
        providers: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
    ) = object : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return requireNotNull(providers[modelClass as Class<out ViewModel>]).get() as T
        }
    }

    @Singleton
    @Provides
    fun provideNavigatorController(context: Context): NavController {
        return NavController(context)
    }

    @Singleton
    @Provides
    fun providePopularMoviesDataSource(context: Context): PopularMoviesDao {
        val dataBase = getInstance(context)
        return  dataBase.popularMoviesDao()
    }

    @Singleton
    @Provides
    fun provideRatedMoviesDataSource(context: Context): RatedMoviesDao {
        val dataBase = getInstance(context)
        return  dataBase.ratedMoviesDao()
    }

    @Singleton
    @Provides
    fun provideUpcomingMoviesDataSource(context: Context): UpcomingMoviesDao {
        val dataBase = getInstance(context)
        return  dataBase.upcomingMoviesDao()
    }

    @Provides
    @IntoMap
    @ViewModelKey(PopularMoviesViewModel::class)
    fun providePopularMoviesViewModel(popularMoviesUseCase: PopularMoviesUseCase): ViewModel =
        PopularMoviesViewModel(popularMoviesUseCase)

    @Provides
    @IntoMap
    @ViewModelKey(RatedMoviesViewModel::class)
    fun provideRatedMoviesViewModel(ratedMoviesUseCase: RatedMoviesUseCase): ViewModel =
        RatedMoviesViewModel(ratedMoviesUseCase)

    @Provides
    @IntoMap
    @ViewModelKey(UpcomingMoviesViewModel::class)
    fun provideUpcomingMoviesViewModel(upcomingMoviesUseCase: UpcomingMoviesUseCase): ViewModel =
        UpcomingMoviesViewModel(upcomingMoviesUseCase)
}