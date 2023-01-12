package com.example.myapplication

import android.util.Log

class ChildOfAbstractParentClass(val someParameterString: String?) : AbstractParentClass() {

    override fun someInitializationFunction() {
        Log.i(
            "KotlinAndroid",
            "someInitializationFunction() is being called in ChildOfAbstractParentClass. someParameterString: ${someParameterString ?: "null"}"
        )
    }

}