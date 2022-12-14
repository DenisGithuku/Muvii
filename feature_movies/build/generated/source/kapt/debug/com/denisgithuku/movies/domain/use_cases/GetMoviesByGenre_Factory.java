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
public final class GetMoviesByGenre_Factory implements Factory<GetMoviesByGenre> {
  private final Provider<MoviesRepository> moviesRepositoryProvider;

  public GetMoviesByGenre_Factory(Provider<MoviesRepository> moviesRepositoryProvider) {
    this.moviesRepositoryProvider = moviesRepositoryProvider;
  }

  @Override
  public GetMoviesByGenre get() {
    return newInstance(moviesRepositoryProvider.get());
  }

  public static GetMoviesByGenre_Factory create(
      Provider<MoviesRepository> moviesRepositoryProvider) {
    return new GetMoviesByGenre_Factory(moviesRepositoryProvider);
  }

  public static GetMoviesByGenre newInstance(MoviesRepository moviesRepository) {
    return new GetMoviesByGenre(moviesRepository);
  }
}
