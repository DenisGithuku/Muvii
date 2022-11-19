// Generated by Dagger (https://dagger.dev).
package com.denisgithuku.tv_shows.di;

import com.denisgithuku.core_data.providers.DispatcherProvider;
import com.denisgithuku.tv_shows.domain.repository.TvRepository;
import com.denisgithuku.tv_shows.domain.use_cases.TvUseCases;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TvModule_ProvideTvUseCasesFactory implements Factory<TvUseCases> {
  private final Provider<TvRepository> tvRepositoryProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  public TvModule_ProvideTvUseCasesFactory(Provider<TvRepository> tvRepositoryProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    this.tvRepositoryProvider = tvRepositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public TvUseCases get() {
    return provideTvUseCases(tvRepositoryProvider.get(), dispatcherProvider.get());
  }

  public static TvModule_ProvideTvUseCasesFactory create(
      Provider<TvRepository> tvRepositoryProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    return new TvModule_ProvideTvUseCasesFactory(tvRepositoryProvider, dispatcherProvider);
  }

  public static TvUseCases provideTvUseCases(TvRepository tvRepository,
      DispatcherProvider dispatcherProvider) {
    return Preconditions.checkNotNullFromProvides(TvModule.INSTANCE.provideTvUseCases(tvRepository, dispatcherProvider));
  }
}