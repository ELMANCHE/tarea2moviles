
/* descripcion del problema: Cree una clase abstracta “shape” la cual contenga las propiedades área, perímetro y las funciones para calcular estos valores e imprimir el resultado de cada operación. Adicional crea tres subclases cuadrado, círculo y rectángulo que reciban los valores de sus lados, el radio en el caso del círculo con constructores secundarios y heredando la clase “shape” y sus métodos. Crear instancias de las subclases y ejecutar las operaciones de área y perímetro para cada instancia.
Autor : Elias Manchego
Fecha : 25/03/24
fecha de modificacion: 25/03/24
*/

// como nos pide el problema tenemos que crear una clase abstracta shape
// otra vez usare el sbstract como el anterior problema
abstract class Shape{
    //crearemos ahora lo necesario para almacenar el area y perimetro por medio de variables
    var area: Double = 0.0
    var perimetro: Double = 0.0
    // uso double para que sea mas preciso en decimales

    // metodo abstracto para el ares
    abstract fun calculararea()

    // lo mismo para perimetro
    abstract fun calcularperimetro()

    // creare el print para imprimir los resultados
    fun printresultados(){
        println("Area: $area")
        println("perimetro: $perimetro")
    }
}
// ahora creare las subclases cuadrado, rectangulo y circulo. con sus respectivos calculos
class cuadro(val lado:Double): Shape(){
    override fun calculararea(){
        area = lado * lado
    }
    // hallando perimetro
    override fun calcularperimetro() {
        perimetro = 4 *lado
    }
}

class circulo(val radio: Double): Shape(){
    override fun calculararea() {
        // usare el math.pi para una mejor precicion de los calculos
        area = Math.PI * radio * radio
    }

    override fun calcularperimetro() {
        perimetro = 2 * Math.PI * radio
    }
}

class rectangulo(val longitud: Double, val ancho: Double): Shape(){
    override fun calculararea() {
        // usare el math.pi para una mejor precicion de los calculos
        area = longitud * ancho
    }

    override fun calcularperimetro() {
        perimetro = 2 * (longitud + ancho)
    }
}
// vamos a probar todo lo creado con la funcion main
fun main(){
    // creare todas las instancias de las subclases para poder ejecutar las operaciones
    val Cuadrado = cuadro(6.0)
    Cuadrado.calculararea()
    Cuadrado.calcularperimetro()
    println(" El cuadrado es:")
    Cuadrado.printresultados()

    val Circulo = circulo(4.0)
    Circulo.calculararea()
    Circulo.calcularperimetro()
    println("\nEl circulo es: ")
    Circulo.printresultados()

    val Rectangulo = rectangulo(4.0, 6.0)
    Rectangulo.calculararea()
    Rectangulo.calcularperimetro()
    println("\nEl rectangulo es: ")
    Rectangulo.printresultados()
}
