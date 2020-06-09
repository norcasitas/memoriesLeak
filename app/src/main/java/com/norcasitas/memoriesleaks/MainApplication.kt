package com.norcasitas.memoriesleaks

import android.app.Application
import android.os.StrictMode

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        enabledStrictMode()
    }

    private fun enabledStrictMode() {
        StrictMode.setThreadPolicy(
            StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .penaltyDeath()
                .build()
        )
    }
}