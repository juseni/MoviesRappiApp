package com.juan.nino.moviesrappiapp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.juan.nino.domain.executor.InmediateThreadExecutor
import com.juan.nino.domain.executor.PostExecutionThread
import com.juan.nino.domain.executor.ThreadExecutor
import com.juan.nino.domain.interactor.usecases.PopularMoviesUseCase
import com.juan.nino.domain.model.MoviesInformation
import com.juan.nino.domain.repositories.PopularMoviesRepository
import com.juan.nino.moviesrappiapp.view_model.PopularMoviesViewModel
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)

class PopularMoviesViewModelTest {
    companion object {
        const val DEFAULT_PAGE = 1

        private val MOVIE_MOCKED = getMovieMocked()

        private const val PAGE_MOCKED = 1
        private const val TOTAL_PAGES_MOCKED = 500
        private const val TOTAL_RESULST_MOCKED = 10000

        private val movieInformationMocked = MoviesInformation(
            PAGE_MOCKED, listOf(MOVIE_MOCKED), TOTAL_PAGES_MOCKED, TOTAL_RESULST_MOCKED)

        private val moviesModel = listOf(getMovieModelMocked())
    }

    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()

    @Mock
    private lateinit var repository: PopularMoviesRepository
    @Mock
    private lateinit var postThreadExecutor: PostExecutionThread

    private val threadExecutor: ThreadExecutor = InmediateThreadExecutor()

    private lateinit var useCase: PopularMoviesUseCase

    private lateinit var viewModel: PopularMoviesViewModel

    @Before
    fun before() {
        Mockito.`when`(postThreadExecutor.scheduler).thenReturn(Schedulers.trampoline())
        useCase = PopularMoviesUseCase(
            repository,
            threadExecutor,
            postThreadExecutor
        )
        viewModel = PopularMoviesViewModel(useCase)
    }

    @Test
    fun `it should load experience from view model`() {
        Mockito.`when`(repository.getPopularMovies(DEFAULT_PAGE)).thenReturn(Single.just(movieInformationMocked))
        viewModel.loadPopularMovies(DEFAULT_PAGE)
        Assert.assertEquals(
            viewModel.getPopularMovies().value,
            moviesModel
        )
    }

}