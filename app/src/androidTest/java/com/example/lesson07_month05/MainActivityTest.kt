package com.example.lesson07_month05


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    var rule =ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun sum(){
        onView(withId(R.id.et_Calc)).perform(typeText("2"))
        onView(withId(R.id.et_Calc2)).perform(typeText("2"), closeSoftKeyboard())
        onView(withId(R.id.tv_Calc_result)).check(matches(withText("4")))
    }
    @Test
    fun divide(){
        onView(withId(R.id.et_Calc)).perform(typeText("8"))
        onView(withId(R.id.et_Calc2)).perform(typeText("4"), closeSoftKeyboard())
        onView(withId(R.id.tv_Calc_result)).check(matches(withText("2")))
    }
    @Test
    fun minus(){
        onView(withId(R.id.et_Calc)).perform(typeText("10"))
        onView(withId(R.id.et_Calc2)).perform(typeText("9"), closeSoftKeyboard())
        onView(withId(R.id.btn_Calc_minus)).perform(click())
        onView(withId(R.id.tv_Calc_result)).check(matches(withText("1")))
    }
    @Test
    fun increase(){
        onView(withId(R.id.et_Calc)).perform(typeText("10"))
        onView(withId(R.id.et_Calc2)).perform(typeText("2"), closeSoftKeyboard())
        onView(withId(R.id.tv_Calc_result)).check(matches(withText("20")))
    }
    @Test
    fun percent(){
        onView(withId(R.id.et_Calc)).perform(typeText("250"))
        onView(withId(R.id.et_Calc2)).perform(typeText("30"), closeSoftKeyboard())
        onView(withId(R.id.tv_Calc_result)).check(matches(withText("75")))
    }
    @Test
    fun equation(){
        onView(withId(R.id.et_Calc)).perform(typeText("2"))
        onView(withId(R.id.et_Calc2)).perform(typeText("3"), closeSoftKeyboard())
        onView(withId(R.id.tv_Calc_result)).check(matches(withText("10")))
    }
    @Test
    fun squareRoot(){
        onView(withId(R.id.et_Calc)).perform(typeText("2"))
        onView(withId(R.id.et_Calc2)).perform(typeText("4"), closeSoftKeyboard())
        onView(withId(R.id.tv_Calc_result)).check(matches(withText("36")))
    }

    @Test
    fun calculatorTv(){
        onView(withId(R.id.tv_calculate)).check(matches(withText("calculator")))
    }
}