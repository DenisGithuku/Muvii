package com.denisgithuku.core_design.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun MuviiEditableBaseInputField(
    textField: (@Composable () -> Unit)
) {
        textField()

}

class MuviiEditableInputFieldState(
    val hint: String,
    initialText: String
) {
    var text by mutableStateOf(initialText)
    val isHint: Boolean
        get() = text == hint

    companion object {
        val saver: Saver<MuviiEditableInputFieldState, *> = listSaver(
            save = {
                listOf(
                    it.hint,
                    it.text
                )
            },
            restore = {
                MuviiEditableInputFieldState(
                    hint = it[0],
                    initialText = it[1]
                )
            }
        )
    }
}

@Composable
fun rememberMuviiEditableUserInputState(
    hint: String
): MuviiEditableInputFieldState = rememberSaveable(
    hint, saver =
    MuviiEditableInputFieldState.saver
) {
    MuviiEditableInputFieldState(hint, "")
}