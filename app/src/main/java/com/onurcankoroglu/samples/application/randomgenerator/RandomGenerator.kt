package com.onurcankoroglu.samples.application.randomgenerator

import com.onurcankoroglu.samples.application.annotation.provider.AuthRandom
import javax.inject.Inject
import kotlin.random.Random

class RandomGenerator @Inject constructor(@AuthRandom private val mRandom: Random) {
    fun generateRandomNumber(min:Int, max: Int) = mRandom.nextInt(min, max)
}