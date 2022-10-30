package com.denisgithuku.core_data.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/denisgithuku/core_data/providers/AppThemeProvider;", "", "userPreferences", "Lcom/denisgithuku/core_data/providers/UserPreferences;", "(Lcom/denisgithuku/core_data/providers/UserPreferences;)V", "changeUserTheme", "", "value", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserTheme", "Lkotlinx/coroutines/flow/SharedFlow;", "externalScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_data_debug"})
public final class AppThemeProvider {
    private final com.denisgithuku.core_data.providers.UserPreferences userPreferences = null;
    
    @javax.inject.Inject()
    public AppThemeProvider(@org.jetbrains.annotations.NotNull()
    com.denisgithuku.core_data.providers.UserPreferences userPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserTheme(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope externalScope, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.SharedFlow<java.lang.Boolean>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object changeUserTheme(boolean value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}