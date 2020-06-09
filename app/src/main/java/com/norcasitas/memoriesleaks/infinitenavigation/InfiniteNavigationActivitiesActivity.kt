package com.norcasitas.memoriesleaks.infinitenavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.norcasitas.memoriesleaks.R

class InfiniteNavigationActivitiesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infinite_navigation_activities)

        findViewById<Button>(R.id.infinite_navigation_with_activities).setOnClickListener {
            startActivity(Intent(this, InfiniteNavigationActivitiesActivity::class.java))
        }
    }
}