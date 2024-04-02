package GeneradordeSecuencias

class GeneradorSecuencias{
    val consola = Consola()
    lateinit var sec:Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.constrainOnce().take(limit)

     private fun fraseIncremental(numero:Int): MutableList<String> {
         val fraseCompleta = mutableListOf<String>()
         sec = lineSequence(numero)
         sec.forEach {fraseCompleta.add(consola.mostrar(it,true)) }
         return fraseCompleta
    }

    private fun fraseFinal(fraseIncremental: MutableList<String>):String{
        return fraseIncremental.joinToString (" ")
    }

    fun getSec(numero: Int):String {
        return fraseFinal(fraseIncremental(numero))
    }

    fun mostrarSec(secuencia:String){
        consola.mostrar(secuencia,true)
    }
}


/**
 *  private fun fraseIncremental(numero:Int): Sequence<String> {
 *          sec = lineSequence(numero)
 *          sec.forEach {consola.mostrar(it,true) }
 *          return sec
 *     }
 *
 *     private fun fraseFinal(fraseIncremental: Sequence<String>):String{
 *         val fraseCompleta = mutableListOf<String>()
 *         fraseIncremental.map { println(it) }
 *         return fraseCompleta.joinToString (" ")
 *     }
 *
 *     fun getSec(numero: Int):String {
 *         return fraseFinal(fraseIncremental(numero))
 *     }
 *
 *     fun mostrarSec(secuencia:String){
 *         println(secuencia)
 *     }
 */