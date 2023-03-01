//package com.beatrice.customlayouts.ui.components
//
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.layout.SubcomposeLayout
//import androidx.compose.ui.unit.Constraints
//
//@Composable
//fun MySubComposeLayout(content: @Composable () -> Unit){
//  SubcomposeLayout(){constraints ->
//  val placeable =   subcompose(null, content).map {
//      it.measure(Constraints())
//    }
//
//    layout(constraints.maxWidth, constraints.maxHeight){
//      var yPosition = 0
//      placeable.forEach {
//        it.placeRelative(0, yPosition)
//        yPosition += it.height + 7
//      }
//    }
//  }
//}