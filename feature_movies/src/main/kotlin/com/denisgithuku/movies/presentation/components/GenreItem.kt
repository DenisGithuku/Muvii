package com.denisgithuku.movies.presentation.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateSizeAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.denisgithuku.movies.domain.model.Genre

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun GenreItem(
    genre: Genre,
    isSelected: Boolean,
    size: Dp,
    onSelect: (Genre) -> Unit,
    modifier: Modifier,
) {
    val animateSelectedColor =
        animateColorAsState(targetValue = if (isSelected) MaterialTheme.colors.surface else Color.Transparent)
    Surface(
        onClick = {
            onSelect(genre)
        },
        color = animateSelectedColor.value,
        modifier = modifier
            .sizeIn(size)
            .padding(4.dp),
        shape = RoundedCornerShape(6.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
            Text(
                text = genre.name,
                style = TextStyle(
                    textAlign = TextAlign.Center
                )
            )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GenreItemPreview() {
    GenreItem(
        genre = Genre(0, "Horror"),
        isSelected = true,
        size = 40.dp,
        onSelect = {},
        modifier = Modifier
    )
}
