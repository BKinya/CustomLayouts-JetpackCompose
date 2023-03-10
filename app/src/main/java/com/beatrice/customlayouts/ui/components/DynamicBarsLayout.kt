package com.beatrice.customlayouts.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.unit.IntSize

@Composable
fun DynamicBarsLayout(
  modifier: Modifier = Modifier,
  mainContent: @Composable () -> Unit,
  deferredContent: @Composable () -> Unit
) {
  SubcomposeLayout(modifier = modifier) { constraints ->
    // 1. Measure width and height of the main composable
    val mainPlaceable = subcompose(SlotsEnum.MAIN, mainContent).map { measurable ->
      measurable.measure(constraints)
    }.first()

    // 2. Obtain size of the mainPlaceable
    val mainSize = IntSize(mainPlaceable.width, mainPlaceable.height)

    // 3. Rewrite the subtitle composable to have half the width of
    // dependent composable
    val deferredPlaceable = subcompose(SlotsEnum.DEPENDANT, deferredContent).map {
      it.measure(constraints.copy(minWidth = (mainSize.width / 2), minHeight = mainSize.height))
    }.first()

    layout(constraints.maxWidth, constraints.maxHeight) {
      // 4. Place children in main layout
      mainPlaceable.place(0, 0)
      val childX = mainSize.width / 2 - deferredPlaceable.width / 2
      val childY = mainSize.height + 8
      deferredPlaceable.place(childX, childY)
    }
  }
}

enum class SlotsEnum() {
  MAIN,
  DEPENDANT
}