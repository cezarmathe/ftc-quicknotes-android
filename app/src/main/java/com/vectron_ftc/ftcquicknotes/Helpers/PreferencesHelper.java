package com.vectron_ftc.ftcquicknotes.Helpers;

import android.content.Context;
import android.content.SharedPreferences;

import com.vectron_ftc.ftcquicknotes.Constants.Constants;

/**
 * Created by cezar on 3/2/18.
 */

//    helper for accesing preferences
public class PreferencesHelper {

    private SharedPreferences preferences;

    public PreferencesHelper(Context context) {
        preferences = context.getSharedPreferences(Constants.STORAGE, Context.MODE_PRIVATE);
    }

    public SharedPreferences.Editor editor() {
        SharedPreferences.Editor editor = preferences.edit();
        return editor;
    }

    public void writeString(String key, String value) {
        editor().putString(key, value);
    }

    public void writeInt(String key, int value) {
        editor().putInt(key, value);
    }

    public int readInt(String key) {
        return preferences.getInt(key, 0);
    }

    public String readString(String key) {
        return preferences.getString(key, "");
    }
}
