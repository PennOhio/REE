package com.example.realestateevaluator11_30.dataentry

import android.app.Application
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.example.realestateevaluator11_30.dataBase.Property
import com.example.realestateevaluator11_30.dataBase.PropertyDatabaseDao
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.lang.IllegalArgumentException


class DataEntryViewModel @ViewModelInject constructor(
    @Assisted savedStateHandle: SavedStateHandle
): ViewModel(), LifecycleObserver {


    companion object {
        private val PROPERTY_KEY = "propertyId"
    }

    val name: String = "Test"


    private val _navigateToResults = MutableLiveData<Boolean>()

    /**
     * If this is non-null, immediately navigate to [Results] and call [doneNavigating]
     */
    val navigateToResults: LiveData<Boolean>
        get() = _navigateToResults


    fun doneNavigating() {
        _navigateToResults.value = null
    }

    fun onDataEntryFinish() {
        _navigateToResults.value = true
    }
}



















