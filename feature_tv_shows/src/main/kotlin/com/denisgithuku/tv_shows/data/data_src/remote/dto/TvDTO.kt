package com.denisgithuku.tv_shows.data.data_src.remote.dto

import com.denisgithuku.tv_shows.domain.model.Tv

data class TvDTO(
    val backdrop_path: String?,
    val first_air_date: String,
    val genre_ids: List<Int>,
    val id: Int,
    val name: String,
    val origin_country: List<String>,
    val original_language: String,
    val original_name: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val vote_average: Double,
    val vote_count: Int
) {
    fun toTv(): Tv {
        return Tv(
            backdrop_path,
            first_air_date,
            genre_ids,
            id,
            name,
            origin_country,
            original_language,
            original_name,
            overview,
            popularity,
            poster_path,
            vote_average,
            vote_count
        )
    }
}