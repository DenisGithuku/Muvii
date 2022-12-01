package com.denisgithuku.core_data.data.local

import androidx.room.*

@Dao
interface PersonsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPerson(personEntity: PersonEntity)

    @Delete
    suspend fun deletePerson(personEntity: PersonEntity)

    @Query("SELECT * FROM followed_persons_table")
    suspend fun getFollowedPersonsList(): List<PersonEntity>

    @Query("SELECT * FROM followed_persons_table WHERE personId like :personId")
    suspend fun getFollowedPerson(personId: Int): PersonEntity
}