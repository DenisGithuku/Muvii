package com.denisgithuku.movies.domain.use_cases

import android.annotation.SuppressLint
import android.util.Log
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class FormatDateUseCase {
    @SuppressLint("NewApi")
    operator fun invoke(date: String): String {
        return try {
            val formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd")
            val formattedDate = LocalDate.parse(date, formatter)
            val calendar = Calendar.getInstance()
            return "${
                formattedDate.month.toString().lowercase(Locale.ROOT).replaceFirstChar {
                formattedDate.month.toString().first().uppercaseChar()
            }} ${formattedDate.year}"
        } catch (e: Exception) {
            Log.d("date-error",e.message ?: "Could not format date")
            date
        }
    }
}