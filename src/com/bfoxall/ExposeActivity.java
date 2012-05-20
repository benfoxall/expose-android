package com.bfoxall;

import android.os.Bundle;
import org.apache.cordova.*;

public class ExposeActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        System.out.println("Yuup, this works");
        super.loadUrl("file:///android_asset/www/index.html");
    }
}