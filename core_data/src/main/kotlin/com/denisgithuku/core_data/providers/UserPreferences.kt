package com.denisgithuku.core_data.providers

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first
import javax.inject.Inject

class UserPreferences @Inject constructor(
    private val context: Context
) {
    private val Context.dataStore by preferencesDataStore(name = "user_prefs")

    suspend fun writeIntoPreferences(key: String, value: Boolean) {
        val userPrefs = booleanPreferencesKey(name = key)
        context.dataStore.edit {
            it[userPrefs] = value
        }
    }

    suspend fun readFromPreferences(key: String): Boolean {
        val userPrefs = booleanPreferencesKey(name = key)
        return context.dataStore.data.first()[userPrefs] ?: false
    }

}
