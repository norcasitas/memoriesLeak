package com.norcasitas.memoriesleaks

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.norcasitas.memoriesleaks.infinitenavigation.InfiniteNavigationActivitiesActivity
import com.norcasitas.memoriesleaks.infinitenavigation.InfiniteNavigationFragmentsActivity
import com.norcasitas.memoriesleaks.lifecycle.handling.HandlingViewModelActivity
import com.norcasitas.memoriesleaks.lifecycle.leak.LeakViewModelActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.infinite_navigation_with_activities).setOnClickListener {
            startActivity(Intent(this, InfiniteNavigationActivitiesActivity::class.java))
        }

        findViewById<Button>(R.id.infinite_navigation_with_fragments).setOnClickListener {
            startActivity(Intent(this, InfiniteNavigationFragmentsActivity::class.java))
        }

        findViewById<Button>(R.id.view_model_leak).setOnClickListener {
            startActivity(Intent(this, LeakViewModelActivity::class.java))
        }

        findViewById<Button>(R.id.view_model_leak).setOnClickListener {
            startActivity(Intent(this, LeakViewModelActivity::class.java))
        }

        findViewById<Button>(R.id.view_model_handling).setOnClickListener {
            startActivity(Intent(this, HandlingViewModelActivity::class.java))
        }
    }
}