package com.vectron_ftc.ftcquicknotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by cezar on 3/2/18.
 */

//    splash screen
public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.splash_screen);
        Intent launchApp = new Intent(this, Hub.class);
        startActivity(launchApp);
        finish();
    }
}
