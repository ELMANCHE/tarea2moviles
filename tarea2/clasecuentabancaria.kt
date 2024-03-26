/* descripcion del problema: Diseña una clase CuentaBancaria que tenga un saldo y un límite de retiro. Implementa métodos set y get para establecer y obtener el saldo, y añade un método para realizar retiros que tenga en cuenta el límite de retiro. Utilice el set para validar datos
Autor : Elias Manchego
Fecha : 25/03/24
fecha de modificacion: 25/03/24
*/

// primero vamos a crear la clase principal para luego crear todos los demas metodos
// usare double porque como es un problema bancario quiero precision
class Cuentabancaria(var saldo:Double, var limite: Double){


    // proceso para retirar dinero
    // el boolean se usa para saber si el retiro fue exitoso o no
    fun retirar(cantidad:Double): Boolean {
        if ( cantidad > limite){
            println(" estas pidiendo más dinero del que tienes")
            return false
        } else if ( cantidad > saldo){
            println(" No tienes fondos")
            return false
        } else {
            saldo -= cantidad
            println(" Retiro hecho con exito de $cantidad. Tu saldo actual es de: $saldo ")
            return true
        }

    }


    // set y get para el saldo
    fun setsaldo( saldonuevo: Double){
        if (saldonuevo >= 0){
            saldo = saldonuevo
        } else{
            println(" No puedes tener saldo negativo")
        }
    }

     fun getsaldo(): Double{
         return saldo
     }
}
// imprimiremos resultados con la funcion main
fun main(){
     val cuenta = Cuentabancaria(2000.0, 1000.0)

    println(" Saldo inicial: ${cuenta.getsaldo()}")

    cuenta.retirar(150.0)
    cuenta.retirar(200.0)
    cuenta.retirar(500.0)

    cuenta.setsaldo(5000.0)
    print(" Su nuevo saldo es : ${cuenta.getsaldo()}")

}