package com.denisgithuku.design.ui.components

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.denisgithuku.design.ui.theme.LocalAppDimens

@Composable
fun ConfirmationDialog(
    @StringRes dialogTitleId: Int,
    @StringRes dialogDescriptionId: Int,
    @StringRes confirmButtonTextId: Int,
    @StringRes cancelButtonTextId: Int,
    onConfirm: () -> Unit,
    onCancel: () -> Unit,
    dismissable: Boolean
) {
    val context = LocalContext.current
    val dialogProperties = DialogProperties(
        dismissOnBackPress = dismissable,
        dismissOnClickOutside = dismissable,
    )
    Dialog(
        onDismissRequest = { onCancel() },
        properties = dialogProperties,
    ) {

        Box(
            modifier = Modifier
                .sizeIn(
                    minWidth = 200.dp,
                    minHeight = 300.dp
                )
                .background(color = MaterialTheme.colors.surface,
                    shape = MaterialTheme.shapes.large).padding(LocalAppDimens.current.medium),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .matchParentSize()
                    .padding(LocalAppDimens.current.medium),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(LocalAppDimens.current.medium)
            ) {
                Text(
                    text = context.getString(dialogTitleId),
                    style = MaterialTheme.typography.subtitle2
                )
                Text(
                    text = context.getString(dialogDescriptionId),
                    style = MaterialTheme.typography.body2,
                    textAlign = TextAlign.Center
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = LocalAppDimens.current.medium),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(onClick = { onConfirm() }) {
                        Text(
                            text = context.getString(confirmButtonTextId)
                        )
                    }
                    Button(onClick = { onCancel() }) {
                        Text(
                            text = context.getString(cancelButtonTextId)
                        )
                    }
                }
            }
        }
    }
}