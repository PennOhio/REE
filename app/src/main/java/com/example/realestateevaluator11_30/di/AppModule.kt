package com.example.realestateevaluator11_30.di

import android.content.Context
import androidx.room.Room
import com.example.realestateevaluator11_30.dataBase.PropertyDatabase
import com.example.realestateevaluator11_30.dataBase.PropertyDatabaseDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object AppModule {

    @Provides
    @Singleton // Tell Dagger-Hilt to create a singleton accessible everywhere in ApplicationComponent (i.e. everywhere in the application)
    fun provideDatabase(@ApplicationContext app: Context): PropertyDatabase {
        return Room.databaseBuilder(
        app,
        PropertyDatabase::
        class.java,
        "property"
        ).build() //The Reason we can construct a database for the repo
    }

    @Provides
    fun providePropertyDatabaseDao(database: PropertyDatabase): PropertyDatabaseDao {
        return database.propertyDatabaseDao()
    }
// The reason we can implement a Dao for the database
}