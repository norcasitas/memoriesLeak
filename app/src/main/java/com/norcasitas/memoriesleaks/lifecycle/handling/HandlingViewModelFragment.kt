package com.norcasitas.memoriesleaks.lifecycle.handling

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.norcasitas.memoriesleaks.R
import com.norcasitas.memoriesleaks.lifecycle.MainViewModel

class HandlingViewModelFragment : Fragment() {

    companion object {
        fun newInstance() =
            HandlingViewModelFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.start()
    }

}