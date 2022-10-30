package com.denisgithuku.core_data.providers

import kotlinx.coroutines.CoroutineDispatcher

data class DispatcherProvider(
    val defaultDispatcher: CoroutineDispatcher,
    val ioDispatcher: CoroutineDispatcher,
    val unconfinedDispatcher: CoroutineDispatcher,
    val mainDispatcher: CoroutineDispatcher
    )
