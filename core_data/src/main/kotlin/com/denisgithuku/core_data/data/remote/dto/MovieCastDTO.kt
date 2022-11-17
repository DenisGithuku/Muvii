package com.denisgithuku.core_data.data.remote.dto

data class MovieCastDTO(
    val cast: List<CastDTO>,
    val crew: List<CrewDTO>,
    val id: Int
)