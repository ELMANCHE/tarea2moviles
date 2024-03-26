/* descripcion del problema: Diseña un sistema de gestión de biblioteca
Autor : Elias Manchego
Fecha : 25/03/24
fecha de modificacion: 25/03/24
*/

// se aplicara lo mismo que se aplico en los anteriores problemas como el string y todo ello
// primero la principal
abstract class material(val titulo: String, val autor: String, val anodepunlicacion: Int ){
    // como nos piden el metodo mostrardetalles()
    abstract fun mostrardetalles()
}
// para el libro herencia de material
class libro(titulo: String, autor: String,anodepunlicacion: Int, val genero: String, val numerodepagina: Int) : material(titulo, autor, anodepunlicacion){
    override fun mostrardetalles() {
        println(" Titulo: $titulo")
        println("Autor: $autor")
        println("Año de Publicacion: $anodepunlicacion")
        println("Género: $genero")
        println("Número de Páginas: $numerodepagina")
    }
}
// la misma forma para esta subclase revisar
class revista(titulo: String, autor: String,anodepunlicacion: Int, val issn: String, val volumen: Int, val numero: Int, val editorial: String) : material(titulo, autor, anodepunlicacion){
    override fun mostrardetalles() {
        println(" Titulo: $titulo")
        println("Autor: $autor")
        println("Año de Publicación: $anodepunlicacion")
        println("ISSN: $issn")
        println("Volumen: $volumen")
        println("Número: $numero")
        println("Editorial: $editorial")
    }
}

// ahora la clase usuario
class usuario(val nombre: String, val apellido: String, val edad: Int){
    // se necesita un metodo para reservar el material
    fun reservarelmaterial(Material : material){
        println(" $nombre $apellido reservo el material: ${Material.titulo}")
    }
    // ahora para devolver el material
    fun devolvermaterial(Material: material){
        println(" $nombre $apellido ha devuelto el material: ${Material.titulo}")
    }
}

class biblioteca{
        // las usare como privadas para que solo sean accesibles a la biblioteca
        // materiales disponibles
        private val materialesdisponibles = mutableListOf<material>()
        private val usuarioregistrado = mutableListOf<usuario>()
        // metodos para agregar y registrar
        fun agregarmaterial( Material: material){
           materialesdisponibles.add(Material)
        }
        fun registrarusuario(Usuario:usuario){
            usuarioregistrado.add(Usuario)
        }
        // metodo para prestar
         fun registrarusuario(Material: material, Usuario: usuario){
             if(materialesdisponibles.contains(Material) && usuarioregistrado.contains(Usuario)){
                 Usuario.reservarelmaterial(Material)
                 materialesdisponibles.remove(Material)
             } else{
                 println("Material no disponible o no estas registrado")
            }
        }
         // por ultimo el metodo para devolver
         fun devolvermaterial(Material: material, Usuario: usuario){
             if (usuarioregistrado.contains(Usuario)){
                 Usuario.devolvermaterial(Material)
                 materialesdisponibles.add(Material)
             } else{
                 println("El usuario no existe")
             }
         }
}

// funcion main para realizar la prueba
fun main(){
    // primero creare las instancias libro y revistas
    val Libro = libro("Harry Potter ", "J.K.Rowling", 1997,"Ciencia ficción", 256)
    val Revista = revista("Vogue", "Arthur Badwin",1892,"ISSN 00428000",1,24,"Condé Nast")
    // se mostrara los detalles de los materiales
    println("Detalles del libro:")
    Libro.mostrardetalles()
    println("\nDetalles de la Revista")
    Revista.mostrardetalles()
    //instancia usuario
    val Usuario = usuario("Martina","Manchego",20)
    //instancia biclioteca
    val Biblioteca = biblioteca()
    //agregar materiales a la biblioteca
    Biblioteca.agregarmaterial(Libro)
    Biblioteca.agregarmaterial(Revista)
    //registrar nuevo
    Biblioteca.registrarusuario(Usuario)
    //Prestar el material
    Biblioteca.registrarusuario(Libro, Usuario)
    // devolver material a la biblioteca
    Biblioteca.devolvermaterial(Libro,Usuario)
}







