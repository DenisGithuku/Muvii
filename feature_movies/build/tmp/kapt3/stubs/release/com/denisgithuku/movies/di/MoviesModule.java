package com.denisgithuku.movies.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/denisgithuku/movies/di/MoviesModule;", "", "()V", "provideDateFormatterUseCase", "Lcom/denisgithuku/movies/domain/use_cases/FormatDateUseCase;", "provideMovieUseCases", "Lcom/denisgithuku/movies/domain/use_cases/MovieUseCases;", "moviesRepository", "Lcom/denisgithuku/movies/domain/repository/MoviesRepository;", "userPreferences", "Lcom/denisgithuku/core/providers/UserPreferences;", "formatDateUseCase", "dispatcherProvider", "Lcom/denisgithuku/core/providers/DispatcherProvider;", "provideMoviesApiInterface", "Lcom/denisgithuku/movies/data/data_src/remote/MoviesApiInterface;", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideMoviesRepository", "moviesApiInterface", "favouriteMoviesDao", "Lcom/denisgithuku/core/data/local/FavouriteMoviesDao;", "feature_movies_release"})
@dagger.Module()
public final class MoviesModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.denisgithuku.movies.di.MoviesModule INSTANCE = null;
    
    private MoviesModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.movies.data.data_src.remote.MoviesApiInterface provideMoviesApiInterface(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.movies.domain.repository.MoviesRepository provideMoviesRepository(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.data.data_src.remote.MoviesApiInterface moviesApiInterface, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core.data.local.FavouriteMoviesDao favouriteMoviesDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.movies.domain.use_cases.FormatDateUseCase provideDateFormatterUseCase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.movies.domain.use_cases.MovieUseCases provideMovieUseCases(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.repository.MoviesRepository moviesRepository, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core.providers.UserPreferences userPreferences, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.use_cases.FormatDateUseCase formatDateUseCase, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core.providers.DispatcherProvider dispatcherProvider) {
        return null;
    }
}