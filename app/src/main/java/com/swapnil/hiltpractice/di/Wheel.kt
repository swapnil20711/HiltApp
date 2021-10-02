package com.swapnil.hiltpractice.di

import android.util.Log
import javax.inject.Inject

class Wheel @Inject constructor() {
    fun getWheel(){
        Log.e("main", "Wheel mil gaya...")
    }
}