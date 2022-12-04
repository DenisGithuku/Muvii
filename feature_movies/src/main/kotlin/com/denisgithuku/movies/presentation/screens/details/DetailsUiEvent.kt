package com.denisgithuku.movies.presentation.screens.details

sealed interface DetailsUiEvent {
    class UserMessageDismiss(val messageId: Int): DetailsUiEvent
    object MarkUnmarkFavourite: DetailsUiEvent
    object UserDialogDismiss: DetailsUiEvent
    data class ToggleFollowPerson(val profileId: Int): DetailsUiEvent
}