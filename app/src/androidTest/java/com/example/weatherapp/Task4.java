package com.example.weatherapp;
import android.support.test.runner.AndroidJUnit4;
import org.junit.runner.RunWith;
import android.test.suitebuilder.annotation.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import com.example.weatherapp.activities.MainActivity;
import android.support.test.rule.ActivityTestRule;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.InstrumentationRegistry.*;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.*;
import java.lang.String;


// Complete

/**
 * Created by pivotal on 2016-01-12.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class Task4 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void changeUnits() {
        openActionBarOverflowOrOptionsMenu(getContext());

        onView(withText(R.string.action_settings)).perform(click());

        onView(withText(R.string.preference_title)).check(matches(isDisplayed()));

        onView(withText("Temperature Units")).perform(click());

        // checks if the imperial option in the adapter view is assignable from a parent class and is displayed then clicks on it
        //onData(allOf(is(instanceOf(String.class)), hasToString("Imperial"))).inAdapterView(allOf(isAssignableFrom(android.widget.AdapterView.class), isDisplayed())).perform(click());
        onData(allOf(is(instanceOf(String.class)), hasToString("Imperial"))).perform(click());
    }
}