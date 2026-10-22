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

// Página 6: función visible en la diapositiva.
@Composable
fun MySpacer(size: Int) {
    Spacer(modifier = Modifier.height(size.dp))
}

// El resto del layout se reconstruye a partir de las figuras.
@Composable
private fun LayoutConSeparaciones(pagina: Int) {
    Column(Modifier.fillMaxSize()) {
        Box(Modifier.fillMaxWidth().weight(1f).background(Color.Cyan),
            contentAlignment = Alignment.Center) { Text("Ejemplo 1") }
        if (pagina == 5) Spacer(Modifier.height(30.dp)) else MySpacer(30)
        Row(Modifier.fillMaxWidth().weight(1f)) {
            Box(Modifier.weight(1f).fillMaxHeight().background(Color.Yellow),
                contentAlignment = Alignment.Center) { Text("Ejemplo 2") }
            if (pagina == 7) Spacer(Modifier.width(20.dp))
            Box(Modifier.weight(1f).fillMaxHeight().background(Color.Green),
                contentAlignment = Alignment.Center) { Text("Ejemplo 3") }
        }
        if (pagina != 5) MySpacer(50)
        Box(Modifier.fillMaxWidth().weight(1f).background(Color.Magenta),
            contentAlignment = Alignment.BottomCenter) { Text("Ejemplo 4") }
    }
}
@Preview(showBackground = true, widthDp = 411, heightDp = 800)
@Composable
fun Spacer05() { LayoutConSeparaciones(5) }

@Preview(showBackground = true, widthDp = 411, heightDp = 800)
@Composable
fun Spacer06() { LayoutConSeparaciones(6) }

@Preview(showBackground = true, widthDp = 411, heightDp = 800)
@Composable
fun ActividadSpacer07() { LayoutConSeparaciones(7) }
