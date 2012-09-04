package com.smartsAndStamina;

import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;

import org.apache.cordova.*;

import com.yourAppName.yourappname.R;

public class MainClass extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
