package com.juan.nino.moviesrappiapp.di

import android.content.Context
import com.google.gson.Gson
import com.juan.nino.data.platform.NetworkHandler
import com.juan.nino.data.source.source.MoviesApi
import com.juan.nino.moviesrappiapp.BuildConfig
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * @author Juan Sebastian Niño
 */
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson): Retrofit {
        val okHttpClient = OkHttpClient.Builder()
            .readTimeout(MoviesRappiConstants.TIME_OUT_CONNECTION.toLong(), TimeUnit.SECONDS)
            .connectTimeout(MoviesRappiConstants.TIME_OUT_CONNECTION.toLong(), TimeUnit.SECONDS)
            .addInterceptor(getInterceptor())
            .build()
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl(BuildConfig.SERVER_URL)
            .client(okHttpClient)
            .build()
    }

    private fun getInterceptor() =
        Interceptor { chain ->
            var request = chain.request()
            val url = request.url()
                .newBuilder()
                .addQueryParameter(MoviesApi.API_AUTH_TOKEN, BuildConfig.AUTH_TOKEN)
                .build()
            request = request
                .newBuilder()
                .url(url)
                .build()
            return@Interceptor chain.proceed(request)
        }


    @Singleton
    @Provides
    fun provideMoviesApi(retrofit: Retrofit): MoviesApi {
        return retrofit.create(MoviesApi::class.java)
    }

    @Singleton
    @Provides
    fun provideNetworkHandler(context: Context) =
        NetworkHandler(context)

}