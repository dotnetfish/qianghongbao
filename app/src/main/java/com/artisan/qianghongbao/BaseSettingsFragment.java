package com.artisan.qianghongbao;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * <p>Created 16/2/5 下午9:06.</p>
 * <p><a href="mailto:artisan2013@gmail.com">Email:artisan2013@gmail.com</a></p>
 * <p><a href="http://www.happyartisan.com">LeonLee Blog</a></p>
 *
 * @author LeonLee
 */
public class BaseSettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPreferenceManager().setSharedPreferencesName(Config.PREFERENCE_NAME);
    }
}
