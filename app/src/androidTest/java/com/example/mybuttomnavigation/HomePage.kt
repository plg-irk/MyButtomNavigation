package com.example.mybuttomnavigation

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId

class HomePage {

    fun clickHomeButton(): HomePage {
        Espresso.onView(withId(R.id.navigation_home))
            .perform(click())
        return this
    }

    fun checkHomeButtonIsDisable(): HomePage {
        Espresso.onView(withId(R.id.navigation_home))
            .check(matches(isDisplayed()))
        return this
    }

    fun chekTextHomeIsDisplayed(): HomePage {
        Espresso.onView(withId(R.id.text_home))
            .check(matches(ViewMatchers.withText("This is home Fragment")))
        return this
    }
}