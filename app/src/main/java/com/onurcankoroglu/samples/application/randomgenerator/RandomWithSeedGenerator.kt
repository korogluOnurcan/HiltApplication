package com.onurcankoroglu.samples.application.randomgenerator

import android.content.Context
import android.widget.Toast
import dagger.hilt.android.qualifiers.ApplicationContext
import com.onurcankoroglu.samples.application.annotation.provider.AuthRandomWithSeed
import com.onurcankoroglu.samples.application.application.SampleHiltApplication
import javax.inject.Inject
import kotlin.random.Random

class RandomWithSeedGenerator @Inject constructor(
    @AuthRandomWithSeed private val mRandom: Random,
    @ApplicationContext private val mContext: Context)
{
    init { Toast.makeText(mContext, (mContext as SampleHiltApplication).tag, Toast.LENGTH_LONG).show() }
    fun generateRandomNumber(min:Int, max: Int) = mRandom.nextInt(min, max)
}