package com.beatrice.customlayouts.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.beatrice.customlayouts.ui.components.CustomColumn

@Composable
fun HomeScreen() {
  CustomColumn(modifier = Modifier.padding(8.dp)) {
    Text(text = "Beatrice")
    Text(text = "Kinya")
    Box(modifier = Modifier
      .width(42.dp)
      .height(10.dp)
      .background(color = Color.Cyan))
//    Box(modifier = Modifier
//      .width(42.dp)
//      .height(20.dp)
//      .background(Color.DarkGray))
//    Box(modifier = Modifier
//      .width(42.dp)
//      .height(20.dp)
//      .background(Color.Magenta))
//    Box(modifier = Modifier
//      .width(42.dp)
//      .height(20.dp)
//      .background(color = Color.Cyan))
//    Box(modifier = Modifier
//      .width(42.dp)
//      .height(20.dp)
//      .background(Color.DarkGray))
//    Box(modifier = Modifier
//      .width(42.dp)
//      .height(20.dp)
//      .background(Color.Magenta))
//    Box(modifier = Modifier
//      .width(42.dp)
//      .height(20.dp)
//      .background(color = Color.Cyan))
//    Box(modifier = Modifier
//      .width(42.dp)
//      .height(20.dp)
//      .background(Color.DarkGray))
//    Box(modifier = Modifier
//      .width(42.dp)
//      .height(20.dp)
//      .background(Color.Magenta))
//    Box(modifier = Modifier
//      .width(42.dp)
//      .height(20.dp)
//      .background(color = Color.Cyan))
//    Box(modifier = Modifier
//      .width(42.dp)
//      .height(20.dp)
//      .background(Color.DarkGray))
//    Box(modifier = Modifier
//      .width(42.dp)
//      .height(20.dp)
//      .background(Color.Magenta))
//    Box(modifier = Modifier
//      .width(42.dp)
//      .height(20.dp)
//      .background(color = Color.Cyan))
//    Box(modifier = Modifier
//      .width(42.dp)
//      .height(20.dp)
//      .background(Color.DarkGray))
//    Box(modifier = Modifier
//      .width(42.dp)
//      .height(20.dp)
//      .background(Color.Magenta))
  }
}

@Preview
@Composable
fun HomeScreenPreview() {
  Surface(color = Color.White) {
    HomeScreen()
  }
}