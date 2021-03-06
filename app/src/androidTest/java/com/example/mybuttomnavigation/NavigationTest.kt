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
        HomePage().checkHomeButtonIsDisable()
    }

    // Проверка возврата на страницу HOME
    @Test
    fun clickHomeButtonIsDisplayed() {
        DashboardPage()
            .clickDashboardButton()
        HomePage()
            .clickHomeButton()
            .chekTextHomeIsDisplayed()
    }

    // Проверка перехода на страницу Dashboard
    @Test
    fun clickDashboardButtonIsDisplayed() {
        DashboardPage()
            .clickDashboardButton()
            .checkTextDashboardIsDisplay()
    }

    // Проверка перехода на страницу Notification
    @Test
    fun clickNotificationButtonIsDisplayed() {
        NotificationPage()
            .clickNotificationButton()
            .checkTextNotificationIsDisplay()

    }

}


