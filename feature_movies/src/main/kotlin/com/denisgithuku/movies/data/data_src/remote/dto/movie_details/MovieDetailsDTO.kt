package com.denisgithuku.movies.data.data_src.remote.dto.movie_details

import com.denisgithuku.movies.domain.model.MovieDetails

data class MovieDetailsDTO(
    val adult: Boolean,
    val backdrop_path: String,
    val belongs_to_collection: Any?,
    val budget: Int,
    val genres: List<Genre>,
    val homepage: String,
    val id: Int,
    val imdb_id: String,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val production_companies: List<ProductionCompany>,
    val production_countries: List<ProductionCountry>,
    val release_date: String,
    val revenue: Int,
    val runtime: Int,
    val spoken_languages: List<SpokenLanguage>,
    val status: String,
    val tagline: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
) {
    fun toMovie(): MovieDetails {
        return MovieDetails(
            adult = adult,
            backdrop_path = backdrop_path,
            genres = genres.map { it.name },
            id,
            original_language,
            original_title,
            overview,
            popularity,
            poster_path,
            release_date,
            title,
            video,
            vote_average,
            vote_count
        )
    }
}