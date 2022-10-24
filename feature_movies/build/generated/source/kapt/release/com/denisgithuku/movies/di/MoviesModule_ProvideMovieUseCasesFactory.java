// Generated by Dagger (https://dagger.dev).
package com.denisgithuku.movies.di;

import com.denisgithuku.core.providers.DispatcherProvider;
import com.denisgithuku.core.providers.UserPreferences;
import com.denisgithuku.movies.domain.repository.MoviesRepository;
import com.denisgithuku.movies.domain.use_cases.FormatDateUseCase;
import com.denisgithuku.movies.domain.use_cases.MovieUseCases;
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
public final class MoviesModule_ProvideMovieUseCasesFactory implements Factory<MovieUseCases> {
  private final Provider<MoviesRepository> moviesRepositoryProvider;

  private final Provider<UserPreferences> userPreferencesProvider;

  private final Provider<FormatDateUseCase> formatDateUseCaseProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  public MoviesModule_ProvideMovieUseCasesFactory(
      Provider<MoviesRepository> moviesRepositoryProvider,
      Provider<UserPreferences> userPreferencesProvider,
      Provider<FormatDateUseCase> formatDateUseCaseProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    this.moviesRepositoryProvider = moviesRepositoryProvider;
    this.userPreferencesProvider = userPreferencesProvider;
    this.formatDateUseCaseProvider = formatDateUseCaseProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public MovieUseCases get() {
    return provideMovieUseCases(moviesRepositoryProvider.get(), userPreferencesProvider.get(), formatDateUseCaseProvider.get(), dispatcherProvider.get());
  }

  public static MoviesModule_ProvideMovieUseCasesFactory create(
      Provider<MoviesRepository> moviesRepositoryProvider,
      Provider<UserPreferences> userPreferencesProvider,
      Provider<FormatDateUseCase> formatDateUseCaseProvider,
      Provider<DispatcherProvider> dispatcherProvider) {
    return new MoviesModule_ProvideMovieUseCasesFactory(moviesRepositoryProvider, userPreferencesProvider, formatDateUseCaseProvider, dispatcherProvider);
  }

  public static MovieUseCases provideMovieUseCases(MoviesRepository moviesRepository,
      UserPreferences userPreferences, FormatDateUseCase formatDateUseCase,
      DispatcherProvider dispatcherProvider) {
    return Preconditions.checkNotNullFromProvides(MoviesModule.INSTANCE.provideMovieUseCases(moviesRepository, userPreferences, formatDateUseCase, dispatcherProvider));
  }
}
