package com.denisgithuku.movies.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/denisgithuku/movies/di/MoviesModule;", "", "()V", "provideMovieUseCases", "Lcom/denisgithuku/movies/domain/use_cases/MovieUseCases;", "moviesRepository", "Lcom/denisgithuku/movies/domain/repository/MoviesRepository;", "userPreferences", "Lcom/denisgithuku/core/providers/UserPreferences;", "provideMoviesApiInterface", "Lcom/denisgithuku/movies/data/data_src/remote/MoviesApiInterface;", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideMoviesRepository", "moviesApiInterface", "feature_movies_debug"})
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
    com.denisgithuku.movies.data.data_src.remote.MoviesApiInterface moviesApiInterface) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.movies.domain.use_cases.MovieUseCases provideMovieUseCases(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.movies.domain.repository.MoviesRepository moviesRepository, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core.providers.UserPreferences userPreferences) {
        return null;
    }
}