package com.denisgithuku.core.providers

import kotlinx.coroutines.CoroutineDispatcher

data class DispatcherProvider(
    val defaultDispatcher: CoroutineDispatcher,
    val ioDispatcher: CoroutineDispatcher,
    val unconfinedDispatcher: CoroutineDispatcher,
    val mainDispatcher: CoroutineDispatcher
    )
