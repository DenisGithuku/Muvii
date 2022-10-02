package com.denisgithuku.design.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration

private val DarkColorPalette = darkColors(
    primary = Blue900,
    primaryVariant = Pink900,
    secondary = Orange900,
    background = Blue900,
    surface = Blue900,
    onPrimary = White,
    onSecondary = Color.White,
    onBackground = White,
    onSurface = White,

    )

private val LightColorPalette = lightColors(
    primary = Color.White,
    primaryVariant = Pink900,
    secondary = Orange500,
    background = Pink900.copy(alpha = 0.07f),
    surface = Color.White,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.Black,
    onSurface = Color.Black,
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

val LocalAppDimens = compositionLocalOf { smallDimens }


@Composable
fun MuviiTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    val configuration = LocalConfiguration.current
    val dimens = if (configuration.screenWidthDp <= 360) smallDimens else swDimens

    CompositionLocalProvider(LocalAppDimens provides dimens) {
        MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}
