package com.juan.nino.data.platform

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author Juan Sebastian Niño
 */
@Singleton
class NetworkHandler
@Inject constructor(private val context: Context) {
    //val isConnected get() = //context.networkInfo?.isConnectedOrConnecting
    fun isConnected(): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }
}


/*
val Context.networkInfo: NetworkInfo?
    get() =
        (this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetworkInfo*/