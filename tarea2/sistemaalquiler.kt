
/* descripcion del problema: Diseña un sistema de alquiler de vehículos que incluya interfaces como VehiculoAlquilable con métodos para alquilar y devolver un vehículo, y clases concretas como Coche y Moto que implementen esta interfaz.
Autor : Elias Manchego
Fecha : 26/03/24
fecha de modificacion: 26/03/24
*/
// como nos pide el problema implementare la interface vehiculo
// con las funciones alquilar y devolver
interface vehiculoalquilable{
    fun alquilar()
    fun devolver()
}
// para poder crear la clase coche implementaremos la que creamos anteriormente
class coche : vehiculoalquilable{
    override fun alquilar() {
        println(" Ya esta alquilado")
    }

    override fun devolver() {
        println(" Ya fue devuelto")
    }
}
// como lo hice anteriormente implemnetamos la clase moto agreganto lo que creamos al inicio
// se repeitira el mismo proceso
class moto: vehiculoalquilable{
    override fun alquilar() {
        println(" La moto ya fue alquilada")
    }

    override fun devolver() {
        println("La moto ya fue devuelta")
    }
}

// haremos la prueba con la funcion main finalmente
fun main(){
    val Coche = coche()
    val Moto = moto()

    // ahora alquilaremos y devolveremos tanto la moto como el coche
    Coche.alquilar()
    Coche.devolver()
    //
    Moto.alquilar()
    Moto.devolver()
}