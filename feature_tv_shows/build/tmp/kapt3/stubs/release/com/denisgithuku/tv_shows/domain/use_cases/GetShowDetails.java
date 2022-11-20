package com.denisgithuku.tv_shows.domain.use_cases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/denisgithuku/tv_shows/domain/use_cases/GetShowDetails;", "", "tvRepository", "Lcom/denisgithuku/tv_shows/domain/repository/TvRepository;", "coreMuviiUseCases", "Lcom/denisgithuku/core_data/domain/use_cases/CoreMuviiUseCases;", "dispatcherProvider", "Lcom/denisgithuku/core_data/providers/DispatcherProvider;", "(Lcom/denisgithuku/tv_shows/domain/repository/TvRepository;Lcom/denisgithuku/core_data/domain/use_cases/CoreMuviiUseCases;Lcom/denisgithuku/core_data/providers/DispatcherProvider;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/denisgithuku/core_data/Resource;", "Lcom/denisgithuku/tv_shows/domain/model/Tv;", "tvId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_tv_shows_release"})
public final class GetShowDetails {
    private final com.denisgithuku.tv_shows.domain.repository.TvRepository tvRepository = null;
    private final com.denisgithuku.core_data.domain.use_cases.CoreMuviiUseCases coreMuviiUseCases = null;
    private final com.denisgithuku.core_data.providers.DispatcherProvider dispatcherProvider = null;
    
    @javax.inject.Inject()
    public GetShowDetails(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.tv_shows.domain.repository.TvRepository tvRepository, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.domain.use_cases.CoreMuviiUseCases coreMuviiUseCases, @org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.providers.DispatcherProvider dispatcherProvider) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(int tvId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.denisgithuku.core_data.Resource<com.denisgithuku.tv_shows.domain.model.Tv>>> continuation) {
        return null;
    }
}