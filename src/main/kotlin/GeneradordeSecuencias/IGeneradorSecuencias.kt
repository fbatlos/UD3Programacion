

package GeneradordeSecuencias

interface IGeneradorSecuencias{

    fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.constrainOnce().take(limit)

    fun fraseIncremental(numero:Int)

    fun fraseFinal(numero:Int)

    fun getSec(numero: Int)

    fun mostrarSec(numero: Int)


}