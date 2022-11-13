package com.denisgithuku.movies.presentation.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.denisgithuku.core_design.ui.theme.LocalAppDimens


@Composable
fun GenreItem(
    genreId: Int,
    name: String,
    isSelected: Boolean,
    modifier: Modifier = Modifier,
    onSelect: (Int) -> Unit,
) {
    val color = animateColorAsState(
        targetValue = if (isSelected) MaterialTheme.colorScheme.secondary else MaterialTheme.colorScheme.onBackground,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMediumLow
        )
    )
    val indicator = animateSizeAsState(
        targetValue = if (isSelected) Size(width = 40.dp.value, height = 4.dp.value) else Size(width = 0.dp.value, height = 0.dp.value),
        animationSpec = tween(
            durationMillis = 1000,
            easing = FastOutSlowInEasing
        )
    )

    Column(
        modifier = modifier.padding(LocalAppDimens.current.small),
        verticalArrangement = Arrangement.spacedBy(LocalAppDimens.current.small),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = name,
            style = MaterialTheme.typography.labelMedium.copy(
                color = color.value
            )
        )
        Canvas(
            modifier = modifier.sizeIn(minWidth = 40.dp, minHeight = 40.dp),
        ) {
            drawRoundRect(color = color.value, size = indicator.value, cornerRadius = CornerRadius(x = 12.dp.toPx(), y = 12.dp.toPx()))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GenreItemPrev() {
    GenreItem(name = "Action", genreId = 0, isSelected = true, onSelect = {})
}
