package GeneradordeSecuencias

class Consola:IEntradaSalida {
    override fun mostrar(mensaje: String, salto: Boolean): String {
        if (salto){
            println(mensaje)
            return mensaje
        }else{
            print(mensaje)
            return mensaje
        }
    }

    override fun pedirNum(mensaje: String): Int {
        var numero:Int?
        while (true){
            mostrar(mensaje,false)
             numero = readln().toIntOrNull()
            if (numero != null){
                return numero
            }else{
                println("No es un numero . ")
            }
        }
    }
}


//Hacer menu de tal forma que sea abstata de consola y generador decuencia
//El generador de secuencia