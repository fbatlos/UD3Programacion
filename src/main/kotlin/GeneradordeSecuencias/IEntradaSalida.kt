package GeneradordeSecuencias

interface IEntradaSalida {
    fun mostrar(mensaje:String,salto:Boolean)

    fun pedirNum(mensaje: String)
}