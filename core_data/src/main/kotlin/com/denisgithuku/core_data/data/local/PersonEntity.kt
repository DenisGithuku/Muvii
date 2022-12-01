package com.denisgithuku.core_data.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "followed_persons_table")
data class PersonEntity(
    @PrimaryKey
    val personId: Int
)
