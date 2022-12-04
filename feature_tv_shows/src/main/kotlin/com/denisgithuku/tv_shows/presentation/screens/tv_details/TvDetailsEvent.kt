package com.denisgithuku.tv_shows.presentation.screens.tv_details

sealed interface TvDetailsEvent {
    data class DismissUserMessage(val messageId: Int): TvDetailsEvent
}
