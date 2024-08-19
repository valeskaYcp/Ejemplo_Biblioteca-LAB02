package biblioteca

import java.util.Calendar

fun main() {
    // Crear una instancia de Libro
    val libro1 = Libro("Cien años de soledad", "Gabriel García Márquez", Calendar.getInstance().apply { set(1967, Calendar.JUNE, 5) }, "Realismo mágico")
    libro1.mostrarInfo()
    println()

    // Crear una instancia de Revista
    val revista = Revista("Revista de Ciencia", "Editorial Ciencia", Calendar.getInstance().apply { set(2024, Calendar.AUGUST, 15) }, 123)
    revista.mostrarInfo()
    println()

    // Crear una instancia de LibroDigital
    val libroDigital = LibroDigital("Digital World", "Jane Doe", Calendar.getInstance().apply { set(2023, Calendar.JANUARY, 10) }, "http://DigitalWorld/download")
    libroDigital.mostrarInfo()

    println("-----------------------------------------")
    println("Operaciones de préstamo y devolución:")

    println("Préstamo y devolución del libro físico:")
    //PRESTAMO DE LIBRO
    libro1.prestar()
    // PRESTAR UN LIBRO QUE YA FUE PRESTADO
    libro1.prestar()
    println("¿'Cien años de soledad' está prestado? ${libro1.estaPrestado()}")

    //DEVOLVER LIBRO
    libro1.devolver()
    //DEVOLVER UN LIBRO QUE NO FUE PRESTADO
    libro1.devolver() // No estaba prestado, debe fallar
    println("¿'Cien años de soledad' está prestado? ${libro1.estaPrestado()}")
    println()

}
