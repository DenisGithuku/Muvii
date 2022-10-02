package com.denisgithuku.movies.presentation.screens.home

import com.denisgithuku.core.UserMessage
import com.denisgithuku.movies.domain.common.SortType
import com.denisgithuku.movies.domain.model.Genre
import com.denisgithuku.movies.domain.model.Movie
import com.denisgithuku.movies.domain.model.TrendingMovie

data class HomeUiState(
    val genresLoading: Boolean = false,
    val selectedGenre: Int = Math.random().toInt(),
    val moviesLoading: Boolean = false,
    val trendingMovieLoading: Boolean = false,
    val genres: List<Genre> = listOf(),
    val movies: List<Movie> = listOf(),
    val trending: List<TrendingMovie> = listOf(),
    val adultContentEnabled: Boolean = true,
    val isSystemInDarkTheme: Boolean = false,
    val selectedSortType: SortType = SortType.Popularity,
    val sortTypes: List<SortType> = listOf(
        SortType.Popularity,
        SortType.ReleaseDate,
        SortType.VoteAverage,
        SortType.VoteCount,
        SortType.Revenue
    ),
    val userMessages: List<UserMessage> = listOf(),
)
