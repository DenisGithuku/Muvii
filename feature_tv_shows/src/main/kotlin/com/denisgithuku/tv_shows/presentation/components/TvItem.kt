package com.denisgithuku.tv_shows.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
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
import com.denisgithuku.core_design.R
import com.denisgithuku.core_design.ui.components.MuviiIconButton
import com.denisgithuku.core_design.ui.theme.LocalAppDimens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TvItem(
    modifier: Modifier = Modifier,
    title: String,
    poster: String,
    tvId: Int,
    favourite: Boolean,
    onOpen: (Int) -> Unit,
    onToggleFavourite: () -> Unit,
    minWidth: Dp = 100.dp,
    maxWidth: Dp = 100.dp,
    minHeight: Dp = 100.dp,
    maxHeight: Dp = 120.dp
) {
    val context = LocalContext.current
    Card(
        onClick = { onOpen(tvId) },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(2.dp),
            contentColor = MaterialTheme.colorScheme.onSurface,
        ),
        modifier = modifier.padding(LocalAppDimens.current.large)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .heightIn(min = minHeight, max = maxHeight),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
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
                            topStart = 16.dp,
                            bottomStart = 16.dp
                        )
                    ),
                    contentScale = ContentScale.Crop
                )
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
                            painter = painterResource(id = if (favourite) R.drawable.bookmark_favourite_filled else R.drawable.favourites),
                            contentDescription = "Favourite icon",
                        )
                    }
                }
            }
        }
    }
}
