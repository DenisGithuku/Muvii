// Generated by Dagger (https://dagger.dev).
package com.denisgithuku.movies.domain.use_cases;

import com.denisgithuku.core_data.providers.UserPreferences;
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
public final class EnableAdultContent_Factory implements Factory<EnableAdultContent> {
  private final Provider<UserPreferences> userPreferencesProvider;

  public EnableAdultContent_Factory(Provider<UserPreferences> userPreferencesProvider) {
    this.userPreferencesProvider = userPreferencesProvider;
  }

  @Override
  public EnableAdultContent get() {
    return newInstance(userPreferencesProvider.get());
  }

  public static EnableAdultContent_Factory create(
      Provider<UserPreferences> userPreferencesProvider) {
    return new EnableAdultContent_Factory(userPreferencesProvider);
  }

  public static EnableAdultContent newInstance(UserPreferences userPreferences) {
    return new EnableAdultContent(userPreferences);
  }
}
