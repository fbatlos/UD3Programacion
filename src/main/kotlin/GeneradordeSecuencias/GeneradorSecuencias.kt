package GeneradordeSecuencias

class GeneradorSecuencias(val consola:IEntradaSalida):IGeneradorSecuencias{

    lateinit var sec:Sequence<String>
    private val fraseCompleta = mutableListOf<String>()

    override fun fraseIncremental(numero:Int) {

         sec = lineSequence(numero)

         sec.forEach {fraseCompleta.add(it)
             consola.mostrar(fraseCompleta.joinToString (" "),true)
         }

    }

    override fun fraseFinal(numero: Int){

        sec = lineSequence(numero)

        sec.forEach {fraseCompleta.add(it)}

        consola.mostrar(fraseCompleta.joinToString (" "),true)
    }

    override fun getSec(numero: Int) {
       fraseIncremental(numero)
        fraseCompleta.clear()
        fraseFinal(numero)
    }

    override fun mostrarSec(numero: Int){
        getSec(numero)
    }
}