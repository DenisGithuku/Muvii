package com.githukudenis.core_navigation

import androidx.annotation.DrawableRes

sealed class Screen(val routeId: String, @DrawableRes val vectorId: Int? = null) {

    object Tv :
        Screen(routeId = "Tv", vectorId = com.denisgithuku.core_design.R.drawable.tv_outline)

    object Movies :
        Screen(routeId = "Movie", vectorId = com.denisgithuku.core_design.R.drawable.home_outline)

    object MovieDetails : Screen(routeId = "MovieDetails", null)
    object Search :
        Screen(routeId = "Search", vectorId = com.denisgithuku.core_design.R.drawable.search)

    object Favourites : Screen(
        routeId = "Saved", vectorId = com.denisgithuku.core_design.R.drawable.favourites
    )

    object TvDetails : Screen(
        routeId = "TvDetails",
        vectorId = null
    )

    object Profile: Screen(
        routeId = "profile",
        vectorId = null
    )
}
