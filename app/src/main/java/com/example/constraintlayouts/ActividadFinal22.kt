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

import androidx.compose.ui.graphics.RectangleShape

// Página 22: no hay código. Reconstrucción con cadena vertical Packed.
// Los botones solo ilustran disposición: el PDF no solicita ninguna acción.
@Preview(showBackground = true, widthDp = 411, heightDp = 800)
@Composable
fun ActividadFinal22() {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (view1, view2, view3) = createRefs()
        createVerticalChain(view1, view2, view3, chainStyle = ChainStyle.Packed)
        Button(onClick = {}, shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color.White,
                contentColor = Color(0xFF29234C)),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp),
            modifier = Modifier.width(96.dp).height(48.dp).constrainAs(view1) {
                centerHorizontallyTo(parent)
                bottom.linkTo(view2.top, margin = 8.dp)
            }) { Text("VIEW 1") }
        Button(onClick = {}, shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color.White,
                contentColor = Color(0xFF29234C)),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp),
            modifier = Modifier.width(96.dp).height(48.dp).constrainAs(view2) {
                centerHorizontallyTo(parent)
                bottom.linkTo(view3.top, margin = 8.dp)
            }) { Text("VIEW 2") }
        Button(onClick = {}, shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color.White,
                contentColor = Color(0xFF29234C)),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp),
            modifier = Modifier.width(96.dp).height(48.dp).constrainAs(view3) {
                centerHorizontallyTo(parent)
            }) { Text("VIEW 3") }
    }
}
