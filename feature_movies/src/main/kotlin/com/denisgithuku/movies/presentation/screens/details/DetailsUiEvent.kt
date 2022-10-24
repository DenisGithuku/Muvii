package com.denisgithuku.movies.presentation.screens.details

sealed class DetailsUiEvent {
    class UserMessageDismiss(val messageId: Int): DetailsUiEvent()
    object MarkFavourite: DetailsUiEvent()
    object DeleteFromFavourites: DetailsUiEvent()
    object UserDialogDismiss: DetailsUiEvent()
}