package com.denisgithuku.core_data.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun JumpingBubblesLoadingIndicator(
    modifier: Modifier = Modifier,
    animationDelay: Int = 800,
    initialOffset: Float = 0.dp.value
) {

    val circles = listOf(
        remember {
            Animatable(initialValue = initialOffset)
        },
        remember {
            Animatable(initialValue = initialOffset)
        },
        remember {
            Animatable(initialValue = initialOffset)
        }
    )

    circles.forEachIndexed { index, animatable ->
        LaunchedEffect(Unit) {
            delay(timeMillis = (animationDelay / circles.size).toLong() * index)
            animatable.animateTo(
                targetValue = -20.dp.value,
                animationSpec = infiniteRepeatable(
                    tween(
                        durationMillis = animationDelay,
                        easing = LinearOutSlowInEasing
                    ),
                    repeatMode = RepeatMode.Reverse
                )
            )
        }
    }

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        circles.forEachIndexed { index, animatable ->
            if (index != 0) {
                Spacer(modifier = modifier.width(4.dp))
            }
            Box(
                modifier = modifier
                    .size(10.dp)
                    .offset(x = 0.dp, y = animatable.value.dp)
                    .clip(CircleShape)
                    .background(color = MaterialTheme.colorScheme.primary)
            )
        }

    }

}