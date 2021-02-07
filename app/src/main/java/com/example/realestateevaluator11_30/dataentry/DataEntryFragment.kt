package com.example.realestateevaluator11_30.dataentry

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.viewModels
import androidx.lifecycle.*
import androidx.navigation.fragment.findNavController
import com.example.realestateevaluator11_30.R
import com.example.realestateevaluator11_30.dataBase.PropertyDatabase
import com.example.realestateevaluator11_30.databinding.DataEntryFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@AndroidEntryPoint
class DataEntryFragment : Fragment() {

    private val model: DataEntryViewModel by viewModels()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        // Get a reference to the binding object and inflate the fragment views.
        val binding: DataEntryFragmentBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.data_entry_fragment,
            container,
            false
        )

        binding.titleView.text = model.name.toString()


        // Add an Observer for button click to view results
        model.navigateToResults.observe(viewLifecycleOwner, Observer<Boolean> { isClicked ->
            if (isClicked) dataEntryComplete()
        })

        return binding.root

    }

    private fun dataEntryComplete() {
        val action = DataEntryFragmentDirections.actionDataEntryFragmentToResultsPageFragment()
        findNavController().navigate(action)
    }




}