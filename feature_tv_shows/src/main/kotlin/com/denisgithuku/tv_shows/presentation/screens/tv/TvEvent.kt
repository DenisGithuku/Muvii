package com.denisgithuku.tv_shows.presentation.screens.tv

sealed class TvEvent {
    data class DismissUserMessage(val messageId: Int): TvEvent()
}
