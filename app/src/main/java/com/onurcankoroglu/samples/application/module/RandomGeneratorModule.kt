package com.onurcankoroglu.samples.application.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import com.onurcankoroglu.samples.application.annotation.provider.AuthRandom
import com.onurcankoroglu.samples.application.annotation.provider.AuthRandomWithSeed
import kotlin.random.Random

@Module
@InstallIn(ActivityComponent::class)
object RandomGeneratorModule {
    @AuthRandomWithSeed
    @Provides
    fun createRandomWithSeed() = Random(100)

    @AuthRandom
    @Provides
    fun createRandom() = Random(200)
}