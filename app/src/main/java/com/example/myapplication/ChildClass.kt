package com.example.myapplication

import android.util.Log

class ChildClass : ParentClass() {

    fun parentFunction(parameter: Any? = null) {
        Log.i("KotlinAndroid", "parentFunction() is being called in ChildClass.")
    }
}