package ru.avsematkin.srezapp2.preferences

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager.getDefaultSharedPreferences

class PrefsManager(private val context: Context) {
    private val prefs: SharedPreferences =  getDefaultSharedPreferences(context)

    fun logIn(){
        prefs.edit().putBoolean("logged", true).apply()
    }

    fun logged(): Boolean {
        return prefs.getBoolean("logged", false)
    }

    fun unLog(){
        prefs.edit().putBoolean("logged", false).apply()
    }

}