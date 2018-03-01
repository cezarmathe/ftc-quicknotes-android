package com.vectron_ftc.ftcquicknotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.vectron_ftc.ftcquicknotes.DataHolders.Screen;

public class Hub extends AppCompatActivity {

    private Screen currentScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);
    }
}
