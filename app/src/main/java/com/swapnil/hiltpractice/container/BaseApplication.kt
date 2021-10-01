package com.swapnil.hiltpractice.container

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/*
* This class is the container which contains all the dependencies
* */
@HiltAndroidApp
class BaseApplication : Application()