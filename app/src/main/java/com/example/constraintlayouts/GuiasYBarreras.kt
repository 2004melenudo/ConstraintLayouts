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

@Preview(showBackground = true, widthDp = 411, heightDp = 800)
@Composable
fun EjemploContraintGuide15() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val cajaRoja = createRef()
        val startGuide = createGuidelineFromTop(0.1f)
        Box(Modifier.size(125.dp).background(Color.Red).constrainAs(cajaRoja) {
            top.linkTo(startGuide)
        })
    }
}

@Preview(showBackground = true, widthDp = 411, heightDp = 800)
@Composable
fun EjemploContraintGuide16() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val cajaRoja = createRef()
        val topGuide = createGuidelineFromTop(0.1f)
        val startGuide = createGuidelineFromStart(0.25f)
        Box(Modifier.size(125.dp).background(Color.Red).constrainAs(cajaRoja) {
            top.linkTo(topGuide)
            start.linkTo(startGuide)
        })
    }
}

@Preview(showBackground = true, widthDp = 411, heightDp = 800)
@Composable
fun ConstraintBarrier18() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (cajaRoja, cajaVerde, cajaAmarilla) = createRefs()
        val barrier = createEndBarrier(cajaRoja, cajaVerde)
        Box(Modifier.size(125.dp).background(Color.Green).constrainAs(cajaVerde) {
            start.linkTo(parent.start, margin = 16.dp)
        })
        Box(Modifier.size(235.dp).background(Color.Red).constrainAs(cajaRoja) {
            top.linkTo(cajaVerde.bottom)
            start.linkTo(parent.start, margin = 32.dp)
        })
        Box(Modifier.size(50.dp).background(Color.Yellow).constrainAs(cajaAmarilla) {
            start.linkTo(barrier)
        })
    }
}
