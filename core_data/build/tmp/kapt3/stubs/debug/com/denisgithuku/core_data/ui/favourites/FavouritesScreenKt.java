package com.denisgithuku.core_data.ui.favourites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\u001a<\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a$\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a*\u0010\n\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\tH\u0003\u00a8\u0006\u0010"}, d2 = {"FavouriteMovieCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "favouriteMovie", "Lcom/denisgithuku/core_data/domain/model/FavouriteMovie;", "onToggleFavourite", "Lkotlin/Function0;", "onOpenDetails", "Lkotlin/Function1;", "FavouritesScreen", "snackbarHostState", "Landroidx/compose/material3/SnackbarHostState;", "", "favourites", "", "core_data_debug"})
public final class FavouritesScreenKt {
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.lifecycle.compose.ExperimentalLifecycleComposeApi.class})
    public static final void FavouritesScreen(@org.jetbrains.annotations.NotNull()
    androidx.compose.material3.SnackbarHostState snackbarHostState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onOpenDetails) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void FavouritesScreen(java.util.List<com.denisgithuku.core_data.domain.model.FavouriteMovie> favourites, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onOpenDetails) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void FavouriteMovieCard(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.domain.model.FavouriteMovie favouriteMovie, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onToggleFavourite, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.denisgithuku.core_data.domain.model.FavouriteMovie, kotlin.Unit> onOpenDetails) {
    }
}