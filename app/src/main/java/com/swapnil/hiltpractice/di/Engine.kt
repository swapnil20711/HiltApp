package com.swapnil.hiltpractice.di

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor() {
    fun getEngine(){
        Log.e("main", "Engine mil gaya..." )
    }
}