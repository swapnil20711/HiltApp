package com.swapnil.hiltpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.swapnil.hiltpractice.di.Car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    /*
    * Dependency of car is being injected here in runtime no need to instantiate car object
    * */
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        car.getCar()
    }
}