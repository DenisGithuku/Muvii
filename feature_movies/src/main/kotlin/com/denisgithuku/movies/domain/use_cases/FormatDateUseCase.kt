package com.denisgithuku.movies.domain.use_cases

import android.util.Log
import java.text.SimpleDateFormat
import java.util.*

class FormatDateUseCase {
    operator fun invoke(date: String): String {
        return try {
            val formatter = SimpleDateFormat("yyyy-mm-dd hh:mm:ss", Locale.ENGLISH)
            val formattedDate = formatter.format(date)
            val calendar = Calendar.getInstance()
            formattedDate.toString()
        } catch (e: Exception) {
            Log.d("date-error",e.message ?: "Could not format date")
            date
        }
    }
}