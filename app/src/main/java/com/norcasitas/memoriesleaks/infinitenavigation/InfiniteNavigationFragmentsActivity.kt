package com.norcasitas.memoriesleaks.infinitenavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.norcasitas.memoriesleaks.R

class InfiniteNavigationFragmentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infinite_navigation_fragments)

        supportFragmentManager
            .beginTransaction()
            .add(android.R.id.content, SimpleImageFragment(),"FRAGMENT_TAG")
            .commit()
    }
}