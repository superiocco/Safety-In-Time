package com.phonegap;

import android.os.Bundle;
import com.phonegap.*;

public class CameraPhoneGapActivity extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
