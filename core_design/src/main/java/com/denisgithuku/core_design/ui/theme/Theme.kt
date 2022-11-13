package com.denisgithuku.core_design.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration


private val DarkColorPalette = darkColorScheme(
    primary = Blue900,
    secondary = Orange900,
    background = Blue900,
    surface = Blue700,
    onPrimary = White,
    onSecondary = Color.White,
    onBackground = White,
    onSurface = White,
    )

private val LightColorPalette = lightColorScheme(
    primary = Blue500,
    secondary = Orange500,
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.Black.copy(alpha = 0.8f),
    error = Color.White,
)

@Composable
fun ProvideDimens(
    dimens: Dimens,
    content: @Composable () -> Unit,
) {
    val dimensionSet = remember {
        dimens
    }
    CompositionLocalProvider(LocalAppDimens provides dimensionSet, content = content)
}

val LocalAppDimens = staticCompositionLocalOf { swDimens }


@Composable
fun MuviiTheme(darkTheme: Boolean, content: @Composable () -> Unit) {
    val colorScheme = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    val configuration = LocalConfiguration.current
    val dimens = if (configuration.screenWidthDp <= 360) smallDimens else swDimens

    CompositionLocalProvider(LocalAppDimens provides dimens) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}
