package com.denisgithuku.movies.presentation.screens.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001al\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001aD\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u00042\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\rH\u0007\u001a\u0096\u0001\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00062\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\rH\u0003\u001a \u0010&\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a\b\u0010\'\u001a\u00020\u0001H\u0007\u001a\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u0007H\u0002\u00a8\u0006*"}, d2 = {"BottomSheetPrev", "", "DialogContent", "isDarkTheme", "", "sortTypes", "", "Lcom/denisgithuku/movies/domain/common/SortType;", "selectedSortType", "adultContentEnabled", "onToggleEnableAdultContent", "Lkotlin/Function0;", "onChangeSortType", "Lkotlin/Function1;", "onToggleTheme", "onDismissRequest", "MoviesListScreen", "snackbarHostState", "Landroidx/compose/material3/SnackbarHostState;", "homeViewModel", "Lcom/denisgithuku/movies/presentation/screens/home/HomeViewModel;", "isInDarkTheme", "onOpenDetails", "", "modifier", "Landroidx/compose/ui/Modifier;", "trendingMoviesLoading", "selectedGenre", "onChangeGenre", "onSearchMovies", "", "onOpenSettings", "genres", "Lcom/denisgithuku/movies/domain/model/Genre;", "movies", "Lcom/denisgithuku/movies/domain/model/Movie;", "trending_movies", "Lcom/denisgithuku/movies/domain/model/TrendingMovie;", "TopBar", "TopBarPreview", "getSortType", "sortType", "feature_movies_release"})
public final class MoviesListScreenKt {
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.lifecycle.compose.ExperimentalLifecycleComposeApi.class})
    public static final void MoviesListScreen(@org.jetbrains.annotations.NotNull()
    androidx.compose.material3.SnackbarHostState snackbarHostState, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.presentation.screens.home.HomeViewModel homeViewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onToggleTheme, boolean isInDarkTheme, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onOpenDetails) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void MoviesListScreen(androidx.compose.ui.Modifier modifier, boolean trendingMoviesLoading, int selectedGenre, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onChangeGenre, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchMovies, kotlin.jvm.functions.Function0<kotlin.Unit> onOpenSettings, java.util.List<com.denisgithuku.movies.domain.model.Genre> genres, java.util.List<com.denisgithuku.movies.domain.model.Movie> movies, java.util.List<com.denisgithuku.movies.domain.model.TrendingMovie> trending_movies, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onOpenDetails) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DialogContent(boolean isDarkTheme, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.denisgithuku.movies.domain.common.SortType> sortTypes, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.common.SortType selectedSortType, boolean adultContentEnabled, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onToggleEnableAdultContent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.denisgithuku.movies.domain.common.SortType, kotlin.Unit> onChangeSortType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onToggleTheme, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TopBar(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onOpenSettings) {
    }
    
    private static final java.lang.String getSortType(com.denisgithuku.movies.domain.common.SortType sortType) {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    public static final void TopBarPreview() {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    public static final void BottomSheetPrev() {
    }
}