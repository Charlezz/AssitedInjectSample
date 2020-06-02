package com.charlezz.assitedinjectsample

import dagger.Component

@Component(modules = [RobotModule::class])
interface RobotComponent{
    fun inject(activity: RobotActivity)
}