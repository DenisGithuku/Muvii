package com.denisgithuku.movies.presentation.screens.home

import com.denisgithuku.movies.domain.common.SortType

sealed interface HomeEvent {
    data class ChangeMovieGenre(val genreId: Int): HomeEvent
    data class ErrorMessageDismissed(val messageId: Int): HomeEvent
    data class ChangeSortType(val sortType: SortType): HomeEvent
    data class Search(val query: String): HomeEvent
    object ToggleAdultContentEnable: HomeEvent
}
