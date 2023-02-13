package com.example.paparazzi_bugs

import android.text.Html
import android.widget.TextView
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import app.cash.paparazzi.androidHome
import app.cash.paparazzi.detectEnvironment
import org.junit.Rule
import org.junit.Test

class BugHTMLTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_5,
        theme = "Theme.MaterialComponents.DayNight.NoActionBar",
        environment = detectEnvironment().copy(
            platformDir = "${androidHome()}/platforms/android-32",
            compileSdkVersion = 32
        )
        // ...see docs for more options
    )

    @Test
    fun launchView() {
        val view = TextView(paparazzi.context)
        view.text = Html.fromHtml("<b>Hello</b>", Html.FROM_HTML_MODE_LEGACY)
        paparazzi.snapshot(view)
    }
}
