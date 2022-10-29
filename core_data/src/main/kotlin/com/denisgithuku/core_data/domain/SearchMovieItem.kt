package com.denisgithuku.core_data.domain

import com.denisgithuku.core_data.data.remote.dto.KnownFor

data class SearchMovieItem(
    val adult: Boolean?,
    val backdrop_path: String?,
    val gender: Int?,
    val genre_ids: List<Int>?,
    val id: Int?,
    val known_for: List<KnownFor>?,
    val known_for_department: String?,
    val media_type: String?,
    val name: String?,
    val original_language: String?,
    val original_title: String?,
    val overview: String?,
    val popularity: Double?,
    val poster_path: String?,
    val profile_path: String?,
    val release_date: String?,
    val title: String?,
    val video: Boolean?,
    val vote_average: Double?,
    val vote_count: Int?
)
