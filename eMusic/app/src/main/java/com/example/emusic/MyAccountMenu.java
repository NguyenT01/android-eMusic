package com.example.emusic;

import android.content.Intent;
import android.os.Bundle;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

public class MyAccountMenu extends PreferenceFragmentCompat {
    Preference settings, aboutApp;

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.user_setting, rootKey);

        settings = findPreference("run_settings");
        aboutApp = findPreference("run_about");


        settings.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                Intent intent = new Intent(getActivity(), Settings.class);
                startActivity(intent);

                return true;
            }
        });

        aboutApp.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                Intent intent = new Intent(getActivity(), AboutThisApp.class);
                startActivity(intent);
                return true;
            }
        });

    }
}
