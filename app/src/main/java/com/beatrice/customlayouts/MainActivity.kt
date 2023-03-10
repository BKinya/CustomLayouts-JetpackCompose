package com.beatrice.customlayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.beatrice.customlayouts.ui.theme.CustomLayoutsJetpackComposeTheme
import com.beatrice.customlayouts.ui.components.HomeScreen

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      CustomLayoutsJetpackComposeTheme {
        Surface( color = MaterialTheme.colors.background) {
          HomeScreen()
        }
      }
    }
  }
}

