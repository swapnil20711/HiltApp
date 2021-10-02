package com.swapnil.hiltpractice.di

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor() {
    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.e("main","Car ban gayi...")
    }
}