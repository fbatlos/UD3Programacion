package GeneradordeSecuencias

class Menu(val consola: Consola,val generadorSecuencias: GeneradorSecuencias):IMenu {
    override fun mostarMenu() {
            consola.mostrar("-- Menu --",true)
            consola.mostrar("(1.) Frase Incrementa . ",true)
            consola.mostrar("(2.) Frase Final .",true)
            consola.mostrar("(0.) Fin.",true)
    }

    override fun opcionesMenu() {
        do {
            val num = consola.pedirNum("-> ")
            when (num){
                1 -> {generadorSecuencias.fraseIncremental(consola.pedirNum("De cuantas palabras es tu frase ? -> "))}
                2 -> {generadorSecuencias.fraseFinal(consola.pedirNum("De cuantas palabras es tu frase ? -> "))}
            }
            mostarMenu()
        }while (num in 1..2)
    }

}