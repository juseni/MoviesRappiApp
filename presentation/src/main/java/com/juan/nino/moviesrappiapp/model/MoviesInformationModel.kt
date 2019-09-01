package com.juan.nino.moviesrappiapp.model

import com.juan.nino.domain.model.MoviesInformation

/**
 * @author Juan Sebastian Niño
 */
data class MoviesInformationModel(
    val page: Int,
    val total_pages: Int,
    val total_results: Int
) {
    companion object {
        fun transform(movieInformation: MoviesInformation) =
            with(movieInformation) {
                MoviesInformationModel(
                    page,
                    total_pages,
                    total_results
                )
            }
    }
}
