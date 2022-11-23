package com.denisgithuku.movies.presentation.screens.details

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.denisgithuku.core_data.Constants
import com.denisgithuku.core_data.domain.model.Cast
import com.denisgithuku.core_data.ui.components.JumpingBubblesLoadingIndicator
import com.denisgithuku.core_design.ui.components.ConfirmationDialog
import com.denisgithuku.core_design.ui.components.MuviiIconButton
import com.denisgithuku.core_design.ui.components.RoundedRectangleChip
import com.denisgithuku.core_design.ui.theme.LocalAppDimens
import com.denisgithuku.movies.domain.model.Movie
import com.denisgithuku.movies.domain.model.MovieDetails
import com.denisgithuku.movies.presentation.components.TrendingMovieItem
import com.denisgithuku.movies.presentation.screens.details.components.CastCard
import com.denisgithuku.movies.presentation.screens.details.components.MovieInfo
import com.githukudenis.movies.R
import com.google.accompanist.flowlayout.FlowCrossAxisAlignment
import com.google.accompanist.flowlayout.FlowMainAxisAlignment
import com.google.accompanist.flowlayout.FlowRow
import okhttp3.internal.trimSubstring

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun MovieDetailsScreen(
    snackbarHostState: SnackbarHostState,
    detailsViewModel: DetailsViewModel = hiltViewModel(),
    onOpenMovieDetails: (Int) -> Unit,
    onNavigateUp: () -> Unit
) {
    val uiState = detailsViewModel.uiState.collectAsStateWithLifecycle().value


    AnimatedVisibility(
        visible = uiState.movieDetailsLoading,
        enter = fadeIn(),
        exit = fadeOut()
    ) {
        Box(
            modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
        ) {
            JumpingBubblesLoadingIndicator()
        }
    }

    if (uiState.userMessages.isNotEmpty()) {
        LaunchedEffect(uiState.userMessages, snackbarHostState) {
            snackbarHostState.showSnackbar(uiState.userMessages[0].message)
            detailsViewModel.onEvent(DetailsUiEvent.UserMessageDismiss(uiState.userMessages[0].id))
        }
    }

    if (uiState.showConfirmationDialog) {
        ConfirmationDialog(
            dialogTitleId = com.denisgithuku.core_design.R.string.delete_from_favourites_title,
            dialogDescriptionId = com.denisgithuku.core_design.R.string.delete_from_favourites_desc,
            confirmButtonTextId = com.denisgithuku.core_design.R.string.confirm_button_text,
            cancelButtonTextId = com.denisgithuku.core_design.R.string.cancel_button_text,
            onConfirm = {
                detailsViewModel.onEvent(DetailsUiEvent.MarkUnmarkFavourite)
                detailsViewModel.onEvent(DetailsUiEvent.UserDialogDismiss)
            },
            onCancel = {
                detailsViewModel.onEvent(DetailsUiEvent.UserDialogDismiss)
            },
            dismissable = true
        )

    }

    uiState.movieDetails?.let { movieDetails ->
        MovieDetailsScreen(movieDetails = movieDetails,
            similarMoviesLoading = uiState.similarMoviesLoading,
            similarMovies = uiState.similarMovies,
            onOpenSimilarMovie = onOpenMovieDetails,
            onNavigateUp = onNavigateUp,
            onMarkUnmarkFavourite = {
                detailsViewModel.onEvent(
                    DetailsUiEvent.MarkUnmarkFavourite
                )
            },
            castLoading = uiState.castLoading,
            castList = uiState.cast,
            onOpenProfile = {

            },
            onToggleFollow = {

            })
    }
}

@Composable
private fun MovieDetailsScreen(
    movieDetails: MovieDetails,
    similarMoviesLoading: Boolean,
    castLoading: Boolean,
    castList: List<Cast>,
    onOpenProfile: (Int) -> Unit,
    onToggleFollow: (Int) -> Unit,
    similarMovies: List<Movie>,
    onOpenSimilarMovie: (Int) -> Unit,
    onMarkUnmarkFavourite: () -> Unit,
    onNavigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current

    LazyColumn(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(LocalAppDimens.current.medium),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .sizeIn(minHeight = 200.dp, maxHeight = 400.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(context)
                        .data("https://image.tmdb.org/t/p/${Constants.imageSize}/${movieDetails.backdrop_path ?: movieDetails.poster_path}")
                        .crossfade(enable = true).build(),
                    contentDescription = "Poster",
                    contentScale = ContentScale.Crop,
                    modifier = modifier.fillParentMaxSize(),
                )
                Box(
                    modifier = modifier
                        .fillParentMaxSize()
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent, Color.Black.copy(alpha = 0.6f)
                                )
                            )
                        ),
                )
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .align(Alignment.TopCenter)
                        .background(color = Color.Transparent)
                        .padding(
                            (LocalAppDimens.current.medium)
                        ),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    MuviiIconButton(onClick = onNavigateUp) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = MaterialTheme.colorScheme.secondary
                        )
                    }
                    MuviiIconButton(onClick = {
                        onMarkUnmarkFavourite()
                    }) {
                        if (movieDetails.favourite) {
                            Icon(
                                imageVector = Icons.Filled.Favorite,
                                tint = MaterialTheme.colorScheme.secondary,
                                contentDescription = "Favourite",
                            )
                        } else {
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                tint = MaterialTheme.colorScheme.secondary,
                                contentDescription = "Favourite",
                            )
                        }
                    }
                }
            }
        }

        item {
            Text(
                text = movieDetails.title,
                style = MaterialTheme.typography.displayMedium,
                textAlign = TextAlign.Center,
                modifier = modifier.padding(
                    top = LocalAppDimens.current.medium,
                    start = LocalAppDimens.current.medium,
                    end = LocalAppDimens.current.medium

                )
            )
        }

        item {
            FlowRow(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(
                        top = LocalAppDimens.current.extra_large,
                        start = LocalAppDimens.current.extra_large,
                        end = LocalAppDimens.current.extra_large,


                        ),
                mainAxisAlignment = FlowMainAxisAlignment.Center,
                crossAxisAlignment = FlowCrossAxisAlignment.Center,
                mainAxisSpacing = LocalAppDimens.current.medium,
                crossAxisSpacing = LocalAppDimens.current.medium
            ) {
                movieDetails.genres.forEach { name ->
                    RoundedRectangleChip(label = name)
                }
            }
        }

        item {
            Text(
                text = "Storyline",
                style = MaterialTheme.typography.displaySmall,
                modifier = modifier.padding(
                    top = LocalAppDimens.current.extra_large,
                    start = LocalAppDimens.current.extra_large,
                    end = LocalAppDimens.current.extra_large,
                )
            )
        }

        item {
            Text(
                text = movieDetails.overview,
                style = MaterialTheme.typography.bodyMedium,
                modifier = modifier.padding(
                    top = LocalAppDimens.current.extra_large,
                    start = LocalAppDimens.current.extra_large,
                    end = LocalAppDimens.current.extra_large,
                ),
                textAlign = TextAlign.Justify
            )
        }
        item {
            Divider(
                modifier = modifier.padding(
                    top = LocalAppDimens.current.extra_large,
                    start = LocalAppDimens.current.extra_large,
                    end = LocalAppDimens.current.extra_large,
                )
            )
        }
        item {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(LocalAppDimens.current.large),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                MovieInfo(label = "Release Date", value = movieDetails.release_date)
                MovieInfo(
                    label = "Rating", value = movieDetails.vote_average.toString().trimSubstring(
                        startIndex = 0, endIndex = 3
                    )
                )
            }
        }

        item {
            Divider(
                modifier = modifier.padding(
                    top = LocalAppDimens.current.extra_large,
                    start = LocalAppDimens.current.extra_large,
                    end = LocalAppDimens.current.extra_large,
                )
            )
        }

        item {
            Box(
                modifier = modifier.wrapContentSize(), contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(LocalAppDimens.current.large),
                    verticalArrangement = Arrangement.spacedBy(
                        LocalAppDimens.current.large
                    ),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Cast",
                        style = MaterialTheme.typography.displaySmall,
                        textAlign = TextAlign.Center,
                        modifier = modifier.align(Alignment.Start)
                    )
                    LazyRow(horizontalArrangement = Arrangement.spacedBy(LocalAppDimens.current.large)) {
                        items(items = castList, key = { it.cast_id }) { cast ->
                            cast.profile_path?.let { profileUrl ->
                                CastCard(
                                    profileUrl = profileUrl,
                                    castId = cast.cast_id,
                                    name = cast.name,
                                    onOpenProfile = onOpenProfile,
                                    onToggleFollow = onToggleFollow,
                                    vectorId = if (cast.following) R.drawable.ic_baseline_check_24 else R.drawable.ic_baseline_add_24
                                )
                            }
                        }
                    }
                }
                AnimatedVisibility(
                    visible = castLoading,
                    enter = fadeIn(),
                    exit = fadeOut()
                ) {
                    JumpingBubblesLoadingIndicator()
                }
            }
        }

        item {

            Text(
                text = "Similar movies",
                modifier = modifier.padding(LocalAppDimens.current.large),
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.displaySmall
            )

            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(LocalAppDimens.current.large)
            ) {

                LazyRow(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(LocalAppDimens.current.medium)
                ) {
                    items(items = similarMovies, key = { it.id }) { movie ->
                        TrendingMovieItem(
                            poster_path = movie.poster_path ?: "",
                            movieId = movie.id,
                            context = context,
                            onSelect = onOpenSimilarMovie,
                            modifier = Modifier.padding(horizontal = LocalAppDimens.current.large)
                        )
                    }
                }

                AnimatedVisibility(
                    visible = similarMoviesLoading,
                    enter = fadeIn(),
                    exit = fadeOut()
                ) {
                    JumpingBubblesLoadingIndicator()
                }
            }
        }

    }
}