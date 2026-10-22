package com.example.constraintlayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

// 0 abre el menú. Para iniciar directamente: 7, 131, 132, 133 o 22.
private const val PANTALLA_INICIAL = 0

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme(colorScheme = lightColorScheme(background = Color.White,
                surface = Color.White)) {
                Surface(Modifier.fillMaxSize(), color = Color.White) {
                    Box(Modifier.fillMaxSize().safeDrawingPadding()) { Catalogo() }
                }
            }
        }
    }
}

@Composable
private fun Catalogo() {
    var pantalla by rememberSaveable { mutableStateOf(PANTALLA_INICIAL) }
    BackHandler(enabled = pantalla != 0) { pantalla = 0 }
    when (pantalla) {
        5 -> Spacer05()
        6 -> Spacer06()
        7 -> ActividadSpacer07()
        10 -> ConstraintExample10()
        12 -> ConstraintExample12()
        131 -> Practica13Ejercicio1()
        132 -> Practica13Ejercicio2()
        133 -> Practica13Ejercicio3()
        15 -> EjemploContraintGuide15()
        16 -> EjemploContraintGuide16()
        18 -> ConstraintBarrier18()
        20 -> ConstraintChainExample20()
        211 -> CadenaPacked21()
        212 -> CadenaSpreadInside21()
        22 -> ActividadFinal22()
        else -> MenuEjemplos { pantalla = it }
    }
}

@Composable
private fun MenuEjemplos(abrir: (Int) -> Unit) {
    val opciones = listOf(
        7 to "Actividad 1 - separaciones (p. 7)",
        131 to "Práctica 3 - figura 1 / 3 puntos",
        132 to "Práctica 3 - figura 2 / 8 puntos",
        133 to "Práctica 3 - figura 3 / 9 puntos",
        22 to "Actividad final - VIEW 1, 2 y 3",
        5 to "Spacer de 30 dp (p. 5)",
        6 to "Función MySpacer (p. 6)",
        10 to "Cajas sin restricciones (p. 10)",
        12 to "Restricciones básicas (p. 12)",
        15 to "Guía superior del 10 % (p. 15)",
        16 to "Guías del 10 % y 25 % (p. 16)",
        18 to "Barrera al extremo (p. 18)",
        20 to "Cadena horizontal (p. 20)",
        211 to "Cadena Packed (p. 21)",
        212 to "Cadena SpreadInside (p. 21)"
    )
    LazyColumn(Modifier.fillMaxSize().padding(horizontal = 16.dp),
        contentPadding = PaddingValues(vertical = 20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
        item {
            Text("Constraint Layouts", style = MaterialTheme.typography.headlineSmall)
            Text("Elige una pantalla. Usa Atrás del teléfono para volver.",
                modifier = Modifier.padding(vertical = 12.dp))
        }
        items(opciones, key = { it.first }) { (id, nombre) ->
            OutlinedButton(onClick = { abrir(id) }, modifier = Modifier.fillMaxWidth()) {
                Text(nombre)
            }
        }
    }
}
