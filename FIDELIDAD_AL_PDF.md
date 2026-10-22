# Relación con DiapositivasConstraintLayout.pdf

Se revisaron las 24 páginas del documento. El proyecto incluye los ejemplos prácticos y las actividades de sus páginas 5 a 22. Las páginas introductorias, explicativas y de cierre no requieren pantallas adicionales.

## Código visible y adaptación a un proyecto completo

- Página 5: se conserva Spacer con height(30.dp). El resto del diseño se reconstruye desde la imagen.
- Página 6: se conserva la función MySpacer(size: Int), que crea un Spacer con altura size.dp, y la llamada de 30 dp. La separación inferior se aproxima con 50 dp porque no aparece su medida en el fragmento.
- Página 7: actividad visual reconstruida; la separación horizontal se estima en 20 dp. No hay un listado completo que pueda copiarse literalmente.
- Página 10: cinco cajas de 125 dp, en orden rojo, azul, magenta, amarillo y verde; sin restricciones se superponen. Esto se conserva como ejemplo didáctico.
- Página 11: catálogo TOML con constraintVersion = "1.1.0", alias constraint-layout y dependencia implementation(libs.constraint.layout). Las versiones de AGP, Kotlin y Gradle se fijan como conjunto compatible con este proyecto.
- Página 12: se conservan las referencias y restricciones visibles, incluido el intercambio de nombres entre boxBlue y boxMagenta. Se completan las llaves necesarias para compilar.
- Página 13: las tres figuras son soluciones nuevas de las imágenes, porque la diapositiva no muestra su código. Las cajas grandes miden 125 dp, siguiendo el ejemplo anterior; los tres pasos de la figura 3 miden 125/3 dp.
- Páginas 15 y 16: se conservan las guías de 10 % desde arriba y 25 % desde el inicio, y la caja roja de 125 dp.
- Página 18: se conservan las cajas verde de 125 dp, roja de 235 dp y amarilla de 50 dp; los márgenes de 16 y 32 dp; y createEndBarrier.
- Página 20: se conservan las tres cajas de 75 dp y los enlaces horizontales recíprocos visibles.
- Página 21: los fragmentos Packed y SpreadInside se integran en dos pantallas independientes con las mismas tres cajas.
- Página 22: reconstrucción de los tres botones de la figura mediante una cadena vertical Packed. Se aproximan dimensiones (96 x 48 dp), separaciones (8 dp), tipografía, color y sombra. Los onClick están vacíos porque no se pide comportamiento.

## Cambios de integración

Se añadieron imports, paquete, Activity de inicio, tema Material 3, manifiesto, configuración de compilación, previews y un menú de selección. Los nombres de algunos ejemplos llevan el número de página para evitar funciones duplicadas. Estas partes no se presentan como código literal del PDF.

Las actividades mantienen colores y distribución de las figuras. No se promete igualdad píxel a píxel: las capturas del PDF y tu dispositivo pueden tener distintas densidades, tamaños, tipografías y barras de sistema. La zona de contenido evita las barras de sistema.

## Lectura de las restricciones

- createRefs / createRef asignan identificadores a los elementos.
- constrainAs asocia un elemento a una referencia y define sus relaciones.
- top, bottom, start y end representan los bordes del componente.
- linkTo une un borde con otro; margin agrega separación.
- centerTo(parent) centra el elemento en su contenedor.
- Las guidelines son líneas de referencia invisibles.
- Una barrera sigue el extremo de los componentes que referencia.
- Packed agrupa una cadena; SpreadInside mantiene los extremos y distribuye el espacio entre sus elementos.

## Referencias

- Material de clase: DiapositivasConstraintLayout.pdf, proporcionado por la estudiante.
- Documentación de ConstraintLayout en Compose: https://developer.android.com/develop/ui/compose/layouts/constraintlayout
- Versiones de la biblioteca: https://developer.android.com/jetpack/androidx/releases/constraintlayout
