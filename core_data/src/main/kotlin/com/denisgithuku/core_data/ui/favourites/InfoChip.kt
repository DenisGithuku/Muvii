package com.denisgithuku.core_data.ui.favourites

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.denisgithuku.core_design.ui.theme.LocalAppDimens

@Composable
fun InfoChip(
    modifier: Modifier = Modifier, label: String
) {
    Surface(
        shape = CircleShape,
        border = BorderStroke(
            width = LocalAppDimens.current.extra_small,
            color = MaterialTheme.colorScheme.secondary.copy(alpha = 0.7f)
        ),
        color = Color.Transparent
    ) {
        Column(
            verticalArrangement = Arrangement.Center,

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = label,
                style = MaterialTheme.typography.bodySmall,
                modifier = modifier.padding(
                    horizontal = LocalAppDimens.current.large,
                    vertical = LocalAppDimens.current.medium
                ),
            )
        }
    }
}
