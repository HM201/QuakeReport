package com.example.android.quakereport;

/**
 * Created by Hisham on 2/9/2018.
 */

public class Earthquake {

    private double quakeMagnitude;
    private String quakeLocation;
    private long  quakeDate;
    private String url;


    public Earthquake(double quakeMagnitude, String quakeLocation, long  quakeDate ,String url) {
        this.quakeMagnitude=quakeMagnitude;
        this.quakeLocation = quakeLocation;
        this.quakeDate = quakeDate;
        this.url = url;
    }

    public double getQuakeMagnitude() {
        return quakeMagnitude;
    }
    public String getQuakeLocation() {
        return quakeLocation;
    }
    public long getQuakeDate() {
        return quakeDate;
    }
    public String getURL() {
        return url;
    }
}
