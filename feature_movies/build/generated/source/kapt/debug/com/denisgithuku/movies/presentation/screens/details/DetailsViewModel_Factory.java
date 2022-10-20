// Generated by Dagger (https://dagger.dev).
package com.denisgithuku.movies.presentation.screens.details;

import androidx.lifecycle.SavedStateHandle;
import com.denisgithuku.movies.domain.use_cases.MovieUseCases;
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
public final class DetailsViewModel_Factory implements Factory<DetailsViewModel> {
  private final Provider<MovieUseCases> movieUseCasesProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public DetailsViewModel_Factory(Provider<MovieUseCases> movieUseCasesProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.movieUseCasesProvider = movieUseCasesProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public DetailsViewModel get() {
    return newInstance(movieUseCasesProvider.get(), savedStateHandleProvider.get());
  }

  public static DetailsViewModel_Factory create(Provider<MovieUseCases> movieUseCasesProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new DetailsViewModel_Factory(movieUseCasesProvider, savedStateHandleProvider);
  }

  public static DetailsViewModel newInstance(MovieUseCases movieUseCases,
      SavedStateHandle savedStateHandle) {
    return new DetailsViewModel(movieUseCases, savedStateHandle);
  }
}
