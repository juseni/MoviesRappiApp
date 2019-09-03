package com.juan.nino.data

import com.juan.nino.domain.model.Movie

/**
 * @author Juan Sebastian Niño
 */
internal fun getMovieMocked() =
    Movie(
        426,
        429203,
        false,
        6.4,
        "The Old Man & the Gun",
        322.619,
        "/ok0Zt1kl82GrGihF9LSlHMXZup.jpg",
        "en",
        "The Old Man & the Gun",
        "/8bRIfPGDnmWgdy65LO8xtdcFmFP.jpg",
        false,
        "Narra una historia real, la de Forrest Tucker, un ladrón de bancos que pasó la mayor parte de su vida en la cárcel o intentando escapar de ella. De hecho, logró fugarse en 18 ocasiones y cometió su último atraco en el año 2000 cuando tenía 80 años.",
        "2019-01-25")

internal fun getMovieResponseMocked() =
    "{\"page\":1,\"total_results\":10000,\"total_pages\":500,\"results\"" +
            ":[{\"popularity\":322.619,\"vote_count\":426,\"video\":false,\"" +
            "poster_path\":\"\\/ok0Zt1kl82GrGihF9LSlHMXZup.jpg\",\"id\":429203,\"adult\":false,\"" +
            "backdrop_path\":\"\\/8bRIfPGDnmWgdy65LO8xtdcFmFP.jpg\",\"original_language\":\"en\",\"" +
            "original_title\":\"The Old Man & the Gun\",\"genre_ids\":[35,80,18],\"title\":\"The Old Man & the Gun\",\"" +
            "vote_average\":6.4,\"overview\":\"Narra una historia real, la de Forrest Tucker, un ladrón de bancos que pasó la mayor parte de su vida en la cárcel o intentando escapar de ella. De hecho, logró fugarse en 18 ocasiones y cometió su último atraco en el año 2000 cuando tenía 80 años.\",\"" +
            "release_date\":\"2019-01-25\"}]}"