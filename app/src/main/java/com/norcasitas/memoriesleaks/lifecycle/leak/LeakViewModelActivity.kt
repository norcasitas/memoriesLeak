package com.norcasitas.memoriesleaks.lifecycle.leak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.norcasitas.memoriesleaks.R

class LeakViewModelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.leak_view_model_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container,
                    LeakViewModelFragment.newInstance()
                )
                .commitNow()
        }
    }
}