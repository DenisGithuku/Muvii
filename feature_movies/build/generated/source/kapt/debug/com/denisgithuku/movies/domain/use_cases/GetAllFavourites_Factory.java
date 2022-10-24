// Generated by Dagger (https://dagger.dev).
package com.denisgithuku.movies.domain.use_cases;

import com.denisgithuku.core.providers.DispatcherProvider;
import com.denisgithuku.movies.domain.repository.MoviesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetAllFavourites_Factory implements Factory<GetAllFavourites> {
  private final Provider<MoviesRepository> moviesRepositoryProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  public GetAllFavourites_Factory(Provider<MoviesRepository> moviesRepositoryProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    this.moviesRepositoryProvider = moviesRepositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public GetAllFavourites get() {
    return newInstance(moviesRepositoryProvider.get(), dispatcherProvider.get());
  }

  public static GetAllFavourites_Factory create(Provider<MoviesRepository> moviesRepositoryProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    return new GetAllFavourites_Factory(moviesRepositoryProvider, dispatcherProvider);
  }

  public static GetAllFavourites newInstance(MoviesRepository moviesRepository,
      DispatcherProvider dispatcherProvider) {
    return new GetAllFavourites(moviesRepository, dispatcherProvider);
  }
}
