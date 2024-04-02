package GeneradordeSecuencias

fun main(){
    val consola = Consola()

    val GeneradorSecuencias = GeneradorSecuencias(consola)

    val num = consola.pedirNum("Dime el numero de palabras que tendrá la frase : ")

    GeneradorSecuencias.mostrarSec(num)
}