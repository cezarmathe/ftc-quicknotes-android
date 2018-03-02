package com.vectron_ftc.ftcquicknotes;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.vectron_ftc.ftcquicknotes.DataHolders.Screen;
import com.vectron_ftc.ftcquicknotes.Helpers.PreferencesHelper;

public class Hub extends AppCompatActivity {

    private Screen currentScreen;
    private DrawerLayout hubDrawer;
    private PreferencesHelper preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        retrieving what screen we should show
        Intent intent = getIntent();
        currentScreen = Screen.getScreenFromString(intent.getStringExtra("screen"));

        setContentView(R.layout.activity_hub);

//        initialize preferences
        preferences = new PreferencesHelper(getApplicationContext());
//        handling navigation bar
        hubDrawer = findViewById(R.id.hub_drawer);
        NavigationView hubNavigation = findViewById(R.id.hub_navigation);
        hubNavigation.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
//                         set item as selected to persist highlight
                        menuItem.setChecked(true);
//                         close drawer when item is tapped
                        hubDrawer.closeDrawers();
//                        set current screen from the selected menu
                        int menuId = menuItem.getItemId();
                        if (menuId != R.id.settings) {
                            currentScreen = setScreenFromMenuItem(menuId);
                            saveScreen(currentScreen.toString());
                        }
                        else {
                            saveScreen(currentScreen.toString());
                            launchSettings();
                        }
                        return true;
                    }
                });
    }

    @Override
    protected void onDestroy() {
        saveScreen(currentScreen.toString());
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        saveScreen(currentScreen.toString());
        super.onPause();
    }

    @Override
    protected void onResume() {
        // TODO: 3/2/18 add resume screen method: reload the last screen
        getScreen();
        reload();
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
//        View v
        hubDrawer = findViewById(R.id.hub_drawer);
        if (hubDrawer.isDrawerOpen(R.id.hub_drawer)) {
            hubDrawer.closeDrawer(R.id.hub_drawer);
        }
    }

    public Screen setScreenFromMenuItem(int menuId) {
        switch (menuId) {
            case R.id.drafts:
                return Screen.DRAFTS;
            case R.id.finished_things:
                return Screen.FINISHED_THINGS;
            case R.id.quick_notes:
                return Screen.QUICK_NOTES;
            case R.id.pic_bundles:
                return Screen.BUNDLES_OF_PICTURES;
            case R.id.spy_reports:
                return Screen.SPY_REPORTS;
            case R.id.future_plans_activities:
                return Screen.FUTURE_PLANS_ACTIVITIES;
            case R.id.archive:
                return Screen.ARCHIVE;
            case R.id.tags:
                return Screen.TAGS;
            case R.id.bin:
                return Screen.BIN;
            default:
                return Screen.DRAFTS;
        }
    }

    public void saveScreen(String value) {
        preferences.writeString("screen", value);
    }

    public void getScreen() {
        currentScreen = Screen.getScreenFromString(preferences.readString("screen"));
    }

    public void launchSettings() {
        // TODO: 3/2/18 replace Splash.class with Settings.class
        Intent launchSettings = new Intent(Hub.this, Splash.class);
        startActivity(launchSettings);
    }

    public void reload() {
        // TODO: 3/2/18 write function for reloading list items according to current screen
    }
}
