// Generated by Dagger (https://dagger.dev).
package com.denisgithuku.core.providers;

import android.content.Context;
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
public final class UserPreferences_Factory implements Factory<UserPreferences> {
  private final Provider<Context> contextProvider;

  public UserPreferences_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public UserPreferences get() {
    return newInstance(contextProvider.get());
  }

  public static UserPreferences_Factory create(Provider<Context> contextProvider) {
    return new UserPreferences_Factory(contextProvider);
  }

  public static UserPreferences newInstance(Context context) {
    return new UserPreferences(context);
  }
}
