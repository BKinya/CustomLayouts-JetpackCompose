//package com.beatrice.customlayouts.ui.components
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.material.Surface
//import androidx.compose.material.TopAppBar
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.geometry.Offset
//import androidx.compose.ui.geometry.Rect
//import androidx.compose.ui.geometry.Size
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.Outline
//import androidx.compose.ui.graphics.Shape
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.layout.Layout
//import androidx.compose.ui.layout.SubcomposeLayout
//import androidx.compose.ui.layout.layout
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.Density
//import androidx.compose.ui.unit.LayoutDirection
//import com.beatrice.customlayouts.R
//
//// TODO: use layout modifier.. Figure out later
//@Composable
//fun TopBanner() {
//
//  TopAppBar(backgroundColor = Color.White) {
////    Text(
////      text = "The Droids",
////      style = TextStyle(
////        fontFamily = FontFamily.Monospace,
////        fontSize = 20.sp,
////        fontWeight = FontWeight.SemiBold,
////        textAlign = TextAlign.Center
////      ),
////    )
//    Image(
//      painter = painterResource(id = R.drawable.droid),
//      contentDescription = "Android Logo",
//      contentScale = ContentScale.Fit,
//      modifier = Modifier
//        .background(color = Color.Cyan)
//
////        .graphicsLayer {
////        rotationZ = 180f
////      }
////        .clip(HalfSizeShape)
////        .takeEighthWidthAndPlaceTopRight()
//
//    )
//  }
//}
//
//object HalfSizeShape : Shape {
//  override fun createOutline(
//    size: Size,
//    layoutDirection: LayoutDirection,
//    density: Density
//  ): Outline {
//    return Outline.Rectangle(
//      Rect(offset = Offset(size.width / 2, 0f), size = Size(size.width / 2, size.height))
//    )
//  }
//
//}
//
//fun Modifier.takeEighthWidthAndPlaceTopRight() =
//  layout { measurable, constraints ->
//    val maxAllowedWidth = constraints.maxWidth
//    val desiredWidth = maxAllowedWidth / 4
//    val desiredHeight = desiredWidth
//    val placeable = measurable.measure(
//      constraints = constraints.copy(minWidth = desiredWidth)
//    )
//
//    layout(placeable.width, placeable.height) {
//      placeable.place(
//        0, 0
//      )
//    }
//  }
//
//
//@Preview
//@Composable
//fun TopBannerPreview() {
//  Surface(color = Color.White) {
//    TopBanner()
//  }
//}