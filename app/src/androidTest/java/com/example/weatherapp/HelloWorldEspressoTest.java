package com.example.weatherapp;
import android.os.SystemClock;
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

import android.support.test.InstrumentationRegistry;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by pivotal on 2016-01-12.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class HelloWorldEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void openOverFlow() {
        // onView(withText("Today,")).check(matches(isDisplayed()));
        openActionBarOverflowOrOptionsMenu(getContext());
        SystemClock.sleep(3000);
        onView(withText("Settings")).perform(click());
    }
}