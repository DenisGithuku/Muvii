package com.denisgithuku.movies.presentation.screens.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u001a\u0094\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003\u00a8\u0006\u0019"}, d2 = {"MovieDetailsScreen", "", "snackbarHostState", "Landroidx/compose/material3/SnackbarHostState;", "detailsViewModel", "Lcom/denisgithuku/movies/presentation/screens/details/DetailsViewModel;", "onOpenMovieDetails", "Lkotlin/Function1;", "", "onNavigateUp", "Lkotlin/Function0;", "movieDetails", "Lcom/denisgithuku/movies/domain/model/MovieDetails;", "similarMoviesLoading", "", "castLoading", "castList", "", "Lcom/denisgithuku/core_data/domain/model/Cast;", "onOpenProfile", "onToggleFollow", "similarMovies", "Lcom/denisgithuku/movies/domain/model/Movie;", "onOpenSimilarMovie", "onMarkUnmarkFavourite", "feature_movies_release"})
public final class MovieDetailsScreenKt {
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.lifecycle.compose.ExperimentalLifecycleComposeApi.class})
    public static final void MovieDetailsScreen(@org.jetbrains.annotations.NotNull()
    androidx.compose.material3.SnackbarHostState snackbarHostState, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.presentation.screens.details.DetailsViewModel detailsViewModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onOpenMovieDetails, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateUp) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void MovieDetailsScreen(com.denisgithuku.movies.domain.model.MovieDetails movieDetails, boolean similarMoviesLoading, boolean castLoading, java.util.List<com.denisgithuku.core_data.domain.model.Cast> castList, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onOpenProfile, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onToggleFollow, java.util.List<com.denisgithuku.movies.domain.model.Movie> similarMovies, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onOpenSimilarMovie, kotlin.jvm.functions.Function0<kotlin.Unit> onMarkUnmarkFavourite, kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateUp) {
    }
}