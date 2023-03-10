package com.beatrice.customlayouts.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun HomeScreen() {
  DynamicBarsLayout(
    modifier = Modifier.padding(vertical = 200.dp, horizontal = 48.dp),
    mainContent = {
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .background(Color.Cyan)
          .height(100.dp),
        contentAlignment = Alignment.Center
      ) {

      }
    },
    deferredContent = {
      Box(
        modifier = Modifier
          .background(Color.Magenta),
        contentAlignment = Alignment.Center
      ) {

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