// Generated by Dagger (https://dagger.dev).
package com.denisgithuku.movies.di;

import com.denisgithuku.movies.data.data_src.remote.MoviesApiInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MoviesModule_ProvideMoviesApiInterfaceFactory implements Factory<MoviesApiInterface> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  public MoviesModule_ProvideMoviesApiInterfaceFactory(
      Provider<OkHttpClient> okHttpClientProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public MoviesApiInterface get() {
    return provideMoviesApiInterface(okHttpClientProvider.get());
  }

  public static MoviesModule_ProvideMoviesApiInterfaceFactory create(
      Provider<OkHttpClient> okHttpClientProvider) {
    return new MoviesModule_ProvideMoviesApiInterfaceFactory(okHttpClientProvider);
  }

  public static MoviesApiInterface provideMoviesApiInterface(OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(MoviesModule.INSTANCE.provideMoviesApiInterface(okHttpClient));
  }
}