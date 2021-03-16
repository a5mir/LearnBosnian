package com.asmir.learnbosnian;

public class Word {
    private String mDefaultTranslation;
    private String mBosnianTranslation;

    public Word(String defaultTranslation, String bosnianTranslation){
        mDefaultTranslation = defaultTranslation;
        mBosnianTranslation = bosnianTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }


    public String getBosnianTranslation(){
        return mBosnianTranslation;
    }
}
