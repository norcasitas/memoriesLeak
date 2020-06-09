package com.norcasitas.memoriesleaks.lifecycle.handling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.norcasitas.memoriesleaks.R

class HandlingViewModelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.handling_view_model_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HandlingViewModelFragment.newInstance())
                .commitNow()
        }
    }
}