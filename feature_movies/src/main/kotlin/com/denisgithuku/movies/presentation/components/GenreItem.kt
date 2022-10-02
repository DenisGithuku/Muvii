package com.denisgithuku.movies.presentation.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateSizeAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun GenreItem(
    genreId: Int,
    name: String,
    isSelected: Boolean,
    modifier: Modifier = Modifier,
    onSelect: (Int) -> Unit,
) {
    val animateSelectedColor =
        animateColorAsState(
            targetValue = if (isSelected) MaterialTheme.colors.secondary else MaterialTheme.colors.secondary.copy(
                alpha = 0.5f
            )
        )
    val animateSize = animateSizeAsState(
        targetValue = if (isSelected) Size(
            width = 50.dp.value,
            height = 50.dp.value
        ) else Size(width = 45.dp.value, height = 45.dp.value),
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessLow
        )
    )
    Column(
        modifier = modifier.padding(10.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = modifier
            .sizeIn(minWidth = animateSize.value.width.dp, minHeight = animateSize.value.height.dp)
            .background(color = animateSelectedColor.value, shape = MaterialTheme.shapes.large)
            .clickable { onSelect(genreId) }) {}

        Text(
            text = name,
            style = TextStyle(
                textAlign = TextAlign.Center
            )
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GenreItemPrev() {
    GenreItem(name = "Action", genreId = 0, isSelected = true, onSelect = {})
}
