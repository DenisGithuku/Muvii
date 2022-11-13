package com.denisgithuku.movies.presentation.screens.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001av\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007\u001a<\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u000fH\u0007\u001a\u008e\u0001\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u000fH\u0003\u001a \u0010$\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007\u001a\b\u0010%\u001a\u00020\u0001H\u0007\u001a\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\tH\u0002\u00a8\u0006("}, d2 = {"BottomSheetPrev", "", "DialogContent", "modifier", "Landroidx/compose/ui/Modifier;", "isDarkTheme", "", "sortTypes", "", "Lcom/denisgithuku/movies/domain/common/SortType;", "selectedSortType", "adultContentEnabled", "onToggleEnableAdultContent", "Lkotlin/Function0;", "onChangeSortType", "Lkotlin/Function1;", "onToggleTheme", "onDismissRequest", "HomeScreen", "scaffoldState", "Landroidx/compose/material/ScaffoldState;", "homeViewModel", "Lcom/denisgithuku/movies/presentation/screens/home/HomeViewModel;", "onOpenDetails", "", "selectedGenre", "onChangeGenre", "onSearchMovies", "", "onOpenSettings", "genres", "Lcom/denisgithuku/movies/domain/model/Genre;", "movies", "Lcom/denisgithuku/movies/domain/model/Movie;", "trending_movies", "Lcom/denisgithuku/movies/domain/model/TrendingMovie;", "TopBar", "TopBarPreview", "getSortType", "sortType", "feature_movies_debug"})
public final class HomeScreenKt {
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull()
    androidx.compose.material.ScaffoldState scaffoldState, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.presentation.screens.home.HomeViewModel homeViewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onToggleTheme, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onOpenDetails) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    private static final void HomeScreen(androidx.compose.ui.Modifier modifier, int selectedGenre, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onChangeGenre, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchMovies, kotlin.jvm.functions.Function0<kotlin.Unit> onOpenSettings, java.util.List<com.denisgithuku.movies.domain.model.Genre> genres, java.util.List<com.denisgithuku.movies.domain.model.Movie> movies, java.util.List<com.denisgithuku.movies.domain.model.TrendingMovie> trending_movies, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onOpenDetails) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DialogContent(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean isDarkTheme, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.denisgithuku.movies.domain.common.SortType> sortTypes, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.common.SortType selectedSortType, boolean adultContentEnabled, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onToggleEnableAdultContent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.denisgithuku.movies.domain.common.SortType, kotlin.Unit> onChangeSortType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onToggleTheme, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
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