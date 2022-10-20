// Generated by Dagger (https://dagger.dev).
package com.denisgithuku.movies.di;

import com.denisgithuku.movies.data.data_src.remote.MoviesApiInterface;
import com.denisgithuku.movies.domain.repository.MoviesRepository;
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
public final class MoviesModule_ProvideMoviesRepositoryFactory implements Factory<MoviesRepository> {
  private final Provider<MoviesApiInterface> moviesApiInterfaceProvider;

  public MoviesModule_ProvideMoviesRepositoryFactory(
      Provider<MoviesApiInterface> moviesApiInterfaceProvider) {
    this.moviesApiInterfaceProvider = moviesApiInterfaceProvider;
  }

  @Override
  public MoviesRepository get() {
    return provideMoviesRepository(moviesApiInterfaceProvider.get());
  }

  public static MoviesModule_ProvideMoviesRepositoryFactory create(
      Provider<MoviesApiInterface> moviesApiInterfaceProvider) {
    return new MoviesModule_ProvideMoviesRepositoryFactory(moviesApiInterfaceProvider);
  }

  public static MoviesRepository provideMoviesRepository(MoviesApiInterface moviesApiInterface) {
    return Preconditions.checkNotNullFromProvides(MoviesModule.INSTANCE.provideMoviesRepository(moviesApiInterface));
  }
}