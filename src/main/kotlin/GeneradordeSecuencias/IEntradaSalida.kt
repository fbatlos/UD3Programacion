package GeneradordeSecuencias

interface IEntradaSalida {
    fun mostrar(mensaje:String,salto:Boolean):String

    fun pedirNum(mensaje: String):Int

}