package com.denisgithuku.movies.presentation.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.denisgithuku.core.UserMessage
import com.denisgithuku.movies.domain.model.Genre
import com.denisgithuku.movies.domain.model.Movie
import com.denisgithuku.movies.presentation.components.GenreItem
import com.denisgithuku.movies.presentation.components.MovieItem

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = hiltViewModel(),
) {
    val uiState = homeViewModel.uiState.collectAsState().value
    val scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = BottomSheetState(initialValue = BottomSheetValue.Collapsed)
    )

    BottomSheetScaffold(
        scaffoldState = scaffoldState, sheetContent = {}, sheetPeekHeight = 0.dp
    ) {

        HomeScreen(
            genresLoading = uiState.genresLoading,
            selectedGenre = uiState.selectedGenre,
            moviesLoading = uiState.moviesLoading,
            scaffoldState = scaffoldState,
            onChangeGenre = { genre ->
                homeViewModel.onEvent(HomeEvent.ChangeMovieGenre(genre))
            },
            genres = uiState.genres,
            movies = uiState.movies,
            userMessages = uiState.userMessages
        )
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun HomeScreen(
    modifier: Modifier = Modifier,
    genresLoading: Boolean,
    selectedGenre: Genre,
    moviesLoading: Boolean,
    scaffoldState: BottomSheetScaffoldState,
    onChangeGenre: (Genre) -> Unit,
    genres: List<Genre>,
    movies: List<Movie>,
    userMessages: List<UserMessage> = emptyList(),
) {
    Box(modifier = modifier.fillMaxSize()) {
        if (genresLoading) {
            CircularProgressIndicator(
                modifier = modifier.align(Alignment.TopCenter)
            )
        }

        if (moviesLoading) {
            CircularProgressIndicator(
                modifier = modifier.align(Alignment.Center)
            )
        }

        if (userMessages.isNotEmpty()) {
            for (userMessage in userMessages) {
                LaunchedEffect(key1 = scaffoldState.snackbarHostState) {
                    scaffoldState.snackbarHostState.showSnackbar(
                        userMessage.message ?: "An error occurred"
                    )
                }
            }
        }

        Column(
            modifier = modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyRow(modifier = modifier.padding(vertical = 8.dp)) {
                items(items = genres) { item: Genre ->
                    GenreItem(
                        genre = item,
                        isSelected = selectedGenre == item,
                        size = 40.dp,
                        onSelect = { genre ->
                            onChangeGenre(genre)
                        },
                        modifier = modifier
                    )
                }
            }
            Spacer(modifier = modifier.height(10.dp))
            LazyColumn(
                state = rememberLazyListState()
            ) {
                items(movies) {movie ->
                    MovieItem(modifier = modifier, onClick = {
                    }, movie = movie)
                }

            }

        }
    }
}
