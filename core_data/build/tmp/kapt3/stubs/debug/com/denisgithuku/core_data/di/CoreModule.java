package com.denisgithuku.core_data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0018\u001a\u00020\u00152\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0007J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0006H\u0007J\b\u0010\u001e\u001a\u00020\u0011H\u0007J\u0012\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020 H\u0007\u00a8\u0006$"}, d2 = {"Lcom/denisgithuku/core_data/di/CoreModule;", "", "()V", "provideCastRepository", "Lcom/denisgithuku/core_data/domain/repository/CastRepository;", "coreInterface", "Lcom/denisgithuku/core_data/data/remote/CoreInterface;", "provideCoreMovieUseCases", "Lcom/denisgithuku/core_data/domain/use_cases/CoreMovieUseCases;", "favouriteMoviesRepository", "Lcom/denisgithuku/core_data/domain/repository/FavouriteMoviesRepository;", "dispatcherProvider", "Lcom/denisgithuku/core_data/providers/DispatcherProvider;", "castRepository", "provideCoroutineDispatchers", "provideFavouriteMoviesApiInterface", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideFavouriteMoviesDao", "Lcom/denisgithuku/core_data/data/local/FavouriteMoviesDao;", "moviesDatabase", "Lcom/denisgithuku/core_data/data/local/MoviesDatabase;", "provideFavouriteMoviesRepository", "favouriteMoviesDao", "provideMoviesDatabase", "context", "Landroid/content/Context;", "provideMoviesRepository", "Lcom/denisgithuku/core_data/data/remote/repository_impl/FavouriteMoviesRepositoryImpl;", "favouriteMoviesInterface", "provideOkhttpClient", "provideUserPrefs", "Lcom/denisgithuku/core_data/providers/UserPreferences;", "provideUserTheme", "Lcom/denisgithuku/core_data/providers/AppThemeProvider;", "userPreferences", "core_data_debug"})
@dagger.Module()
public final class CoreModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.denisgithuku.core_data.di.CoreModule INSTANCE = null;
    
    private CoreModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkhttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.core_data.data.local.MoviesDatabase provideMoviesDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.core_data.data.local.FavouriteMoviesDao provideFavouriteMoviesDao(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.data.local.MoviesDatabase moviesDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.core_data.providers.UserPreferences provideUserPrefs(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.core_data.data.remote.repository_impl.FavouriteMoviesRepositoryImpl provideMoviesRepository(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.data.local.FavouriteMoviesDao favouriteMoviesDao, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.data.remote.CoreInterface favouriteMoviesInterface) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.core_data.data.remote.CoreInterface provideFavouriteMoviesApiInterface(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.core_data.providers.DispatcherProvider provideCoroutineDispatchers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.core_data.providers.AppThemeProvider provideUserTheme(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.providers.UserPreferences userPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.core_data.domain.repository.FavouriteMoviesRepository provideFavouriteMoviesRepository(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.data.local.FavouriteMoviesDao favouriteMoviesDao, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.data.remote.CoreInterface coreInterface) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.core_data.domain.use_cases.CoreMovieUseCases provideCoreMovieUseCases(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.domain.repository.FavouriteMoviesRepository favouriteMoviesRepository, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.providers.DispatcherProvider dispatcherProvider, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.domain.repository.CastRepository castRepository, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.data.remote.CoreInterface coreInterface) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.core_data.domain.repository.CastRepository provideCastRepository(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.data.remote.CoreInterface coreInterface) {
        return null;
    }
}