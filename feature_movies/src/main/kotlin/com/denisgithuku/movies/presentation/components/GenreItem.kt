package com.denisgithuku.movies.presentation.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
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
        targetValue = if (isSelected) Size(
            width = 30.dp.value,
            height = 4.dp.value
        ) else Size(width = 0.dp.value, height = 0.dp.value),
        animationSpec = tween(
            durationMillis = 500,
            easing = FastOutSlowInEasing
        )
    )

    Column(
        modifier = modifier
            .background(color = Color.Transparent, shape = RoundedCornerShape(16.dp))
            .clickable {
                onSelect(genreId)
            }
            .padding(LocalAppDimens.current.medium),
        verticalArrangement = Arrangement.spacedBy(LocalAppDimens.current.small),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = name,
            style = MaterialTheme.typography.labelMedium.copy(
                color = color.value
            )
        )
        Box(
            modifier = Modifier
                .size(width = indicator.value.width.dp, height = indicator.value.height.dp)
                .background(color = color.value, shape = MaterialTheme.shapes.large)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GenreItemPrev() {
    GenreItem(name = "Action", genreId = 0, isSelected = true, onSelect = {})
}
