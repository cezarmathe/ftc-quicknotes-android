package com.vectron_ftc.ftcquicknotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Hub extends AppCompatActivity {

    private FloatingActionButton superButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hub);

        superButton = findViewById(R.id.superButton);
        superButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createNewItem();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void createNewItem() {
        Intent intent = new Intent(this, NewItem.class);
        startActivity(intent);
    }
}
