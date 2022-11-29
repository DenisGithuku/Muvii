// Generated by Dagger (https://dagger.dev).
package com.denisgithuku.movies.presentation.screens.details;

import androidx.lifecycle.SavedStateHandle;
import com.denisgithuku.core_data.domain.use_cases.CoreMuviiUseCases;
import com.denisgithuku.core_data.providers.DispatcherProvider;
import com.denisgithuku.feature_people.domain.use_cases.PeopleUseCases;
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

  private final Provider<CoreMuviiUseCases> coreMuviiUseCasesProvider;

  private final Provider<PeopleUseCases> peopleUseCasesProvider;

  private final Provider<DispatcherProvider> dispatcherProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public DetailsViewModel_Factory(Provider<MovieUseCases> movieUseCasesProvider,
      Provider<CoreMuviiUseCases> coreMuviiUseCasesProvider,
      Provider<PeopleUseCases> peopleUseCasesProvider,
      Provider<DispatcherProvider> dispatcherProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.movieUseCasesProvider = movieUseCasesProvider;
    this.coreMuviiUseCasesProvider = coreMuviiUseCasesProvider;
    this.peopleUseCasesProvider = peopleUseCasesProvider;
    this.dispatcherProvider = dispatcherProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public DetailsViewModel get() {
    return newInstance(movieUseCasesProvider.get(), coreMuviiUseCasesProvider.get(), peopleUseCasesProvider.get(), dispatcherProvider.get(), savedStateHandleProvider.get());
  }

  public static DetailsViewModel_Factory create(Provider<MovieUseCases> movieUseCasesProvider,
      Provider<CoreMuviiUseCases> coreMuviiUseCasesProvider,
      Provider<PeopleUseCases> peopleUseCasesProvider,
      Provider<DispatcherProvider> dispatcherProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new DetailsViewModel_Factory(movieUseCasesProvider, coreMuviiUseCasesProvider, peopleUseCasesProvider, dispatcherProvider, savedStateHandleProvider);
  }

  public static DetailsViewModel newInstance(MovieUseCases movieUseCases,
      CoreMuviiUseCases coreMuviiUseCases, PeopleUseCases peopleUseCases,
      DispatcherProvider dispatcherProvider, SavedStateHandle savedStateHandle) {
    return new DetailsViewModel(movieUseCases, coreMuviiUseCases, peopleUseCases, dispatcherProvider, savedStateHandle);
  }
}
