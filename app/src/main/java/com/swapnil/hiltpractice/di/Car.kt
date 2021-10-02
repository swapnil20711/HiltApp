package com.swapnil.hiltpractice.di

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor() {
    fun getCar(){
        Log.e("main","Car mil gayi...")
    }
}