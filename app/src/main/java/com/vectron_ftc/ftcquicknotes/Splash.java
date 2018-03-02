package com.vectron_ftc.ftcquicknotes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.vectron_ftc.ftcquicknotes.Helpers.PreferencesHelper;

/**
 * Created by cezar on 3/2/18.
 */

//    splash screen
public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PreferencesHelper prefs = new PreferencesHelper(getApplicationContext());
//        setContentView(R.layout.splash_screen);

//        launch the hub screen
//        read the preferences to get the last screen
        Intent launchApp = new Intent(Splash.this, Hub.class);
        launchApp.putExtra("screen", prefs.readString("screen"));
        startActivity(launchApp);
        finish();
    }
}
