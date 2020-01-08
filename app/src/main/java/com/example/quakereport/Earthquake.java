package com.example.quakereport;

class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    Earthquake(String magnitude, String location, long timeInMilliseconds, String url) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
        this.mUrl = url;
    }

    String getMagnitude() {
        return mMagnitude;
    }

    String getLocation() {
        return mLocation;
    }

    long getDate() {
        return mTimeInMilliseconds;
    }

    String getUrl() {
        return mUrl;
    }
}
