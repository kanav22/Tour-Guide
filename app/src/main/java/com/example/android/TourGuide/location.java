package com.example.android.TourGuide;

/**
 * Created by kanav on 19/09/17.
 */

public class location {

    private String mName;
    private String mAddress;
    private int mImage;
    private String mdescription;
    private int mbudget;

    public location(String name, String address, int image, String description, int budget) {
        mName = name;
        mAddress = address;
        mImage = image;
        mdescription = description;
        mbudget = budget;
    }

    public location(String name, String address, int Image) {
        mName = name;
        mAddress = address;
        mImage = Image;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImage() {
        return mImage;
    }

    public String getDescription() {
        return mdescription;
    }

    public int getbudget() {
        return mbudget;
    }
}
