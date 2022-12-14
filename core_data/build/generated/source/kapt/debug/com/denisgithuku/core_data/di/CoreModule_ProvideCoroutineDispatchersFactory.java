// Generated by Dagger (https://dagger.dev).
package com.denisgithuku.core_data.di;

import com.denisgithuku.core_data.providers.DispatcherProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoreModule_ProvideCoroutineDispatchersFactory implements Factory<DispatcherProvider> {
  @Override
  public DispatcherProvider get() {
    return provideCoroutineDispatchers();
  }

  public static CoreModule_ProvideCoroutineDispatchersFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DispatcherProvider provideCoroutineDispatchers() {
    return Preconditions.checkNotNullFromProvides(CoreModule.INSTANCE.provideCoroutineDispatchers());
  }

  private static final class InstanceHolder {
    private static final CoreModule_ProvideCoroutineDispatchersFactory INSTANCE = new CoreModule_ProvideCoroutineDispatchersFactory();
  }
}
