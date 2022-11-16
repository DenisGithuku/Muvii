package com.denisgithuku.core_data.di

import android.content.Context
import androidx.room.Room
import com.denisgithuku.core_data.Constants
import com.denisgithuku.core_data.data.local.FavouriteMoviesDao
import com.denisgithuku.core_data.data.local.MoviesDatabase
import com.denisgithuku.core_data.data.remote.FavouriteMovieInterface
import com.denisgithuku.core_data.data.remote.repository_impl.FavouriteMoviesRepositoryImpl
import com.denisgithuku.core_data.domain.repository.FavouriteMoviesRepository
import com.denisgithuku.core_data.domain.use_cases.CoreMovieUseCases
import com.denisgithuku.core_data.domain.use_cases.GetFavouriteMovies
import com.denisgithuku.core_data.providers.AppThemeProvider
import com.denisgithuku.core_data.providers.DispatcherProvider
import com.denisgithuku.core_data.providers.UserPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoreModule {

    @Provides
    @Singleton
    fun provideOkhttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addNetworkInterceptor(
                HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BASIC
                })
            .readTimeout(5000, TimeUnit.MILLISECONDS)
            .connectTimeout(5000, TimeUnit.MILLISECONDS)
            .build()
    }

    @Provides
    @Singleton
    fun provideMoviesDatabase(
        @ApplicationContext
        context: Context
    ): MoviesDatabase {
        return Room
            .databaseBuilder(
            context,
            MoviesDatabase::class.java,
            "movies_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideFavouriteMoviesDao(
        moviesDatabase: MoviesDatabase
    ): FavouriteMoviesDao = moviesDatabase.favouriteMoviesDao()

    @Provides
    @Singleton
    fun provideUserPrefs(
        @ApplicationContext
        context: Context,
    ): UserPreferences {
        return UserPreferences(
            context = context
        )
    }

    @Provides
    @Singleton
    fun provideMoviesRepository(
        favouriteMoviesDao: FavouriteMoviesDao,
        favouriteMoviesInterface: FavouriteMovieInterface
    ) = FavouriteMoviesRepositoryImpl(
        favouriteMoviesDao = favouriteMoviesDao,
        favouriteMoviesApiInterface = favouriteMoviesInterface
    )

    @Provides
    @Singleton
    fun provideFavouriteMoviesApiInterface(okHttpClient: OkHttpClient): FavouriteMovieInterface =
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(FavouriteMovieInterface::class.java)

    @Provides
    @Singleton
    fun provideCoroutineDispatchers(): DispatcherProvider = DispatcherProvider(
        defaultDispatcher = Dispatchers.Default,
        ioDispatcher = Dispatchers.IO,
        unconfinedDispatcher = Dispatchers.Unconfined,
        mainDispatcher = Dispatchers.Main,
    )

    @Provides
    @Singleton
    fun provideUserTheme(userPreferences: UserPreferences): AppThemeProvider =
        AppThemeProvider(userPreferences = userPreferences)

    @Provides
    @Singleton
    fun provideFavouriteMoviesRepository(
        favouriteMoviesDao: FavouriteMoviesDao,
        favouriteMovieInterface: FavouriteMovieInterface
    ): FavouriteMoviesRepository {
        return FavouriteMoviesRepositoryImpl(favouriteMovieInterface, favouriteMoviesDao)
    }

    @Provides
    @Singleton
    fun provideCoreMovieUseCases(
        favouriteMoviesRepository: FavouriteMoviesRepository,
        dispatcherProvider: DispatcherProvider,
        favouriteMovieInterface: FavouriteMovieInterface
    ): CoreMovieUseCases {
        return CoreMovieUseCases(
            getFavouriteMovies = GetFavouriteMovies(
                favouriteMoviesRepository,
                dispatcherProvider = dispatcherProvider
            )
        )
    }
}
