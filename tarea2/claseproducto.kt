
/* descripcion del problema: Diseña una clase Producto que tenga un precio
y un descuento aplicable. Implementa métodos set y get para
establecer y obtener el precio y el descuento, y añade un método
para calcular el precio final después de aplicar el descuento.
Utilice el set para validar datos.
Autor : Elias Manchego
Fecha : 25/03/24
fecha de modificacion: 25/03/24
*/

// como en el anterior problema de declara la clase con sus respectivas propiedad pedidad por el problema como precio y descuento
// otra vez se usara double para mas precision
class  Producto(var precio: Double , var descuento: Double){

    // creare un metodo para calcular el precio final luego del desuento
    fun preciofinal(): Double{
        // precio final - el precio original
        return precio * (1-descuento)
    }

    // ahora los metodos set y get para el precio
    fun setprecio(precionuevo: Double){
        if(precionuevo >= 0){
            // vemos si el precio es negativo para que todo este ok
            precio = precionuevo
        } else {
            println(" El precio no puede ser negativo")
        }
    }

    // luego de esto con get devolveremos el precio actual
    fun getprecio(): Double{
        return precio
    }

    // ahora volvere a aplicar el metodo get y set para aplicar descuento
    fun setdescuento( descuentonuevo: Double){
        // con el O.O estamos definiendo el rango del valor minimo que se debe tomar
        if ( descuentonuevo in 0.0..1.0){
            descuento = descuentonuevo
        } else{
            println(" mala! El descuento debe estar entre el rango de  0 y 1  ")
        }
    }

    // de nuevo usaremos get para el descuento actual
    fun getdescuento(): Double{
        return descuento
    }
}
// usare de nuevo main para imprimir todo
fun main() {

    val producto = Producto(300.0, 0.3)

    println(" El precio inicial es: ${producto.getdescuento()}")
    println(" El descuento es : ${producto.getdescuento()}")
    println("El precio final es: ${producto.preciofinal()}")
   // se altualiza el precio y descuento
    producto.setprecio(120.0)
    producto.setdescuento(0.15)

    println(" El nuevo precio es: ${producto.getprecio()}")
    println(" El nuevo descuento es: ${producto.getdescuento()}")
    println(" El precio final a pagar es: ${producto.preciofinal()}")

}




