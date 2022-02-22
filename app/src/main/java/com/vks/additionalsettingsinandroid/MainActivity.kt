package com.vks.additionalsettingsinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.vks.additional_settings_sdk.settings.EnvironmentSettings

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btnEnvironment).setOnClickListener {
            getCurrentEnvironment()
        }
    }

    private fun getCurrentEnvironment() {
        val env = EnvironmentSettings.getCurrentEnvironment(this)
        Toast.makeText(this, env.toString(), Toast.LENGTH_LONG).show()
    }
}