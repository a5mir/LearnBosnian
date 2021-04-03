package com.asmir.learnbosnian;

public class Word {
    private String mDefaultTranslation;
    private String mBosnianTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String bosnianTranslation){
        mDefaultTranslation = defaultTranslation;
        mBosnianTranslation = bosnianTranslation;
    }

    public Word(String defaultTranslation, String bosnianTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mBosnianTranslation = bosnianTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }


    public String getBosnianTranslation(){
        return mBosnianTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
