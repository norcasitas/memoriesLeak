package com.norcasitas.memoriesleaks.lifecycle.leak

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.norcasitas.memoriesleaks.R
import com.norcasitas.memoriesleaks.lifecycle.MainViewModel

class LeakViewModelFragment : Fragment() {

    companion object {
        fun newInstance() =
            LeakViewModelFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = MainViewModel() //We dont use the ViewModel provider
        viewModel.start()
    }
}