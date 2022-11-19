package com.denisgithuku.movies.domain.use_cases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/denisgithuku/movies/domain/use_cases/ToggleFavourite;", "", "favouriteMoviesRepository", "Lcom/denisgithuku/core_data/domain/repository/FavouriteMoviesRepository;", "(Lcom/denisgithuku/core_data/domain/repository/FavouriteMoviesRepository;)V", "invoke", "", "movie", "Lcom/denisgithuku/core_data/data/local/FavouriteMovieDBO;", "favourite", "(Lcom/denisgithuku/core_data/data/local/FavouriteMovieDBO;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_movies_release"})
public final class ToggleFavourite {
    private final com.denisgithuku.core_data.domain.repository.FavouriteMoviesRepository favouriteMoviesRepository = null;
    
    @javax.inject.Inject()
    public ToggleFavourite(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.domain.repository.FavouriteMoviesRepository favouriteMoviesRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.data.local.FavouriteMovieDBO movie, boolean favourite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}