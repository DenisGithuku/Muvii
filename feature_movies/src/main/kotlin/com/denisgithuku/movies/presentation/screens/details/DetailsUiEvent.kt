package com.denisgithuku.movies.presentation.screens.details

sealed class DetailsUiEvent {
    class UserMessageDismiss(val messageId: Int): DetailsUiEvent()
    object MarkUnmarkFavourite: DetailsUiEvent()
    object UserDialogDismiss: DetailsUiEvent()
}