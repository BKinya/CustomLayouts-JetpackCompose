package com.beatrice.customlayouts.ui.components

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomColumn(modifier: Modifier, content: @Composable () -> Unit) {
  Layout(
    modifier = modifier,
    content = content
  ) { measurables, constraints ->
    var initialWidth = constraints.minWidth
    var hasMaxedout = false

    val placeables = measurables.map { measurable ->
      // Measure each children
      initialWidth += 96
      if (initialWidth >= constraints.maxWidth){
        hasMaxedout = true
      }
      while(hasMaxedout){
        initialWidth -= 96
        if (initialWidth <= constraints.minWidth){
          hasMaxedout = false
        }
      }
      measurable.measure(constraints.copy(minWidth = initialWidth))
    }

    // Set the size of the layout as big as it can
    layout(constraints.maxWidth, constraints.maxHeight) {
      var yPosition = 0

      // Place children in the parent layout
      placeables.forEach { placeable ->
        placeable.placeRelative(x = 0, y = yPosition)

        // Record the y co-ord placed up to
        yPosition += placeable.height+17
      }
    }
  }

}

@Composable
@Preview
fun CustomComposablePreview() {
  Surface(color = Color.White) {

  }
}