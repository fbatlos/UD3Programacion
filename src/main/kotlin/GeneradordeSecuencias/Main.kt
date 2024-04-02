package GeneradordeSecuencias

fun main(){
    val consola = Consola()

    val generadorSecuencias = GeneradorSecuencias(consola)

    val menu = Menu(consola, generadorSecuencias )

    menu.mostarMenu()
    menu.opcionesMenu()
}