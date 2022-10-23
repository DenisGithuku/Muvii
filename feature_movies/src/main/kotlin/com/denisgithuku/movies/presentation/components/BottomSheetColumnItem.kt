package com.denisgithuku.movies.presentation.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.denisgithuku.design.ui.theme.LocalAppDimens

@Composable
fun BottomSheetColumnItem(
    modifier: Modifier = Modifier,
    content: @Composable (RowScope.() -> Unit),
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = LocalAppDimens.current.medium),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        content = content
    )
}