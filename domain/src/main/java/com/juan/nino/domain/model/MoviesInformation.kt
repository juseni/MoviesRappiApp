package com.juan.nino.domain.model

/**
 * @author Juan Sebastian Niño
 */
data class MoviesInformation(
    val page: Int,
    val results: List<Movie>,
    val total_pages: Int,
    val total_results: Int
)