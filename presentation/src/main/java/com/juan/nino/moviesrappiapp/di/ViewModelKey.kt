package com.juan.nino.moviesrappiapp.di

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass

/**
 * @author Juan Sebastian Niño
 */
@MapKey
@Target(AnnotationTarget.FUNCTION)
annotation class ViewModelKey(
    val value: KClass<out ViewModel>
)