package com.example.realestateevaluator11_30.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Property::class), version = 1, exportSchema = false)
abstract class PropertyDatabase : RoomDatabase() {

    abstract fun propertyDatabaseDao(): PropertyDatabaseDao

//    companion object {
//
//        @Volatile
//        private var INSTANCE: PropertyDatabase? = null
//        fun getInstance(context: Context): PropertyDatabase {
//
//            synchronized(this) {
//
//
//                var instance = INSTANCE
//
////                if (instance == null) {
////                    instance = Room.databaseBuilder(
////                        context.applicationContext,
////                        PropertyDatabase::class.java,
////                        "property_database"
////                    )
////                        // Wipes and rebuilds instead of migrating if no Migration object.
////                        // Migration is not part of this lesson. You can learn more about
////                        // migration with Room in this blog post:
////                        // https://medium.com/androiddevelopers/understanding-migrations-with-room-f01e04b07929
////                        .fallbackToDestructiveMigration()
////                        .build()
////                    // Assign INSTANCE to the newly created database.
////                    INSTANCE = instance
////                }
//
//                // Return instance; smart cast to be non-null.
//                return instance
//            }
//        }
//    }
}

