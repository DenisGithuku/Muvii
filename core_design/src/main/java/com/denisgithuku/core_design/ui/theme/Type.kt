package com.denisgithuku.core_design.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.denisgithuku.core_design.R



val OpenSans = FontFamily(
    Font(R.font.open_sans_medium, FontWeight.Medium),
    Font(R.font.open_sans_semi_bold, weight = FontWeight.SemiBold),
    Font(R.font.open_sans_bold, weight = FontWeight.Bold),
    Font(R.font.open_sans_regular, weight = FontWeight.Normal),
    Font(R.font.open_sans_italic),
)


val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontSize = 16.sp),
    bodyMedium = TextStyle(
        fontFamily = OpenSans,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    displayLarge = TextStyle(
        fontFamily = OpenSans,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    displayMedium = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    displaySmall = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    titleMedium = TextStyle(
        fontFamily = OpenSans,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    titleLarge = TextStyle(
        fontFamily = OpenSans,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    labelLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp),
    bodySmall = TextStyle(
        fontFamily = OpenSans,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    labelSmall = TextStyle(
        fontFamily = OpenSans,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp
    )

)
