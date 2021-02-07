package com.example.realestateevaluator11_30.dataBase

import android.location.Address
import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE


@Dao
interface PropertyDatabaseDao {

    @Insert(onConflict = REPLACE)
    fun insert(property: Property)

    @Update
    fun update(property: Property)

    @Query("SELECT * FROM property_table")
    fun loadAllAddress(): Array<Property>


    /**
     * Selects and returns all rows in the table,
     *
     * sorted by start time in descending order.
     */
//
//    @Query("DELETE FROM property_table")
//    fun clear()

//    @Query("SELECT * FROM property_table WHERE propertyId = :propertyId")
//    suspend fun load(propertyId: Int): LiveData<Property>

}


