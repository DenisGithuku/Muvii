package com.denisgithuku.tv_shows.presentation.screens.tv_details

import com.denisgithuku.core_data.UserMessage
import com.denisgithuku.feature_people.domain.model.Cast
import com.denisgithuku.tv_shows.domain.model.Tv

data class TvDetailsUiState (
    val tvDetailsLoading: Boolean = false,
    val tvDetails: Tv? = null,
    val similarShows: List<Tv> = emptyList(),
    val castLoading: Boolean = false,
    val castList: List<com.denisgithuku.feature_people.domain.model.Cast> = emptyList(),
    val userMessages: List<UserMessage> = emptyList()
)