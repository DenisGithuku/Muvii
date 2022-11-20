package com.denisgithuku.movies.data.data_src.remote.dto.movie

import com.denisgithuku.movies.domain.model.Movie

data class MovieDTO(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
) {
    fun toMovie(): Movie {
        return Movie(
            adult = adult,
            backdrop_path = backdrop_path,
            id = id,
            original_language = original_language,
            original_title = original_title,
            overview = overview,
            popularity = popularity,
            poster_path = poster_path,
            title = title,
            video = video,
            release_date = release_date,
            vote_average = vote_average,
            vote_count = vote_count
        )
    }
}