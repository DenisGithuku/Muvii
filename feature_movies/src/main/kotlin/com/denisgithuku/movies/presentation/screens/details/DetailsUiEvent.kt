package com.denisgithuku.movies.presentation.screens.details

sealed class DetailsUiEvent {
    class ErrorMessageDismiss(val messageId: Int): DetailsUiEvent()
}