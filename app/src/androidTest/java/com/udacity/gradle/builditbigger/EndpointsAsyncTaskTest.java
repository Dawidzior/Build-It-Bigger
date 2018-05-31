package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import pl.dawidzior.javajokerlib.Joker;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Test
    public void endpointsAsyncTaskJokeRetrieveTest() {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        String jokeFromAsync = endpointsAsyncTask.doInBackground(InstrumentationRegistry.getContext());
        assertNotNull(jokeFromAsync);
        assertEquals(jokeFromAsync, Joker.tellJoke());
    }
}
