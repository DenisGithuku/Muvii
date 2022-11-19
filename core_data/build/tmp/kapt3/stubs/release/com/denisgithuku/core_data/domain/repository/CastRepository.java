package com.denisgithuku.core_data.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/denisgithuku/core_data/domain/repository/CastRepository;", "", "getCast", "", "Lcom/denisgithuku/core_data/data/remote/dto/CastDTO;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCrew", "Lcom/denisgithuku/core_data/data/remote/dto/CrewDTO;", "core_data_release"})
public abstract interface CastRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCast(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.core_data.data.remote.dto.CastDTO>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCrew(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.denisgithuku.core_data.data.remote.dto.CrewDTO>> continuation);
}