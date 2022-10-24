// Generated by Dagger (https://dagger.dev).
package com.denisgithuku.movies.domain.use_cases;

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
public final class DeleteFromFavouritesById_Factory implements Factory<DeleteFromFavouritesById> {
  private final Provider<MoviesRepository> moviesRepositoryProvider;

  public DeleteFromFavouritesById_Factory(Provider<MoviesRepository> moviesRepositoryProvider) {
    this.moviesRepositoryProvider = moviesRepositoryProvider;
  }

  @Override
  public DeleteFromFavouritesById get() {
    return newInstance(moviesRepositoryProvider.get());
  }

  public static DeleteFromFavouritesById_Factory create(
      Provider<MoviesRepository> moviesRepositoryProvider) {
    return new DeleteFromFavouritesById_Factory(moviesRepositoryProvider);
  }

  public static DeleteFromFavouritesById newInstance(MoviesRepository moviesRepository) {
    return new DeleteFromFavouritesById(moviesRepository);
  }
}