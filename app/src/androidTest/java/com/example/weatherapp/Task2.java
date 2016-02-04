package com.example.weatherapp;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.weatherapp.activities.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getContext;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


// Complete
/**
 * Created by pivotal on 2016-01-12.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class Task2 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void setLocation() {
        openActionBarOverflowOrOptionsMenu(getContext());

        onView(withText(R.string.action_settings)).perform(click());

        onView(withText(R.string.preference_title)).check(matches(isDisplayed()));

        onView(withText(R.string.preference_zip_title)).perform(click());

        // chain action
        onView(withText(R.string.preference_zip_default)).perform(replaceText("Richmond Hill,Canada"));

        onView(withText("OK")).perform(click());

        onView(withText("Richmond Hill,Canada")).check(matches(withText("Richmond Hill,Canada")));
    }
}