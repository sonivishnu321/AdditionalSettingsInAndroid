package com.vks.additional_settings_sdk.settings

import android.os.Bundle
import android.preference.PreferenceFragment
import com.vks.additional_settings_sdk.R


class SettingsFragment : PreferenceFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // below line is used to add preference
        // fragment from our xml folder.
        addPreferencesFromResource(R.xml.preferences)
    }
}