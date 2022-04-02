package com.example.mybuttomnavigation

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId

class DashboardPage {

    fun clickDashboardButton(): DashboardPage {
        Espresso.onView(withId(R.id.navigation_dashboard))
            .perform(ViewActions.click())
        return this
    }

    fun checkTextDashboardIsDisplay(): DashboardPage {
        Espresso.onView(withId(R.id.text_dashboard))
            .check(ViewAssertions.matches(ViewMatchers.withText("This is dashboard Fragment")))
        return this
    }


}