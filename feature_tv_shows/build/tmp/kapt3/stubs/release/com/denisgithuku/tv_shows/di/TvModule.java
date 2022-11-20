package com.denisgithuku.tv_shows.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/denisgithuku/tv_shows/di/TvModule;", "", "()V", "provideTvApiInterface", "Lcom/denisgithuku/tv_shows/data/data_src/remote/api/TvApiInterface;", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideTvRepository", "Lcom/denisgithuku/tv_shows/domain/repository/TvRepository;", "tvApiInterface", "provideTvUseCases", "Lcom/denisgithuku/tv_shows/domain/use_cases/TvUseCases;", "tvRepository", "coreMuviiUseCases", "Lcom/denisgithuku/core_data/domain/use_cases/CoreMuviiUseCases;", "dispatcherProvider", "Lcom/denisgithuku/core_data/providers/DispatcherProvider;", "feature_tv_shows_release"})
@dagger.Module()
public final class TvModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.denisgithuku.tv_shows.di.TvModule INSTANCE = null;
    
    private TvModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.tv_shows.data.data_src.remote.api.TvApiInterface provideTvApiInterface(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.tv_shows.domain.repository.TvRepository provideTvRepository(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.tv_shows.data.data_src.remote.api.TvApiInterface tvApiInterface) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.denisgithuku.tv_shows.domain.use_cases.TvUseCases provideTvUseCases(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.tv_shows.domain.repository.TvRepository tvRepository, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.domain.use_cases.CoreMuviiUseCases coreMuviiUseCases, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.providers.DispatcherProvider dispatcherProvider) {
        return null;
    }
}