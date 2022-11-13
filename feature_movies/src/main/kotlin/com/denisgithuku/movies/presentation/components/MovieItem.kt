package com.denisgithuku.movies.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.denisgithuku.core_data.Constants
import com.denisgithuku.core_design.ui.theme.LocalAppDimens
import com.githukudenis.movies.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieItem(
    modifier: Modifier = Modifier,
    title: String,
    rating: Double,
    poster: String,
    movieId: Int,
    onOpen: (Int) -> Unit,
) {
    val context = LocalContext.current
    Surface(
        onClick = { onOpen(movieId) },
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colorScheme.surface,
        shadowElevation = 2.dp,
        modifier = modifier.padding(
            horizontal = LocalAppDimens.current.large,
            vertical = LocalAppDimens.current.medium
        )
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            if (poster.isNotEmpty()) {
                AsyncImage(
                    model = ImageRequest.Builder(context)
                        .data("https://image.tmdb.org/t/p/${Constants.imageSize}/${poster}")
                        .crossfade(true).build(),
                    contentDescription = "MovieDetails image",
                    modifier = modifier
                        .weight(1f)
                        .sizeIn(maxWidth = 70.dp, maxHeight = 70.dp)
                        .clip(
                            RoundedCornerShape(16.dp)
                        ),
                    contentScale = ContentScale.Crop,
                    onError = {
                        ImageRequest.Builder(context)
                            .data(
                                R.drawable.ic_broken_image_24
                            )
                            .build()

                    }
                )
            }
//            Spacer(modifier = modifier.width(16.dp))
            Text(
                modifier = modifier.weight(3f),
                text = title, style = TextStyle(
                    fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            InfoItem(
                rating = rating, modifier = modifier.weight(1f)
            )
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
                text = rating.toString(),
                style = MaterialTheme.typography.labelMedium.copy(
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

@Preview(showBackground = true)
@Composable
fun MovieItemPreview() {
    MovieItem(title = "StarTrek", rating = 4.5, poster = "", movieId = 123, onOpen = {})
}
