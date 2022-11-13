package com.denisgithuku.movies.presentation.components

import android.content.Context
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun TrendingMovieItem(
    poster_path: String,
    movieId: Int,
    context: Context,
    modifier: Modifier = Modifier,
    onSelect: (Int) -> Unit,
    minWidth: Dp = 200.dp,
    minHeight: Dp = 120.dp,
    maxWidth: Dp = 200.dp,
    maxHeight: Dp = 120.dp
) {

    AsyncImage(model = ImageRequest.Builder(
        context = context
    ).data(
        "https://image.tmdb.org/t/p/w342/${poster_path}"
    ).crossfade(1000).build(),
        contentScale = ContentScale.Crop,
        contentDescription = "Trending movieDetails",
        modifier = modifier
            .sizeIn(
                minWidth, minHeight, maxWidth, maxHeight
            )
            .clip(MaterialTheme.shapes.large)
            .clickable {
                onSelect(movieId)
            })


}
