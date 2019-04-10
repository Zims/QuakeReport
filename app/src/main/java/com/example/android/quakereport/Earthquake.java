package com.example.android.quakereport;

public class Earthquake {

    private Double mMagnitude;

    private String mLocation;

    //private String mDate;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    public Earthquake(Double magnitude, String location, long timeInMilliseconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {return mTimeInMilliseconds;}
}
