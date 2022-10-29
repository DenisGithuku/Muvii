package com.denisgithuku.core_design.ui.components

import androidx.compose.foundation.background
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MuviiIconButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    icon: (@Composable () -> Unit)
) {
    IconButton(
        modifier = Modifier
        .background(
            MaterialTheme.colors.onBackground.copy(alpha = 0.2f), shape = MaterialTheme.shapes.large
        )
        , onClick = { onClick() }, content = icon)
}

@Preview(showSystemUi = true)
@Composable
fun MuviiIconButtonPrev() {
    MuviiIconButton(
        icon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
        onClick = {})
}