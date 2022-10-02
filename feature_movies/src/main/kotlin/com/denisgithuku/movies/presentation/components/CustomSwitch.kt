package com.denisgithuku.movies.presentation.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.denisgithuku.design.ui.theme.LocalAppDimens

@Composable
fun CustomSwitch(
    modifier: Modifier = Modifier.padding(LocalAppDimens.current.medium),
    gapBetweenIndicatorAndThumb: Dp = 4.dp,
    strokeWidth: Dp = 2.dp,
    width: Dp = 36.dp,
    height: Dp = 20.dp,
    isToggleOn: Boolean = false,
    selectedColor: Color,
    unSelectedColor: Color,
    onToggleOption: () -> Unit
) {

    val thumbRadius = (height / 2) - gapBetweenIndicatorAndThumb
    val color =
        animateColorAsState(targetValue = if (isToggleOn) selectedColor else unSelectedColor,
            animationSpec = tween(
                durationMillis = 600,
                easing = FastOutLinearInEasing
            ))

    val thumbOffset = animateFloatAsState(targetValue = if (isToggleOn) {
        with(LocalDensity.current) {
            (width - thumbRadius - gapBetweenIndicatorAndThumb).toPx()
        }
    } else with(
        LocalDensity.current) {
        (thumbRadius + gapBetweenIndicatorAndThumb).toPx()
    })
    Canvas(
        modifier = modifier
            .sizeIn(
                minHeight = height,
                maxHeight = height,
                minWidth = width,
                maxWidth = width
            )
            .pointerInput(isToggleOn) {
                detectTapGestures(
                    onTap = {
                        onToggleOption()
                    }
                )
            }
    ) {
        drawRoundRect(
            color = color.value,
            cornerRadius = CornerRadius(x = 10.dp.toPx(), y = 12.dp.toPx()),
            style = Stroke(
                width = strokeWidth.value
            )
        )
        drawCircle(
            color = color.value,
            center = Offset(x = thumbOffset.value, y = size.height / 2),
            radius = thumbRadius.toPx()
        )
    }

}

@Preview(showBackground = true)
@Composable
fun CustomSwitchPrev() {
    CustomSwitch(
        selectedColor = Color.Green,
        isToggleOn = true,
        unSelectedColor = Color.LightGray,
        onToggleOption = {}
    )
}
