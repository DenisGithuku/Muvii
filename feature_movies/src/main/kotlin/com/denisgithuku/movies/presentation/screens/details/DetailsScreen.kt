package com.denisgithuku.movies.presentation.screens.details

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import com.denisgithuku.movies.domain.model.Movie

@OptIn(ExperimentalLifecycleComposeApi::class, ExperimentalMaterialApi::class)
@Composable
fun DetailsScreen(
    detailsViewModel: DetailsViewModel = hiltViewModel(),
) {
    val uiState = detailsViewModel.uiState.collectAsStateWithLifecycle().value
    val scaffoldState = rememberBottomSheetScaffoldState()

    BottomSheetScaffold(scaffoldState = scaffoldState, sheetContent = {}) {
        if (uiState.isLoading) {
            Box(
                modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }

        if (uiState.userMessages.isNotEmpty()) {
            LaunchedEffect(uiState.userMessages, scaffoldState.snackbarHostState) {
                scaffoldState.snackbarHostState.showSnackbar(uiState.userMessages[0].message)
                detailsViewModel.onEvent(DetailsUiEvent.ErrorMessageDismiss(uiState.userMessages[0].id))
            }
        }

        uiState.movie?.let {
            DetailsScreenWithState(movie = it)
        }
    }


}

@Composable
fun DetailsScreenWithState(
    movie: Movie,
) {
    LazyColumn {
        item {
            AsyncImage(
                model = "https://image.tmdb.org/t/p/original/${movie.poster_path}",
                contentDescription = "Poster",
                modifier = Modifier.sizeIn(minHeight = 100.dp, maxHeight = 200.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailsScreenWithStatePreview() {
    DetailsScreenWithState(
        movie = Movie(
            adult = false,
            backdrop_path = "",
            genre_ids = listOf(),
            id = 1,
            original_language = "",
            original_title = "The Witcher",
            overview = "lorem ipsum dolor sit amet",
            popularity = 1.8,
            poster_path = "",
            release_date = "45.6",
            title = "The Witcher Remade",
            video = false,
            vote_average = 3.8,
            vote_count = 12348
        )
    )
}