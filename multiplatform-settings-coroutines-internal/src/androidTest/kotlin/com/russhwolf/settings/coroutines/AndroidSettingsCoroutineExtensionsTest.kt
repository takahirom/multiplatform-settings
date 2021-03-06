package com.russhwolf.settings.coroutines

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.russhwolf.settings.AndroidSettings
import com.russhwolf.settings.ExperimentalSettingsApi
import com.russhwolf.settings.ObservableSettings
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AndroidSettingsCoroutineExtensionsTest : BaseCoroutineExtensionsTest() {
    @OptIn(ExperimentalSettingsApi::class)
    override val settings: ObservableSettings = AndroidSettings(
        ApplicationProvider.getApplicationContext<Context>()
            .getSharedPreferences("test", Context.MODE_PRIVATE)
    )
}
