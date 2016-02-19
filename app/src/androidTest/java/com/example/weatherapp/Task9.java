package com.example.weatherapp;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.weatherapp.activities.DetailsActivity;
import com.example.weatherapp.activities.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getContext;

// Incomplete
/**
 * Created by pivotal on 2016-01-12.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class Task9 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(DetailsActivity.class);

    @Test
    public void launch() {

        Intent intent = new Intent(getContext(), DetailsActivity.class);
        //startActivity(intent);
    }
}