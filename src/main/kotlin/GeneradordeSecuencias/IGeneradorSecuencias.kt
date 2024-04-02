

package GeneradordeSecuencias

interface IGeneradorSecuencias{

    fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.constrainOnce().take(limit)

    fun fraseIncremental(numero:Int): MutableList<String>

    fun fraseFinal(fraseIncremental: MutableList<String>):String

    fun getSec(numero: Int):String

    fun mostrarSec(secuencia:String)


}