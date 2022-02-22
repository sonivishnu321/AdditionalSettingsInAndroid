package com.vks.additional_settings_sdk.settings

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.vks.additional_settings_sdk.R

class SettingsActivity : AppCompatActivity() {
    @SuppressLint("CommitTransaction")
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        // below line is to change
        // the title of our action bar.

        // below line is used to check if
        // frame layout is empty or not.
        if (findViewById<View>(R.id.idFrameLayout) != null) {
            if (savedInstanceState != null) {
                return
            }
            // below line is to inflate our fragment.
            fragmentManager.beginTransaction().add(R.id.idFrameLayout, SettingsFragment())
                .commit()
        }
    }
}