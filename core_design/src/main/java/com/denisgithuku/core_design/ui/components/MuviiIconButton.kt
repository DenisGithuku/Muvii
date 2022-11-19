package com.denisgithuku.core_design.ui.components

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
        modifier = modifier
        .background(
            MaterialTheme.colorScheme.surfaceVariant, shape = MaterialTheme.shapes.large
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