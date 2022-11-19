package com.denisgithuku.tv_shows.domain.use_cases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/denisgithuku/tv_shows/domain/use_cases/GetShows;", "", "tvRepository", "Lcom/denisgithuku/tv_shows/domain/repository/TvRepository;", "dispatcherProvider", "Lcom/denisgithuku/core_data/providers/DispatcherProvider;", "(Lcom/denisgithuku/tv_shows/domain/repository/TvRepository;Lcom/denisgithuku/core_data/providers/DispatcherProvider;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/denisgithuku/core_data/Resource;", "", "Lcom/denisgithuku/tv_shows/domain/model/Tv;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_tv_shows_debug"})
public final class GetShows {
    private final com.denisgithuku.tv_shows.domain.repository.TvRepository tvRepository = null;
    private final com.denisgithuku.core_data.providers.DispatcherProvider dispatcherProvider = null;
    
    @javax.inject.Inject()
    public GetShows(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.tv_shows.domain.repository.TvRepository tvRepository, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.providers.DispatcherProvider dispatcherProvider) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.denisgithuku.core_data.Resource<? extends java.util.List<com.denisgithuku.tv_shows.domain.model.Tv>>>> continuation) {
        return null;
    }
}