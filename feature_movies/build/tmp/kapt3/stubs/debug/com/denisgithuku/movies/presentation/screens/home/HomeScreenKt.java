package com.denisgithuku.movies.presentation.screens.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u001ah\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007\u001a0\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u000e\u00a2\u0006\u0002\b\u0013\u00a2\u0006\u0002\b\u0014H\u0007\u001a\b\u0010\u0015\u001a\u00020\u0001H\u0007\u001aX\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0003\u001a \u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007\u001a\u0012\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u001a \u0010#\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007\u001a\b\u0010%\u001a\u00020\u0001H\u0007\u001a\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\bH\u0002\u00a8\u0006)"}, d2 = {"BottomSheetColumnContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "isLightTheme", "", "sortTypes", "", "Lcom/denisgithuku/movies/domain/common/SortType;", "selectedSortType", "adultContentEnabled", "onToggleEnableAdultContent", "Lkotlin/Function0;", "onChangeSortType", "Lkotlin/Function1;", "onToggleTheme", "BottomSheetColumnItem", "content", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "BottomSheetPrev", "HomeScreen", "selectedGenre", "", "onChangeGenre", "genres", "Lcom/denisgithuku/movies/domain/model/Genre;", "movies", "Lcom/denisgithuku/movies/domain/model/Movie;", "trending_movies", "Lcom/denisgithuku/movies/domain/model/TrendingMovie;", "homeViewModel", "Lcom/denisgithuku/movies/presentation/screens/home/HomeViewModel;", "SearchBar", "TopBar", "onSelectSortAndFilter", "TopBarPreview", "getSortType", "", "sortType", "feature_movies_debug"})
public final class HomeScreenKt {
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void HomeScreen(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.presentation.screens.home.HomeViewModel homeViewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onToggleTheme) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void HomeScreen(androidx.compose.ui.Modifier modifier, int selectedGenre, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onChangeGenre, java.util.List<com.denisgithuku.movies.domain.model.Genre> genres, java.util.List<com.denisgithuku.movies.domain.model.Movie> movies, java.util.List<com.denisgithuku.movies.domain.model.TrendingMovie> trending_movies) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void BottomSheetColumnContent(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean isLightTheme, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.denisgithuku.movies.domain.common.SortType> sortTypes, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.common.SortType selectedSortType, boolean adultContentEnabled, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onToggleEnableAdultContent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.denisgithuku.movies.domain.common.SortType, kotlin.Unit> onChangeSortType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onToggleTheme) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void BottomSheetColumnItem(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.RowScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void TopBar(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSelectSortAndFilter) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SearchBar(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
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