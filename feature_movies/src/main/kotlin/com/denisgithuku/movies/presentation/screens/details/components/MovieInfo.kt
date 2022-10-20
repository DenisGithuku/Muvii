package com.denisgithuku.movies.presentation.screens.details.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.denisgithuku.design.ui.theme.LocalAppDimens

@Composable
fun MovieInfo(
    label: String, value: String
) {
    Column(
        modifier = Modifier.padding(LocalAppDimens.current.small),
        verticalArrangement = Arrangement.spacedBy(
            LocalAppDimens.current.small
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = label, style = MaterialTheme.typography.subtitle1)
        Text(
            text = value, style = MaterialTheme.typography.body2
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MovieInfoPrev() {
    MovieInfo(label = "Release Data", value = "22-7-22")
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun MovieInfoPrevNight() {
    MovieInfo(label = "Release Data", value = "22-7-22")
}