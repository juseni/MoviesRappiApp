package com.juan.nino.data

import com.google.gson.GsonBuilder
import com.juan.nino.data.db.dao.UpcomingMoviesDao
import com.juan.nino.data.db.entity.MovieInformationEntity
import com.juan.nino.data.platform.NetworkHandler
import com.juan.nino.data.respositories.UpcomingMoviesRepositoryImpl
import com.juan.nino.data.source.source.MoviesApi
import com.juan.nino.domain.model.MoviesInformation
import com.nhaarman.mockitokotlin2.given
import com.nhaarman.mockitokotlin2.whenever
import io.reactivex.Single
import okhttp3.MediaType
import okhttp3.ResponseBody
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import retrofit2.Response

/**
 * @author Juan Sebastian Niño
 */
@RunWith(MockitoJUnitRunner::class)
class UpcomingMoviesRepositoryImplTest {

    companion object {
        private const val INIT_DATE = "2019-08-15"
        private const val END_DATE = "2020-02-15"
        private const val PAGE_DEFAULT = 1

        private val MOVIE_MOCKED = getMovieMocked()

        private const val PAGE_MOCKED = 1
        private const val TOTAL_PAGES_MOCKED = 500
        private const val TOTAL_RESULST_MOCKED = 10000

        private val movieInformationMocked = MoviesInformation(
            PAGE_MOCKED, listOf(MOVIE_MOCKED), TOTAL_PAGES_MOCKED, TOTAL_RESULST_MOCKED)

        private val movieResponseMock = getMovieResponseMocked()

    }

    private var gson = GsonBuilder().create()

    @Mock
    private lateinit var api: MoviesApi
    @Mock
    private lateinit var dao: UpcomingMoviesDao
    @Mock
    private lateinit var networkHandler: NetworkHandler

    private lateinit var upcomingRepositoryImpl: UpcomingMoviesRepositoryImpl

    @Before
    fun setup() {
        given { networkHandler.isConnected() }.willReturn(true)
        upcomingRepositoryImpl = UpcomingMoviesRepositoryImpl(gson, api, dao, networkHandler)
    }

    @Test
    fun `it should execute get upcoming movies from repository`() {
        whenever(api.getUpcomingMovies(INIT_DATE, END_DATE, PAGE_DEFAULT)).thenReturn(
            Single.just(
                Response.success(
                    gson.fromJson(movieResponseMock, MovieInformationEntity::class.java)
                )
            )
        )

        val response = upcomingRepositoryImpl.getUpcomingMovies(PAGE_DEFAULT).test().assertComplete().values()[0]
        Assert.assertEquals(movieInformationMocked.page, response.page)
        Assert.assertEquals(movieInformationMocked.total_pages, response.total_pages)
        Assert.assertEquals(movieInformationMocked.total_results, response.total_results)
        Assert.assertEquals(movieInformationMocked.results, response.results)
    }

    @Test
    fun `it should get an Exception`() {
        whenever(api.getUpcomingMovies(INIT_DATE, END_DATE, PAGE_DEFAULT)).thenReturn(
            Single.just(
                Response.error(400, ResponseBody.create(MediaType.parse("application/json"), "{}"))
            )
        )
        val testObserver = upcomingRepositoryImpl.getUpcomingMovies(PAGE_DEFAULT).test().assertError(Exception::class.java)

        Assert.assertEquals("No data received", testObserver.errors()[0].message)
    }
}