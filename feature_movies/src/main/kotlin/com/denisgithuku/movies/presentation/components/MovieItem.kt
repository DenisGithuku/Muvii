package com.denisgithuku.movies.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.denisgithuku.design.ui.theme.LocalAppDimens
import com.githukudenis.movies.R

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MovieItem(
    modifier: Modifier = Modifier,
    title: String,
    rating: Double,
    poster: String,
    movieId: Int,
    onOpen: (Int) -> Unit,
) {
    Surface(
        onClick = { onOpen(movieId) },
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colors.surface,
        modifier = modifier.padding(horizontal = LocalAppDimens.current.large, vertical = LocalAppDimens.current.small)
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
                    model = ImageRequest.Builder(LocalContext.current)
                        .data("https://image.tmdb.org/t/p/original/${poster}").crossfade(true).build(),
                    contentDescription = "Movie image",
                    modifier = modifier
                        .weight(1f)
                        .sizeIn(maxWidth = 70.dp, maxHeight = 70.dp)
                        .clip(RoundedCornerShape(16.dp)
                        ),
                    contentScale = ContentScale.Crop,
                )
            } else {
                Image(
                    painter = painterResource(id = R.drawable.ic_broken_image_24),
                    contentDescription = "Movie image",
                    modifier = modifier
                        .weight(1f)
                        .sizeIn(maxWidth = 70.dp, maxHeight = 70.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .padding(16.dp)
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
                color = MaterialTheme.colors.secondary, shape = RoundedCornerShape(16.dp)
            ), contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = modifier.padding(4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = rating.toString(),
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colors.onSecondary
                )
            )
            Icon(imageVector = Icons.Default.Star, contentDescription = "Rating", tint = MaterialTheme.colors.onSecondary)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MovieItemPreview() {
    MovieItem(title = "StarTrek", rating = 4.5, poster = "", movieId = 123, onOpen = {})
}
