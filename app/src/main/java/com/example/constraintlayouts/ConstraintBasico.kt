package com.example.constraintlayouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.*

// Página 10: sin restricciones, las cinco cajas se superponen.
@Preview(showBackground = true, widthDp = 411, heightDp = 800)
@Composable
fun ConstraintExample10() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        Box(Modifier.size(125.dp).background(Color.Red))
        Box(Modifier.size(125.dp).background(Color.Blue))
        Box(Modifier.size(125.dp).background(Color.Magenta))
        Box(Modifier.size(125.dp).background(Color.Yellow))
        Box(Modifier.size(125.dp).background(Color.Green))
    }
}

// Página 12: se conservan los nombres intercambiados boxBlue/boxMagenta.
@Preview(showBackground = true, widthDp = 411, heightDp = 800)
@Composable
fun ConstraintExample12() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxMagenta, boxYellow, boxGreen) = createRefs()
        Box(Modifier.size(125.dp).background(Color.Red).constrainAs(boxRed) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
        })
        Box(Modifier.size(125.dp).background(Color.Blue).constrainAs(boxMagenta) {
            bottom.linkTo(boxRed.top)
            end.linkTo(boxRed.start)
        })
        Box(Modifier.size(125.dp).background(Color.Magenta).constrainAs(boxBlue) {
            bottom.linkTo(boxRed.top)
            start.linkTo(boxRed.end)
        })
    }
}
