package com.denisgithuku.core_data.data.remote.repository_impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/denisgithuku/core_data/data/remote/repository_impl/CastRepositoryImpl;", "Lcom/denisgithuku/core_data/domain/repository/CastRepository;", "coreInterface", "Lcom/denisgithuku/core_data/data/remote/CoreInterface;", "(Lcom/denisgithuku/core_data/data/remote/CoreInterface;)V", "getCast", "", "Lcom/denisgithuku/core_data/data/remote/dto/CastDTO;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCrew", "Lcom/denisgithuku/core_data/data/remote/dto/CrewDTO;", "core_data_debug"})
public final class CastRepositoryImpl implements com.denisgithuku.core_data.domain.repository.CastRepository {
    private final com.denisgithuku.core_data.data.remote.CoreInterface coreInterface = null;
    
    @javax.inject.Inject()
    public CastRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.data.remote.CoreInterface coreInterface) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCast(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.core_data.data.remote.dto.CastDTO>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCrew(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.core_data.data.remote.dto.CrewDTO>> continuation) {
        return null;
    }
}