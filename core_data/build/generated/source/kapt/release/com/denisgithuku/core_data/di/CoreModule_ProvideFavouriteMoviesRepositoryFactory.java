// Generated by Dagger (https://dagger.dev).
package com.denisgithuku.core_data.di;

import com.denisgithuku.core_data.data.local.FavouriteMoviesDao;
import com.denisgithuku.core_data.data.remote.CoreInterface;
import com.denisgithuku.core_data.domain.repository.FavouriteMoviesRepository;
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
public final class CoreModule_ProvideFavouriteMoviesRepositoryFactory implements Factory<FavouriteMoviesRepository> {
  private final Provider<FavouriteMoviesDao> favouriteMoviesDaoProvider;

  private final Provider<CoreInterface> coreInterfaceProvider;

  public CoreModule_ProvideFavouriteMoviesRepositoryFactory(
      Provider<FavouriteMoviesDao> favouriteMoviesDaoProvider,
      Provider<CoreInterface> coreInterfaceProvider) {
    this.favouriteMoviesDaoProvider = favouriteMoviesDaoProvider;
    this.coreInterfaceProvider = coreInterfaceProvider;
  }

  @Override
  public FavouriteMoviesRepository get() {
    return provideFavouriteMoviesRepository(favouriteMoviesDaoProvider.get(), coreInterfaceProvider.get());
  }

  public static CoreModule_ProvideFavouriteMoviesRepositoryFactory create(
      Provider<FavouriteMoviesDao> favouriteMoviesDaoProvider,
      Provider<CoreInterface> coreInterfaceProvider) {
    return new CoreModule_ProvideFavouriteMoviesRepositoryFactory(favouriteMoviesDaoProvider, coreInterfaceProvider);
  }

  public static FavouriteMoviesRepository provideFavouriteMoviesRepository(
      FavouriteMoviesDao favouriteMoviesDao, CoreInterface coreInterface) {
    return Preconditions.checkNotNullFromProvides(CoreModule.INSTANCE.provideFavouriteMoviesRepository(favouriteMoviesDao, coreInterface));
  }
}