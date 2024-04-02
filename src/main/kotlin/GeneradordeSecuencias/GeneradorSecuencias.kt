package GeneradordeSecuencias

class GeneradorSecuencias{
    val consola = Consola()
    lateinit var sec:Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.constrainOnce().take(limit)

     private fun fraseIncremental(numero:Int){
         var fraseCompleta = mutableListOf<String>()
         sec = lineSequence(numero)
         sec.forEach {consola.mostrar(it,true) }
    }

    private fun fraseFinal():String{

        sec.forEach {  }
        return fraseCompleta.joinToString (" ")
    }

    fun getSec(numero: Int):String {
        fraseIncremental(numero)
        return fraseFinal()
    }

    fun mostrarSec(secuencia:String){
        println(secuencia)
    }
}