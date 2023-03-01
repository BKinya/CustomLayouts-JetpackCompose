package com.beatrice.customlayouts.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.beatrice.customlayouts.ui.components.CustomColumn

@Composable
fun HomeScreen() {

  CustomColumn(modifier = Modifier.padding(16.dp)) {
    for (a in 0..10) {
      Box(
        modifier = Modifier
          .width(42.dp)
          .height(25.dp)
          .background(color = Color.Cyan)
      )
    }
  }
}



@Preview
@Composable
fun HomeScreenPreview() {
  Surface(color = Color.White) {
    HomeScreen()
  }
}