package com.example.realestateevaluator11_30.results

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.realestateevaluator11_30.R

class ResultsPageFragment : Fragment() {

    private lateinit var viewModel: ResultsPageViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.results_page_fragment, container, false)
    }



}