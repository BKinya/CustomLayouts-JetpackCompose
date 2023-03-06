package com.beatrice.customlayouts.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.beatrice.customlayouts.ui.components.TitleComposeLayout

@Composable
fun HomeScreen() {
  TitleComposeLayout(
    modifier = Modifier.padding(16.dp),
    title = {
      Box(modifier = Modifier.background(Color.Cyan).padding(12.dp)) {
        Text(text = "Custom Compose Layout")
      }
    },
    subtitle = {
      Box(modifier = Modifier.background(Color.Magenta).padding(8.dp)) {
        Text(text = "SubCompose Layout")
      }
    },
  )
}


@Preview
@Composable
fun HomeScreenPreview() {
  Surface(color = Color.White) {
    HomeScreen()
  }
}