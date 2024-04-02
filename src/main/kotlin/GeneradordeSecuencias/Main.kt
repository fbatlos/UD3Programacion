package GeneradordeSecuencias

fun main(){
    val GeneradorSecuencias = GeneradorSecuencias()
    val consola = Consola()
    val num = consola.pedirNum("Dime el numero de palabras que tendrá la frase : ")
    GeneradorSecuencias.mostrarSec(GeneradorSecuencias.getSec(num))
}