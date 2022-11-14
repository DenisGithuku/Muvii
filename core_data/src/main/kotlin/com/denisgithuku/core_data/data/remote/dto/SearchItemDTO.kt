package com.denisgithuku.core_data.data.remote.dto

import com.denisgithuku.core_data.domain.model.SearchMovieItem

data class SearchItemDTO(
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
) {
    fun toSearchMovieItem(): SearchMovieItem {
        return SearchMovieItem(
            adult,
            backdrop_path,
            gender,
            genre_ids,
            id,
            known_for,
            known_for_department,
            media_type,
            name,
            original_language,
            original_title,
            overview,
            popularity,
            poster_path,
            profile_path,
            release_date,
            title,
            video,
            vote_average,
            vote_count
        )
    }
}