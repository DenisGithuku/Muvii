package com.denisgithuku.core.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u00a8\u0006\b"}, d2 = {"Lcom/denisgithuku/core/providers/MuviiNavigationDestinationProvider;", "", "destination", "", "getDestination", "()Ljava/lang/String;", "route", "getRoute", "core_data_release"})
public abstract interface MuviiNavigationDestinationProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getRoute();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getDestination();
}