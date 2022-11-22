package com.denisgithuku.movies.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.denisgithuku.core_data.Constants
import com.denisgithuku.core_design.ui.components.MuviiIconButton
import com.denisgithuku.core_design.ui.components.RoundedRectangleChip
import com.denisgithuku.core_design.ui.theme.LocalAppDimens
import com.denisgithuku.movies.domain.model.Genre
import com.githukudenis.movies.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieItem(
    modifier: Modifier = Modifier,
    title: String,
    poster: String,
    movieId: Int,
    favourite: Boolean,
    overview: String,
    genres: List<Genre>,
    onOpen: (Int) -> Unit,
    onToggleFavourite: () -> Unit,
    minWidth: Dp = 100.dp,
    minHeight: Dp = 100.dp,
    maxWidth: Dp = 100.dp,
    maxHeight: Dp = 120.dp
) {
    val context = LocalContext.current
    Card(
        onClick = { onOpen(movieId) }, colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(2.dp),
            contentColor = MaterialTheme.colorScheme.onSurface,
        ), modifier = Modifier.padding(LocalAppDimens.current.large)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .heightIn(min = minHeight, max = maxHeight)
                .padding(12.dp),
        ) {
            if (poster.isNotEmpty()) {
                AsyncImage(model = ImageRequest.Builder(context)
                    .data("https://image.tmdb.org/t/p/${Constants.imageSize}/$poster")
                    .crossfade(true).build(),
                    contentDescription = "MovieDetails image",
                    modifier = modifier.sizeIn(
                        maxWidth = maxWidth,
                        minWidth = minWidth,
                    ).clip(
                        shape = RoundedCornerShape(
                            16.dp
                        )
                    ),
                    contentScale = ContentScale.Crop,
                    onError = {
                        ImageRequest.Builder(context).data(
                                R.drawable.ic_broken_image_24
                            ).build()

                    })
            }
            Column(
                modifier = modifier.fillMaxWidth().padding(10.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = title,
                        modifier = modifier.weight(weight = 1f, fill = false),
                        style = MaterialTheme.typography.bodySmall,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 2
                    )
                    MuviiIconButton(onClick = { onToggleFavourite() }) {
                        Icon(
                            painter = painterResource(id = if (favourite) com.denisgithuku.core_design.R.drawable.bookmark_favourite_filled else com.denisgithuku.core_design.R.drawable.favourites),
                            contentDescription = "Favourite icon",
                        )
                    }
                }

                LazyRow(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    items(items = genres) { genre ->
                        RoundedRectangleChip(label = genre.name)
                    }
                }
            }
        }
    }
}


@Composable
private fun InfoItem(rating: Double, modifier: Modifier) {
    Box(
        modifier = modifier.background(
            color = MaterialTheme.colorScheme.secondary, shape = RoundedCornerShape(16.dp)
        ), contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = modifier.padding(4.dp),
            horizontalArrangement = Arrangement.spacedBy(LocalAppDimens.current.medium),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = rating.toString(), style = MaterialTheme.typography.labelMedium.copy(
                    color = MaterialTheme.colorScheme.onSecondary
                )
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "Rating",
                tint = MaterialTheme.colorScheme.onSecondary
            )
        }
    }
}