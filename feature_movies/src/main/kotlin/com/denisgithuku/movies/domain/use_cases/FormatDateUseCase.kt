package com.denisgithuku.movies.domain.use_cases

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class FormatDateUseCase {
    @RequiresApi(Build.VERSION_CODES.O)
    suspend operator fun invoke(date: String): String {
        val parsedDate = LocalDateTime.parse(date)
        val formatter = DateTimeFormatter.ofPattern("dd Mmm yyyy")
        return parsedDate.format(formatter)
    }
}