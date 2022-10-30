package com.denisgithuku.core_data

sealed class Resource<out T>(val data: T? = null, val throwable: Throwable? = null) {
    class Loading<out T>: Resource<T>()
    class Success<out T>(data: T): Resource<T>(data = data)
    class Error<out T>(throwable: Throwable?): Resource<T>(throwable = throwable)
}
