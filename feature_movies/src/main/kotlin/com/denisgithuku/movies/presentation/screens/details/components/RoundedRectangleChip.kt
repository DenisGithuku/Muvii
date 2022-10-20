package com.denisgithuku.movies.presentation.screens.details.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.denisgithuku.design.ui.theme.LocalAppDimens

@Composable
fun RoundedRectangleChip(
    modifier: Modifier = Modifier, label: String
) {
    Surface(
        shape = CircleShape,
        border = BorderStroke(
            width = LocalAppDimens.current.extra_small,
            color = MaterialTheme.colors.secondary.copy(alpha = 0.7f)
        ),
        color = Color.Transparent
    ) {
        Column(
            verticalArrangement = Arrangement.Center,

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = label,
                style = MaterialTheme.typography.subtitle1,
                modifier = modifier.padding(
                    horizontal = LocalAppDimens.current.large,
                    vertical = LocalAppDimens.current.medium
                ),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RoundedRectangleChipPreviewNotNight() {
    RoundedRectangleChip(label = "Action")
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun RoundedRectangleChipPreviewNight() {
    RoundedRectangleChip(label = "Action")
}
