package com.denisgithuku.core.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/denisgithuku/core/di/CoreModule;", "", "()V", "provideOkhttpClient", "Lokhttp3/OkHttpClient;", "provideUserPrefs", "Lcom/denisgithuku/core/providers/UserPreferences;", "context", "Landroid/content/Context;", "provideUserTheme", "Lcom/denisgithuku/core/providers/AppThemeProvider;", "userPreferences", "core_debug"})
@dagger.Module()
public final class CoreModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.denisgithuku.core.di.CoreModule INSTANCE = null;
    
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
    public final com.denisgithuku.core.providers.UserPreferences provideUserPrefs(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.core.providers.AppThemeProvider provideUserTheme(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core.providers.UserPreferences userPreferences) {
        return null;
    }
}