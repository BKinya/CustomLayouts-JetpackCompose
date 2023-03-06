package com.beatrice.customlayouts.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.IntSize

@Composable
fun TitleComposeLayout(
  modifier: Modifier = Modifier,
  title: @Composable () -> Unit,
  subtitle: @Composable () -> Unit
) {
  SubcomposeLayout(modifier = modifier) { contraints ->
    // Measure width and height of the title composable
    val titlePlaceable = subcompose(SlotsEnum.TITLE, title).map { measurable ->
      measurable.measure(contraints)
    }.first()
    val titleSize = IntSize(titlePlaceable.width, titlePlaceable.height)

    // Rewrite the subtitle composable to have half the width of title composable
    val subTitlePlaceable = subcompose(SlotsEnum.SUBTITLE, subtitle).map {
      it.measure(Constraints(minWidth = (titleSize.width/2)))
    }.first()
    
    layout(contraints.maxWidth, contraints.maxHeight){
      titlePlaceable.place(0, 0)
      val childX = titleSize.width/ 2  -  subTitlePlaceable.width/2
      val childY = titleSize.height + 8
      subTitlePlaceable.place(childX, childY)
    }
  }
}

enum class SlotsEnum() {
  TITLE,
  SUBTITLE
}