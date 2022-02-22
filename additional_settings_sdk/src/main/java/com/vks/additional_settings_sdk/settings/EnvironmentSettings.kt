package com.vks.additional_settings_sdk.settings

import android.content.Context
import android.preference.PreferenceManager

object EnvironmentSettings {

    fun getCurrentEnvironment(context: Context): Environments {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
        val env = sharedPreferences.getString("env", "")
        return if (env.equals("staging", true) || env.equals("stag", true)) {
            Environments.STAGING
        } else if (env.equals("development", true) || env.equals("dev", true)) {
            Environments.DEVELOPMENT
        } else
            Environments.PRODUCTION
    }

    enum class Environments {
        STAGING, PRODUCTION, DEVELOPMENT
    }

}