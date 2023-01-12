package com.example.myapplication;

import android.util.Log;

public class ChildOfAbstractParentClassJava extends AbstractParentClassJava {

    String someString;

    ChildOfAbstractParentClassJava(String someParameter) {
        someString = someParameter;
        //Compile error.
        super();
    }

    @Override
    void someInitializationFunction() {
        Log.i("KotlinAndroid", "someInitializationFunction() is being called in ChildOfAbstractParentClassJava. someString: " + someString);
    }
}
