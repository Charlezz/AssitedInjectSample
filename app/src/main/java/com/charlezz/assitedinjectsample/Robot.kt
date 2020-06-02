package com.charlezz.assitedinjectsample

import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject

class Robot @AssistedInject constructor(@Assisted val name: String, val id: Int) {

    fun say():String = "Hello, I'm ${name}.\n My id is $id"

    @AssistedInject.Factory
    interface Factory {
        fun create(name: String): Robot
    }
}