package com.githukudenis.core_navigation

import androidx.annotation.DrawableRes

sealed class Screen (val routeId: String, @DrawableRes val vectorId: Int? = null) {

    object Shows :
        Screen(routeId = "TV", vectorId = com.denisgithuku.core_design.R.drawable.tv_outline)

    object Home:
        Screen(routeId = "Movies", vectorId = com.denisgithuku.core_design.R.drawable.home_outline)

    object Details:
            Screen(routeId = "Details", null)
    object Search:
        Screen(routeId = "Search", vectorId = com.denisgithuku.core_design.R.drawable.search)

    object Favourites: Screen(
        routeId = "Favourites",
        vectorId = com.denisgithuku.core_design.R.drawable.favourites
    )
}
