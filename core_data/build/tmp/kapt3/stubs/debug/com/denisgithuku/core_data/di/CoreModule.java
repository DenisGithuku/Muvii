package com.denisgithuku.core_data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/denisgithuku/core_data/di/CoreModule;", "", "()V", "provideCoroutineDispatchers", "Lcom/denisgithuku/core_data/providers/DispatcherProvider;", "provideFavouriteMoviesDao", "Lcom/denisgithuku/core_data/data/local/FavouriteMoviesDao;", "moviesDatabase", "Lcom/denisgithuku/core_data/data/local/MoviesDatabase;", "provideMoviesDatabase", "context", "Landroid/content/Context;", "provideOkhttpClient", "Lokhttp3/OkHttpClient;", "provideUserPrefs", "Lcom/denisgithuku/core_data/providers/UserPreferences;", "provideUserTheme", "Lcom/denisgithuku/core_data/providers/AppThemeProvider;", "userPreferences", "core_data_debug"})
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
}