package com.denisgithuku.core.di

import android.content.Context
import androidx.room.Room
import com.denisgithuku.core.data.local.FavouriteMoviesDao
import com.denisgithuku.core.data.local.MoviesDatabase
import com.denisgithuku.core.providers.AppThemeProvider
import com.denisgithuku.core.providers.DispatcherProvider
import com.denisgithuku.core.providers.UserPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
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

}
