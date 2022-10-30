package com.denisgithuku.core_design.ui.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimens(
    val tiny: Dp,
    val extra_small: Dp,
    val small: Dp,
    val medium: Dp,
    val large: Dp,
    val extra_large: Dp,
    val button_width: Dp,
    val button_height: Dp,
    val default: Dp = 0.dp,
)

val smallDimens = Dimens(
    tiny = 0.5f.dp,
    extra_small = 1.dp,
    small = 2.dp,
    medium = 4.dp,
    large = 8.dp,
    extra_large = 16.dp,
    button_width = 100.dp,
    button_height = 40.dp
)

val swDimens = Dimens(
    tiny = 2.dp,
    extra_small = 4.dp,
    small = 8.dp,
    medium = 12.dp,
    large = 16.dp,
    extra_large = 32.dp,
    button_width = 100.dp,
    button_height = 56.dp
)
