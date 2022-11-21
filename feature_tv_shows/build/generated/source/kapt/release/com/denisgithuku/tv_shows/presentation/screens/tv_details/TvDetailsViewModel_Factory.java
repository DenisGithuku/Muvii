// Generated by Dagger (https://dagger.dev).
package com.denisgithuku.tv_shows.presentation.screens.tv_details;

import androidx.lifecycle.SavedStateHandle;
import com.denisgithuku.core_data.domain.use_cases.CoreMuviiUseCases;
import com.denisgithuku.tv_shows.domain.use_cases.TvUseCases;
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
public final class TvDetailsViewModel_Factory implements Factory<TvDetailsViewModel> {
  private final Provider<TvUseCases> tvUseCasesProvider;

  private final Provider<CoreMuviiUseCases> coreMuviiUseCasesProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public TvDetailsViewModel_Factory(Provider<TvUseCases> tvUseCasesProvider,
      Provider<CoreMuviiUseCases> coreMuviiUseCasesProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.tvUseCasesProvider = tvUseCasesProvider;
    this.coreMuviiUseCasesProvider = coreMuviiUseCasesProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public TvDetailsViewModel get() {
    return newInstance(tvUseCasesProvider.get(), coreMuviiUseCasesProvider.get(), savedStateHandleProvider.get());
  }

  public static TvDetailsViewModel_Factory create(Provider<TvUseCases> tvUseCasesProvider,
      Provider<CoreMuviiUseCases> coreMuviiUseCasesProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new TvDetailsViewModel_Factory(tvUseCasesProvider, coreMuviiUseCasesProvider, savedStateHandleProvider);
  }

  public static TvDetailsViewModel newInstance(TvUseCases tvUseCases,
      CoreMuviiUseCases coreMuviiUseCases, SavedStateHandle savedStateHandle) {
    return new TvDetailsViewModel(tvUseCases, coreMuviiUseCases, savedStateHandle);
  }
}
