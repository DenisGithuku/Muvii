// Generated by Dagger (https://dagger.dev).
package com.denisgithuku.tv_shows.data.data_src.repository_impl;

import com.denisgithuku.tv_shows.data.data_src.remote.api.TvApiInterface;
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
public final class TvRepositoryImpl_Factory implements Factory<TvRepositoryImpl> {
  private final Provider<TvApiInterface> tvApiInterfaceProvider;

  public TvRepositoryImpl_Factory(Provider<TvApiInterface> tvApiInterfaceProvider) {
    this.tvApiInterfaceProvider = tvApiInterfaceProvider;
  }

  @Override
  public TvRepositoryImpl get() {
    return newInstance(tvApiInterfaceProvider.get());
  }

  public static TvRepositoryImpl_Factory create(Provider<TvApiInterface> tvApiInterfaceProvider) {
    return new TvRepositoryImpl_Factory(tvApiInterfaceProvider);
  }

  public static TvRepositoryImpl newInstance(TvApiInterface tvApiInterface) {
    return new TvRepositoryImpl(tvApiInterface);
  }
}
