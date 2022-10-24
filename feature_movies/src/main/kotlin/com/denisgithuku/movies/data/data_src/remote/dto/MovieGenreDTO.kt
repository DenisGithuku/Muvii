package com.denisgithuku.movies.data.data_src.remote.dto

import com.denisgithuku.movies.domain.model.Genre

data class MovieGenreDTO(
    val id: Int,
    val name: String
) {
    fun toGenre(): Genre = Genre(
            id = id,
            name = name
        )
}
