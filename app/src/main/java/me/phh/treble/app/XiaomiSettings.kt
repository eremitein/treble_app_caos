package me.phh.treble.app

import android.os.Bundle

object XiaomiSettings : Settings {
    val dt2w = "key_xiaomi_double_tap_to_wake"

    override fun enabled() = Tools.vendorFp.toLowerCase().startsWith("xiaomi")
}

class XiaomiSettingsFragment : SettingsFragment() {
    override val preferencesResId = R.xml.pref_xiaomi

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        super.onCreatePreferences(savedInstanceState, rootKey)
        android.util.Log.d("PHH", "Loading xiaomi fragment ${XiaomiSettings.enabled()}")
    }
}
