package com.denisgithuku.movies.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.denisgithuku.design.ui.theme.LocalAppDimens

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
) {
    val query = remember {
        mutableStateOf("")
    }
    TextField(
        value = query.value,
        onValueChange = { newText ->
            query.value = newText.trim { it == ' ' }
        },
        placeholder = {
            Text(
                "Search by keyword", style = MaterialTheme.typography.caption.copy(fontSize = 10.sp)
            )
        },
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            backgroundColor = Color.Black.copy(alpha = 0.1f)
        ),
        shape = CircleShape,
        trailingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
            }
        },
        modifier = modifier
            .fillMaxWidth()
            .padding(
                vertical = LocalAppDimens.current.medium, horizontal = LocalAppDimens.current.large
            ),
//    contentPadding = LocalAppDimens.current.medium
    )
}