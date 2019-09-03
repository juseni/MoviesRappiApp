package com.globant.domain.interactor.usecases

import com.juan.nino.domain.executor.InmediateThreadExecutor
import com.juan.nino.domain.executor.PostExecutionThread
import com.juan.nino.domain.interactor.usecases.PopularMoviesUseCase
import com.juan.nino.domain.model.MoviesInformation
import com.juan.nino.domain.repositories.PopularMoviesRepository
import com.nhaarman.mockitokotlin2.whenever
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)

class PopularMoviesUseCaseTest {

    companion object {
        const val PAGE_DEFAULT = 1
        private val MOVIE_MOCKED = getMovieMocked()

        private const val PAGE_MOCKED = 1
        private const val TOTAL_PAGES_MOCKED = 500
        private const val TOTAL_RESULST_MOCKED = 10000

        private val movieInformationMocked = MoviesInformation(
            PAGE_MOCKED, listOf(MOVIE_MOCKED), TOTAL_PAGES_MOCKED, TOTAL_RESULST_MOCKED)

    }

    @Mock
    private lateinit var repository: PopularMoviesRepository

    @Mock
    private lateinit var postExecutionThread: PostExecutionThread

    private lateinit var popularMoviesUseCase: PopularMoviesUseCase

    @Before
    fun setup() {
        whenever(postExecutionThread.scheduler).thenReturn(Schedulers.trampoline())
        popularMoviesUseCase = PopularMoviesUseCase(repository, InmediateThreadExecutor(), postExecutionThread)
    }

    @Test
    fun `it should execute get popular movies`() {
        whenever(repository.getPopularMovies(PAGE_DEFAULT)).thenReturn(Single.just((movieInformationMocked)))
        val response = popularMoviesUseCase.execute(PAGE_DEFAULT).test().assertComplete().values()[0]
        Assert.assertEquals(movieInformationMocked.page, response.page)
        Assert.assertEquals(movieInformationMocked.results, response.results)
        Assert.assertEquals(movieInformationMocked.total_pages, response.total_pages)
        Assert.assertEquals(movieInformationMocked.total_results, response.total_results)
    }

    @Test
    fun `it should get a Exception`() {
        whenever(repository.getPopularMovies(PAGE_DEFAULT)).thenReturn(Single.error(Exception("No data")))
        val testObserver = popularMoviesUseCase.execute(PAGE_DEFAULT).test().assertError(Exception::class.java)
        Assert.assertEquals("No data", testObserver.errors()[0].message)
    }
}