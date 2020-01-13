package com.example.quakereport;

import android.os.AsyncTask;

import java.util.List;

public class EarthquakeAsyncTask extends AsyncTask<String, Void, List<Earthquake>> {

    private EarthquakeAdapter mAdapter;

    EarthquakeAsyncTask(EarthquakeAdapter adapter) {
        this.mAdapter = adapter;
    }

    @Override
    protected List<Earthquake> doInBackground(String... urls) {
        // Don't perform the request if there are no URLs, or the first URL is null.
        if (urls.length < 1 || urls[0] == null) {
            return null;
        }

        return QueryUtils.fetchEarthquakeData(urls[0]);
    }

    @Override
    protected void onPostExecute(List<Earthquake> earthquakes) {
        // Clear the adapter of previous earthquake data
        mAdapter.clear();

        // If there is a valid list of {@link Earthquake}s, then add them to the adapter's
        // data set. This will trigger the ListView to update.
        if (earthquakes != null && !earthquakes.isEmpty()) {
            mAdapter.addAll(earthquakes);
        }
    }
}
