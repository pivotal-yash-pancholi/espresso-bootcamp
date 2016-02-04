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
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

// Complete
/**
 * Created by pivotal on 2016-01-12.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class Task3 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void refreshCheck() {
        //onView(withText("Tomorrow")).perform(swipeDown());
        onView(withId(R.id.refresh_layout)).perform(swipeDown());
        onView(withId(R.id.snackbar_text)).check(matches(isDisplayed()));
    }
}