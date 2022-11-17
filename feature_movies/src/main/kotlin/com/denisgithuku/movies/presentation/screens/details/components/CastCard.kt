package com.denisgithuku.movies.presentation.screens.details.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.denisgithuku.core_data.Constants
import com.denisgithuku.core_design.ui.theme.LocalAppDimens

@Composable
fun CastCard(
    profileUrl: String,
    castId: Int,
    name: String,
    onOpenProfile: (Int) -> Unit,
    onToggleFollow: (Int) -> Unit,
    modifier: Modifier = Modifier,
    @DrawableRes vectorId: Int
) {
    val context = LocalContext.current

    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(LocalAppDimens.current.medium),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = modifier
                .sizeIn(minWidth = 80.dp, minHeight = 80.dp)
                .clip(
                    CircleShape
                )
                .clickable {
                    onOpenProfile(castId)
                }
        ) {
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data("https://image.tmdb.org/t/p/${Constants.imageSize}/$profileUrl")
                    .crossfade(true)
                    .build(),
                contentScale = ContentScale.Crop,
                contentDescription = "Cast profile",
                modifier = modifier.matchParentSize()
            )
            Box(modifier = modifier
                .sizeIn(30.dp)
                .align(Alignment.BottomEnd)
//                .padding(LocalAppDimens.current.medium)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .clickable {
                    onToggleFollow(castId)
                }
                .padding(LocalAppDimens.current.medium),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = vectorId),
                    tint = MaterialTheme.colorScheme.secondary,
                    contentDescription = "Follow Button"
                )
            }
        }
        Text(
            text = name,
            style = MaterialTheme.typography.labelMedium,
            textAlign = TextAlign.Center
        )

    }

}