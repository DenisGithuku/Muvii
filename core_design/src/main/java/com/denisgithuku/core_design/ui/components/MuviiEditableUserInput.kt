package com.denisgithuku.core_design.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.denisgithuku.core_design.ui.theme.LocalAppDimens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MuviiEditableUserInput(
    modifier: Modifier = Modifier,
    state: MuviiEditableInputFieldState,
    @DrawableRes vectorImageId: Int? = null,
    contentDescription: String,
    onClick: () -> Unit
) {
    MuviiEditableBaseInputField {
        TextField(
            value = state.text,
            onValueChange = {
                state.text = it
            },
            placeholder = {
                Text(
                    text = state.hint,
                    style = MaterialTheme.typography.bodySmall,
                    maxLines = 1,
                )
            },
            trailingIcon = {
                vectorImageId?.let {
                    IconButton(onClick = onClick) {
                        Icon(
                            painter = painterResource(it),
                            contentDescription = contentDescription
                        )
                    }
                }
            },
            shape = CircleShape,
            singleLine = true,
            maxLines = 1,
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            textStyle = MaterialTheme.typography.bodySmall,
            modifier = modifier.padding(LocalAppDimens.current.large)
        )
    }
}