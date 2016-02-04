package com.example.weatherapp;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.espresso.matcher.BoundedMatcher;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.junit.runner.RunWith;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.test.suitebuilder.annotation.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.w3c.dom.Text;

import com.example.weatherapp.activities.MainActivity;
import com.example.weatherapp.adapters.ForecastAdapter;
import com.example.weatherapp.models.ForecastList;

import android.support.test.rule.ActivityTestRule;
import android.util.EventLogTags;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import android.view.View;
import android.widget.TextView;

import static android.support.test.InstrumentationRegistry.getContext;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import java.util.Date;
import java.util.List;
import org.hamcrest.*;

// Complete
/**
 * Created by pivotal on 2016-01-12.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class Task6 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void lastForecast() {
        // gets day index for current day
        int dayIndex = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        String previousDay ;

        // sets it to previous day
        switch(dayIndex) {
            case 1:
                previousDay = "Saturday";
                break;
            case 2:
                previousDay = "Sunday";
                break;
            case 3:
                previousDay = "Monday";
                break;
            case 4:
                previousDay = "Tuesday";
                break;
            case 5:
                previousDay = "Wednesday";
                break;
            case 6:
                previousDay = "Thursday";
                break;
            case 7:
                previousDay = "Friday";
                break;
            default:
                previousDay = "Tomorrow";
        }

        onView(withId(R.id.recyclerview_forecast)).perform(RecyclerViewActions.actionOnItem(hasDescendant(withText(previousDay)), click()));
    }
}