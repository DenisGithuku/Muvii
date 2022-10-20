package com.githukudenis.core_navigation

open class Screen(private val routeId: String): Destination {
    override val route: String
        get() = routeId
}

object Home: Screen("home")
object Details: Screen("details")