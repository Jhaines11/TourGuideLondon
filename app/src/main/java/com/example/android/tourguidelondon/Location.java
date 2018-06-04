package com.example.android.tourguidelondon;

public class Location
{
    private int mNameId;
    private int mDescriptionId;
    private int mImageId;

    public Location(int aNameId, int aDescriptionId, int aImageId)
    {
        mNameId = aNameId;
        mDescriptionId = aDescriptionId;
        mImageId = aImageId;
    }

    public Location(int aName, int aDescription)
    {
        mNameId = aName;
        mDescriptionId = aDescription;
        mImageId = 0;
    }

    public int getNameId()
    {
        return mNameId;
    }

    public int getDescriptionId()
    {
        return mDescriptionId;
    }

    public int getImageId()
    {
        return mImageId;
    }
}
