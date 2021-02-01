package com.onurcankoroglu.samples.application.randomgenerator

import android.content.Context
import android.widget.Toast
import dagger.hilt.android.qualifiers.ActivityContext
import java.util.concurrent.ThreadLocalRandom
import javax.inject.Inject

class ThreadLocalRandomInjectGenerator @Inject constructor(
        private val mThreadLocalRandom: ThreadLocalRandom,
        @ActivityContext private val mContext: Context)
{
    init { Toast.makeText(mContext, "Thread Local Random Inject Generator", Toast.LENGTH_LONG).show() }
    fun generateRandomNumber(min:Int, max: Int) = mThreadLocalRandom.nextInt(min, max)
}