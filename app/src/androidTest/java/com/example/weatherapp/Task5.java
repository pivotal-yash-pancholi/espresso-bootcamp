package com.example.weatherapp;
import android.os.SystemClock;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.BoundedMatcher;
import android.support.test.runner.AndroidJUnit4;

import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import android.test.suitebuilder.annotation.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import com.example.weatherapp.activities.MainActivity;
import com.example.weatherapp.adapters.CursorRecyclerAdapter;

import android.support.test.rule.ActivityTestRule;
import android.util.EventLogTags;
import android.widget.*;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.Espresso.*;
import static android.support.test.InstrumentationRegistry.*;

import android.support.test.InstrumentationRegistry;

import static android.support.test.espresso.matcher.ViewMatchers.hasSibling;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withChild;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withInputType;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withTagValue;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.*;
import static android.view.View.*;
import static org.hamcrest.Matcher.*;
import java.lang.String;
import java.util.Map;


// Incomplete
/**
 * Created by pivotal on 2016-01-12.
 */
@RunWith(AndroidJUnit4.class)
@Ignore
public class Task5 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Ignore
    public void todaysWeather() {
        SystemClock.sleep(1000);
        //onData(allOf(is(instanceOf(String.class)), hasToString("Today"))).inAdapterView(allOf(isAssignableFrom(CursorAdapter.class), isDisplayed())).perform(click());
        //onData(allOf(withParent(is(instanceOf(CursorAdapter.class)), withRowInt(withText(R.string.today)), 0))).perform(click());
    }
}