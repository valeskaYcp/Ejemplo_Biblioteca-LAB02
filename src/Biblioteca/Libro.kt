package biblioteca

import java.text.SimpleDateFormat
import java.util.Calendar

// Clase Libro
open class Libro(var titulo: String, var autor: String, var anoPublicacion: Calendar, var genero: String) :
    Prestamo { private var prestado: Boolean = false

    open fun mostrarInfo() {
        val formatoFecha = SimpleDateFormat("dd MMMM yyyy")
        println("Título: $titulo")
        println("Autor: $autor")
        println("Año de publicación: ${formatoFecha.format(anoPublicacion.time)}")
        println("Género: $genero")
    }

    override fun prestar(): Boolean {
        return if (!prestado) {
            prestado = true
            println("El libro '$titulo' ha sido prestado.")
            true
        } else {
            println("El libro '$titulo' ya está prestado.")
            false
        }
    }

    override fun devolver(): Boolean {
        return if (prestado) {
            prestado = false
            println("El libro '$titulo' ha sido devuelto.")
            true
        } else {
            println("El libro '$titulo' no estaba prestado.")
            false
        }
    }

    override fun estaPrestado(): Boolean {
        return prestado
    }
}


// Subclase Revista
class Revista(titulo: String, autor: String, fechaPublicacion: Calendar, var numero: Int) :
    Libro(titulo, autor, fechaPublicacion, "Revista") {

    override fun mostrarInfo() {
        super.mostrarInfo()
        println("Número: $numero")
    }
}

// Subclase LibroDigital
class LibroDigital(titulo: String, autor: String, fechaPublicacion: Calendar, var urlDescarga: String) :
    Libro(titulo, autor, fechaPublicacion, "Libro Digital") {

    override fun mostrarInfo() {
        super.mostrarInfo()
        println("URL de descarga: $urlDescarga")
    }
}

