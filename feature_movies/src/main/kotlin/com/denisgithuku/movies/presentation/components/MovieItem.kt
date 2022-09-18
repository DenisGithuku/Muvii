package com.denisgithuku.movies.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.denisgithuku.movies.domain.model.Movie

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MovieItem(
    modifier: Modifier,
    onClick: (Movie) -> Unit,
    movie: Movie
) {
    Surface(
        onClick = { onClick(movie) },
        shape = RoundedCornerShape(16.dp),
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current).data(movie.poster_path).crossfade(true).build(),
                contentDescription = null,
                modifier = modifier
                    .clip(RoundedCornerShape(16.dp))
                    .sizeIn(maxWidth = 100.dp, maxHeight = 150.dp)
                ,
                contentScale = ContentScale.Crop,
            )
            Column(verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = movie.title,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                )
            }
        }
    }
}
