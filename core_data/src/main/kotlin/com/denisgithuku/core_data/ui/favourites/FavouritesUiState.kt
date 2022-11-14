package com.denisgithuku.core_data.ui.favourites

import com.denisgithuku.core_data.domain.model.FavouriteMovie

data class FavouritesUiState(
    val isLoading: Boolean = false,
    val favourites: List<FavouriteMovie> = emptyList(),
    val error: String = ""
)
