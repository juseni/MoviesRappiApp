package com.juan.nino.moviesrappiapp.utils

import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.API_DATE_FORMAT
import com.juan.nino.moviesrappiapp.utils.constants.MoviesRappiConstants.UI_FORMAT
import java.text.SimpleDateFormat
import java.util.*

/**
 * @author Juan Sebastian Niño
 */
fun stringFormatDate(stringDate: String): String {
    if (!stringDate.isEmpty()) {
        val formattedDate = getFormattedDate(stringDate)
        val dateFormat = SimpleDateFormat(UI_FORMAT, Locale.ENGLISH)
        return dateFormat.format(formattedDate)
    } else {
        return ""
    }
}

private fun getFormattedDate(stringDate: String): Date {
    val apiDateFormat = SimpleDateFormat(API_DATE_FORMAT, Locale.ENGLISH)
    return apiDateFormat.parse(stringDate)
}