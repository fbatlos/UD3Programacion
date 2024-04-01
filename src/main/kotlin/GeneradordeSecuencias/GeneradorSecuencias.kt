package GeneradordeSecuencias

class GeneradorSecuencias{
    val consola = Consola()
    lateinit var sec:Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.constrainOnce().take(limit)

    private fun fraseIncremental(){}


}