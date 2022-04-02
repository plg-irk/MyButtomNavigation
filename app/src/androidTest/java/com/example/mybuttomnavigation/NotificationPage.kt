package com.example.mybuttomnavigation

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

class NotificationPage {

    fun clickNotificationButton(): NotificationPage {
        onView(withId(R.id.navigation_notifications))
            .perform(click())
        return NotificationPage()
    }

    fun checkTextNotificationIsDisplay(): NotificationPage {
        onView(withId(R.id.text_notifications))
            .check(matches(withText("This is notifications Fragment")))
        return NotificationPage()
    }
}