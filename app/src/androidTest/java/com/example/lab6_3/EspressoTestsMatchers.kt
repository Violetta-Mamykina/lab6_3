package com.example.lab6_3

import android.view.View
import org.hamcrest.Matcher

object EspressoTestsMatchers {

    fun existDrawable(): Matcher<View> {
        return DrawableMatcher()
    }


}