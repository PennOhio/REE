package com.example.realestateevaluator11_30.dataBase

import androidx.lifecycle.MutableLiveData
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "property_table")
data class Property (
    @PrimaryKey val propertyId: Int,

    @ColumnInfo(name = "Address")
    val address: String?
//
//    @ColumnInfo(name = "cap_rate")
//    var capRate: Double,
//
//    @ColumnInfo(name = "noi")
//    var noi: Double

)
