package com.denisgithuku.movies.domain.common

sealed class SortType(val orderType: OrderType = OrderType.DESCENDING) {
    object Popularity: SortType()
    object ReleaseDate: SortType()
    object VoteAverage: SortType()
    object VoteCount: SortType()
    object Revenue: SortType()
}

enum class OrderType {
    ASCENDING,
    DESCENDING
}
