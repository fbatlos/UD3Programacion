package GeneradordeSecuencias

class GeneradorSecuencias(val consola:IEntradaSalida):IGeneradorSecuencias{

    lateinit var sec:Sequence<String>

    override fun lineSequence(limit: Int) = generateSequence { readLine() }.constrainOnce().take(limit)

    override fun fraseIncremental(numero:Int): MutableList<String> {
         val fraseCompleta = mutableListOf<String>()

         sec = lineSequence(numero)

         sec.forEach {fraseCompleta.add(consola.mostrar(it,true)) }

         return fraseCompleta
    }

    override fun fraseFinal(fraseIncremental: MutableList<String>):String{
        return fraseIncremental.joinToString (" ")
    }

    override fun getSec(numero: Int):String {
        return fraseFinal(fraseIncremental(numero))
    }

    override fun mostrarSec(secuencia:String){
        consola.mostrar(secuencia,true)
    }
}