package com.example.weatherapp;
import android.support.annotation.NonNull;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.BoundedMatcher;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.RecyclerView;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;

import com.example.weatherapp.activities.MainActivity;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;

// Complete
/**
 * Created by pivotal on 2016-01-12.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class Task7 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void cardCount() {
        onView(ViewMatchers.withId(R.id.recyclerview_forecast)).check(ViewAssertions.matches(recyclerViewCount(7)));
    }

    @NonNull
    public static Matcher<View> recyclerViewCount(final int totalCards) {

        return new BoundedMatcher<View, RecyclerView>(RecyclerView.class) {
            int actualCount = 0;
            @Override
            public void describeTo(final Description description) {
                description.appendText("with error text: " + totalCards + " vs. " + actualCount);
            }

            @Override
            public boolean matchesSafely(final RecyclerView recyclerView) {
                // getadapter().getitemcount will return the TOTAL number of cards the adapter holds,
                // since the adapter holds all the data related to the recycler view
                actualCount = recyclerView.getAdapter().getItemCount();
                return totalCards == actualCount;
            }
        };
    }

}