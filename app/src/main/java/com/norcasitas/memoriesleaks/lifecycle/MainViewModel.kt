package com.norcasitas.memoriesleaks.lifecycle

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var thread: Thread

    init {
        thread = object : Thread() {
            override fun run() {
                try {
                    while (true) {
                        println("I'm a memory leak")
                        sleep(1000)
                    }
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }
    }

    fun start() {
        thread.start()
    }

    override fun onCleared() {
        thread.interrupt()
        super.onCleared()
    }
}