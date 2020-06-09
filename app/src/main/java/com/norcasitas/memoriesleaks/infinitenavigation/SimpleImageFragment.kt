package com.norcasitas.memoriesleaks.infinitenavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.norcasitas.memoriesleaks.R

class SimpleImageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple_image, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.infinite_navigation_with_fragments).setOnClickListener {
            requireFragmentManager()
                .beginTransaction()
                .add(android.R.id.content, newInstance(), "FRAGMENT_TAG")
                .addToBackStack("FRAGMENT_TAG")
                .detach(this)
                .commit()
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = SimpleImageFragment()
    }
}