package com.denisgithuku.movies.presentation.screens.home.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.denisgithuku.core_design.ui.components.MuviiEditableUserInput
import com.denisgithuku.core_design.ui.components.rememberMuviiEditableUserInputState
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter

@OptIn(ExperimentalCoroutinesApi::class, FlowPreview::class)
@Composable
fun SearchBar(
    onSearch: (String) -> Unit,
    ) {
    val searchState =
        rememberMuviiEditableUserInputState(hint = "Search by keyword, people or tv show")
    val currentOnSearch by rememberUpdatedState(onSearch)

    MuviiEditableUserInput(state = searchState,
        vectorImageId = com.githukudenis.movies.R.drawable.ic_search_24,
        contentDescription = "Search",
        onClick = { currentOnSearch(searchState.text) })
    LaunchedEffect(searchState) {
        snapshotFlow { searchState.text.trim() }
            .debounce(500)
            .filter {
               it.trim().isNotEmpty()
            }
            .distinctUntilChanged()
            .collect {
                currentOnSearch(searchState.text)
            }

    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun SearchBarPrev() {
    SearchBar(onSearch = {})
}