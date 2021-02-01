package com.onurcankoroglu.samples.application.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SampleHiltApplication : Application() {
    val tag = "Sample Hilt Application"
}