package biblioteca

interface Prestamo {
    fun prestar(): Boolean
    fun devolver(): Boolean
    fun estaPrestado(): Boolean
}



