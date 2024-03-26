/* descripcion del problema: Crea un sistema de gestión de empleados
Autor : Elias Manchego
Fecha : 25/03/24
fecha de modificacion: 25/03/24
*/

// el mismo caso de los anteriores problemas, creamos la clase base
// usare abstract para principalmente decirle al compilador que esta clase no puede ser instancia
// se usara para una estructura jerarquica de clases donde la principal sera empleado seguido de las respectivas subclases
// usare string ya que me servira en nombres y apellidos como almecen
// int en edad por su naturaleza entera ya que no existen persona con edad de 10.5
abstract  class empleado(val nombre: String, val apellido: String, val edad: Int, val salario: Double){
    // abstract para calcular el pago
    abstract fun calculadordepago(): Double

 }

// primera subclase de los empleados de tiempo completo que se hereda de la principal empleado
class empleadotiempocompleto(nombre: String, apellido: String, edad: Int, salario: Double, val horasquetrabajo: Int, val costodehora: Double): empleado(nombre,apellido, edad, salario) {
    //para calcular el pago teneindo en cuenta las horas de trabajo
    // usare override para indicar que esto es una subclase
    // tambien es de ayuda para poder personalizar el comportortamiento de la subclase
    override fun calculadordepago(): Double {
        return horasquetrabajo * costodehora
    }
}

// repetire lo mismo que hice anteriormente pero  multiplicare tambien por dias trabajos
class empleadomediotiempo(nombre: String, apellido: String, edad: Int, salario: Double, val horasquetrabajo: Int, val costodehora: Double, val diasquetrabajo: Int): empleado(nombre, apellido, edad, salario){
    override fun calculadordepago(): Double{
        return horasquetrabajo * costodehora * diasquetrabajo
    }
}

// funcion para probar las clases
fun main(){
    // creare instancias de las subclases
    val Empleadotiempocompleto = empleadotiempocompleto("Martina", "Manchego", 40,4000.5, 40,10.5)
    val Empleadotiempomedio = empleadomediotiempo("Hachico", "Navarro", 60,5000.5, 50,12.5,5)
    // calular y poder ver el pago
    println(" El pago por trabajar el tiempo completo es: ${Empleadotiempocompleto.calculadordepago()}")
    println(" El pago por trabajar medio tiempo es : ${Empleadotiempomedio.calculadordepago()}")
}