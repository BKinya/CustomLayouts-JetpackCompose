package com.beatrice.customlayouts.ui.components

 androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomColumn(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
  Layout(content = content, modifier = modifier)
  { measurables, constraints ->
    // MEASUREMENT SCOPE
    // Measurement scope
    var initialWidth = constraints.minWidth

    // Determine the size of it's components
    val placeable = measurables.map {
      initialWidth += 84
      it.measure(
        constraints.copy(
          minWidth = if (initialWidth >= constraints.maxWidth) constraints.maxWidth else initialWidth
        )
      )
    }

    layout(constraints.maxWidth, constraints.maxHeight) {
      // PLACEMENT SCOPE
      // Placement step
      // Determine the position of it's components
      var yPosition = 0
      placeable.forEach {
        it.placeRelative(0, yPosition)
        yPosition += it.height + 7
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