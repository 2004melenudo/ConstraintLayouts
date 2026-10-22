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
fun Practica13Ejercicio1() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val rojo = createRef()
        val azul = createRef()
        val magenta = createRef()
        val amarillo = createRef()
        val verde = createRef()
        Box(Modifier.size(125.dp).background(Color.Red).constrainAs(rojo) {
            centerTo(parent)
        })
        Box(Modifier.size(125.dp).background(Color.Blue).constrainAs(azul) {
            bottom.linkTo(rojo.top)
            end.linkTo(rojo.start)
        })
        Box(Modifier.size(125.dp).background(Color.Magenta).constrainAs(magenta) {
            bottom.linkTo(rojo.top)
            start.linkTo(rojo.end)
        })
        Box(Modifier.size(125.dp).background(Color.Yellow).constrainAs(amarillo) {
            top.linkTo(rojo.bottom)
            end.linkTo(rojo.start)
        })
        Box(Modifier.size(125.dp).background(Color.Green).constrainAs(verde) {
            top.linkTo(rojo.bottom)
            start.linkTo(rojo.end)
        })
    }
}

@Preview(showBackground = true, widthDp = 411, heightDp = 800)
@Composable
fun Practica13Ejercicio2() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val rojo = createRef()
        val azul = createRef()
        val magenta = createRef()
        val amarillo = createRef()
        val verde = createRef()
        val cyan = createRef()
        val negro = createRef()
        Box(Modifier.size(125.dp).background(Color.Red).constrainAs(rojo) {
            centerTo(parent)
        })
        Box(Modifier.size(125.dp).background(Color.Blue).constrainAs(azul) {
            bottom.linkTo(rojo.top)
            end.linkTo(rojo.start)
        })
        Box(Modifier.size(125.dp).background(Color.Yellow).constrainAs(amarillo) {
            bottom.linkTo(rojo.top)
            start.linkTo(rojo.end)
        })
        Box(Modifier.size(125.dp).background(Color.Green).constrainAs(verde) {
            bottom.linkTo(azul.top)
            start.linkTo(rojo.start)
        })
        Box(Modifier.size(125.dp).background(Color.Magenta).constrainAs(magenta) {
            top.linkTo(rojo.bottom)
            end.linkTo(rojo.start)
        })
        Box(Modifier.size(125.dp).background(Color.Cyan).constrainAs(cyan) {
            top.linkTo(rojo.bottom)
            start.linkTo(rojo.end)
        })
        Box(Modifier.size(125.dp).background(Color.Black).constrainAs(negro) {
            top.linkTo(magenta.bottom)
            start.linkTo(rojo.start)
        })
    }
}

@Preview(showBackground = true, widthDp = 411, heightDp = 800)
@Composable
fun Practica13Ejercicio3() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val rojo = createRef()
        val azul = createRef()
        val magenta = createRef()
        val amarillo = createRef()
        val verde = createRef()
        val cyan = createRef()
        val negro = createRef()
        val paso1 = createRef()
        val paso2 = createRef()
        val paso3 = createRef()
        Box(Modifier.size(125.dp).background(Color.Red).constrainAs(rojo) {
            centerTo(parent)
        })
        Box(Modifier.size(125.dp).background(Color.Blue).constrainAs(azul) {
            bottom.linkTo(rojo.top)
            end.linkTo(rojo.start)
        })
        Box(Modifier.size(125.dp).background(Color.Magenta).constrainAs(magenta) {
            bottom.linkTo(rojo.top)
            start.linkTo(rojo.end)
        })
        Box(Modifier.size(125.dp).background(Color.Yellow).constrainAs(amarillo) {
            top.linkTo(rojo.bottom)
            end.linkTo(rojo.start)
        })
        Box(Modifier.size(125.dp).background(Color.Green).constrainAs(verde) {
            top.linkTo(rojo.bottom)
            start.linkTo(rojo.end)
        })
        Box(Modifier.size((125f / 3f).dp).background(Color.Cyan).constrainAs(paso1) {
            bottom.linkTo(rojo.top)
            start.linkTo(rojo.start)
        })
        Box(Modifier.size((125f / 3f).dp).background(Color.Black).constrainAs(paso2) {
            bottom.linkTo(paso1.top)
            start.linkTo(paso1.end)
        })
        Box(Modifier.size((125f / 3f).dp).background(Color.Black).constrainAs(paso3) {
            bottom.linkTo(paso2.top)
            start.linkTo(paso2.end)
        })
    }
}
