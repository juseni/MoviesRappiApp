package com.juan.nino.moviesrappiapp

import android.app.Application
import com.juan.nino.moviesrappiapp.di.AppComponent
import com.juan.nino.moviesrappiapp.di.AppModule
import com.juan.nino.moviesrappiapp.di.DaggerAppComponent

/**
 * @author Juan Sebastian Niño
 */
class MoviesRappiApplication: Application() {
    val appComponent: AppComponent = DaggerAppComponent.builder()
        .appModule(AppModule(this))
        .build()
}