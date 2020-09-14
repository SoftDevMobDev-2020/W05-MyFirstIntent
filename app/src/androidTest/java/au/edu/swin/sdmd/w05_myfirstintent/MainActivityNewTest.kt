package au.edu.swin.sdmd.w05_myfirstintent

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class MainActivityNewTest {

    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity>
            = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test_checkDetailImageAppears() {

        onView(
            withId(R.id.mainImage)
        ).perform(click())

        onView(
            withId(R.id.detailImage)
        ).check(matches(isDisplayed()))
    }

}
