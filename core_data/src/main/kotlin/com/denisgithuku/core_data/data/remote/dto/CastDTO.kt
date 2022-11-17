package com.denisgithuku.core_data.data.remote.dto

import com.denisgithuku.core_data.domain.model.Cast

data class CastDTO(
    val adult: Boolean,
    val cast_id: Int,
    val character: String,
    val credit_id: String,
    val gender: Int,
    val id: Int,
    val known_for_department: String,
    val name: String,
    val order: Int,
    val original_name: String,
    val popularity: Double,
    val profile_path: String?
) {
    fun toCast(): Cast {
        return Cast(
            adult,
            cast_id,
            character,
            credit_id,
            gender,
            id,
            known_for_department,
            name,
            order,
            original_name,
            popularity,
            profile_path
        )
    }
}