package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Hisham on 2/16/2018.
 */

//Loader Class declaration
public class EarthquakeAsyncTaskLoader extends AsyncTaskLoader<ArrayList<Earthquake>> {

    private String url;
    public EarthquakeAsyncTaskLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    public ArrayList<Earthquake> loadInBackground() {
        if(url==null)
            return null;
        //fetch earthquake data from json file
        ArrayList<Earthquake> earthquakes =  QueryUtils.fetchEarthquakeData(url);
        return earthquakes;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }
}