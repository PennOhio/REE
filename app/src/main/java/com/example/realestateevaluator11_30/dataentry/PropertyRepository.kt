package com.example.realestateevaluator11_30.dataentry

import android.telecom.Call
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.realestateevaluator11_30.dataBase.Property
import com.example.realestateevaluator11_30.dataBase.PropertyDatabase
import com.example.realestateevaluator11_30.dataBase.PropertyDatabaseDao
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.withContext
import java.lang.reflect.Executable
import java.util.concurrent.Executor
import javax.inject.Inject
import javax.security.auth.callback.Callback


class PropertyRepository (private val database: PropertyDatabase) {


    }

//    private fun refreshProperty(propertyId: String) {
//        // Runs in a background thread.
//        executor.execute {
//            // check if user data was fetched recently.
//            val propertyExists = propertyDatabaseDao.hasProperty(FRESH_TIMEOUT)
//            if (!propertyExists) {
//                // Refreshes the data
//                val response = webservice.getProperty(propertyId).execute()
//                // Check for errors here
//
//                // Updates the database. The LiveData object automatically
//                // refreshes, so we don't need to do anything else here.
//                propertyDatabaseDao.insert(response.body()!!)
//            }
//
//        }
//    }
