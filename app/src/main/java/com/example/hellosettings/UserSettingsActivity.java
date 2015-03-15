package com.example.hellosettings;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Lu on 3/15/2015.
 */
public class UserSettingsActivity extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}
