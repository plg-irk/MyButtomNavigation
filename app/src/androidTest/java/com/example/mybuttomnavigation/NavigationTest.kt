package com.example.mybuttomnavigation

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule


@RunWith(AndroidJUnit4::class)
class NavigationTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    // Проверка доступности кнопки HOME
    @Test
    fun checkHomeButtonIsDisplayed() {
        onView(withId(R.id.navigation_home))
            .perform(click())
            .check(matches(isDisplayed()))
    }

    // Проверка возврата на страницу HOME
    @Test
    fun clickHomeButtonIsDisplayed() {
        onView(withId(R.id.navigation_dashboard))
            .perform(click())
        onView(withId(R.id.navigation_home))
            .perform(click())
        onView(withId(R.id.text_home))
            .check(matches(withText("This is home Fragment")))
    }

    // Проверка перехода на страницу Dashboard
    @Test
    fun clickDashboardButtonIsDisplayed() {
        onView(withId(R.id.navigation_dashboard))
            .perform(click())
        onView(withId(R.id.text_dashboard))
            .check(matches(withText("This is dashboard Fragment")))
    }

    // Проверка перехода на страницу Notification
    @Test
    fun clickNotificationButtonIsDisplayed() {
        onView(withId(R.id.navigation_notifications))
            .perform(click())
        onView(withId(R.id.text_notifications))
            .check(matches(withText("This is notifications Fragment")))
    }

}


