package com.charlezz.assitedinjectsample

import com.squareup.inject.assisted.dagger2.AssistedModule
import dagger.Module
import dagger.Provides
import kotlin.random.Random

@AssistedModule
@Module(includes = [AssistedInject_RobotModule::class])
class RobotModule {
    @Provides
    fun provideRandomId() = Random.nextInt(10000)
}