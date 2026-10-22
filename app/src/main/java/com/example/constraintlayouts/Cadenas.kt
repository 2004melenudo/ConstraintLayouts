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

// Página 20: enlaces horizontales recíprocos.
@Preview(showBackground = true, widthDp = 411, heightDp = 800)
@Composable
fun ConstraintChainExample20() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (cajaAmarilla, cajaRoja, cajaVerde) = createRefs()
        Box(Modifier.size(75.dp).background(Color.Green).constrainAs(cajaVerde) {
            start.linkTo(parent.start)
            end.linkTo(cajaRoja.start)
        })
        Box(Modifier.size(75.dp).background(Color.Red).constrainAs(cajaRoja) {
            start.linkTo(cajaVerde.end)
            end.linkTo(cajaAmarilla.start)
        })
        Box(Modifier.size(75.dp).background(Color.Yellow).constrainAs(cajaAmarilla) {
            start.linkTo(cajaRoja.end)
            end.linkTo(parent.end)
        })
    }
}

// Página 21: se aplican los dos fragmentos a las mismas tres cajas.
@Composable
private fun CadenaConEstilo(style: ChainStyle) {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (cajaVerde, cajaRoja, cajaAmarilla) = createRefs()
        createHorizontalChain(cajaVerde, cajaRoja, cajaAmarilla, chainStyle = style)
        Box(Modifier.size(75.dp).background(Color.Green).constrainAs(cajaVerde) {
            top.linkTo(parent.top)
        })
        Box(Modifier.size(75.dp).background(Color.Red).constrainAs(cajaRoja) {
            top.linkTo(parent.top)
        })
        Box(Modifier.size(75.dp).background(Color.Yellow).constrainAs(cajaAmarilla) {
            top.linkTo(parent.top)
        })
    }
}

@Preview(showBackground = true, widthDp = 411, heightDp = 800)
@Composable
fun CadenaPacked21() { CadenaConEstilo(ChainStyle.Packed) }

@Preview(showBackground = true, widthDp = 411, heightDp = 800)
@Composable
fun CadenaSpreadInside21() { CadenaConEstilo(ChainStyle.SpreadInside) }
