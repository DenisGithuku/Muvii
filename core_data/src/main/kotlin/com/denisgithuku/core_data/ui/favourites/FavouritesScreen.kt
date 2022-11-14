package com.denisgithuku.core_data.ui.favourites

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.denisgithuku.core_data.domain.model.FavouriteMovie
import com.denisgithuku.core_design.ui.components.MuviiIconButton
import com.denisgithuku.core_design.ui.theme.LocalAppDimens

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun FavouritesScreen(
    snackbarHostState: SnackbarHostState
) {
    val favouritesViewModel: FavouritesViewModel = hiltViewModel()
    val uiState = favouritesViewModel.uiState.collectAsStateWithLifecycle().value

    if (uiState.isLoading) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
    }

    if (uiState.error.isNotEmpty()) {
        LaunchedEffect(uiState.error, snackbarHostState) {
            snackbarHostState.showSnackbar(message = uiState.error)
        }
    }

    FavouritesScreen(favourites = uiState.favourites)
}

@Composable
private fun FavouritesScreen(
    favourites: List<FavouriteMovie>
) {
    LazyColumn {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(LocalAppDimens.current.large),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Favourites",
                    style = MaterialTheme.typography.displayLarge
                )
            }
        }

        items(favourites) { favouriteMovie ->
            FavouriteMovieCard(
                favouriteMovie = favouriteMovie,
                onToggleFavourite = { /*TODO*/ },
                onOpenDetails = {}
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavouriteMovieCard(
    modifier: Modifier = Modifier,
    favouriteMovie: FavouriteMovie,
    onToggleFavourite: () -> Unit,
    onOpenDetails: (FavouriteMovie) -> Unit
) {
    val context = LocalContext.current
    var expanded = rememberSaveable {
        mutableStateOf(false)
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(LocalAppDimens.current.large),
        onClick = { onOpenDetails(favouriteMovie) },
        shape = MaterialTheme.shapes.large
    ) {
        AsyncImage(
            model = ImageRequest
                .Builder(context = context)
                .data(
                    "https://image.tmdb.org/t/p/original/${favouriteMovie.poster_path}"
                )
                .crossfade(1000).build(),
            contentScale = ContentScale.Crop,
            contentDescription = "Favourite Movie poster",
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(max = 250.dp)
        )

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = favouriteMovie.title,
                style = MaterialTheme.typography.displaySmall
            )
            MuviiIconButton(onClick = { onToggleFavourite() }) {
                Icon(
                    painter = painterResource(id = if (favouriteMovie.favourite) com.denisgithuku.core_design.R.drawable.favourites else com.denisgithuku.core_design.R.drawable.bookmark_favourite_filled),
                    contentDescription = "Favourite icon"
                )
            }
        }

        Text(
            text = favouriteMovie.overview,
            maxLines = if (expanded.value) 5 else 2,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioLowBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
                .clickable {
                    expanded.value = !expanded.value
                }
                .padding(8.dp)
        )

    }
}