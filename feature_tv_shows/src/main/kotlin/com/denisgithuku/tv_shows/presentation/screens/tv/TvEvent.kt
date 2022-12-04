package com.denisgithuku.tv_shows.presentation.screens.tv

sealed interface TvEvent {
    data class DismissUserMessage(val messageId: Int): TvEvent
}
