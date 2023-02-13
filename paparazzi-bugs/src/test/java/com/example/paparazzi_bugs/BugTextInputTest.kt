package com.example.paparazzi_bugs

import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_5
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class BugTextInputTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = PIXEL_5,
        theme = "Theme.MaterialComponents.DayNight.NoActionBar"
        // ...see docs for more options
    )

    @Test
    fun launchView() {
        val view = BugTextInput(paparazzi.context)
        paparazzi.snapshot(view)
    }
}
