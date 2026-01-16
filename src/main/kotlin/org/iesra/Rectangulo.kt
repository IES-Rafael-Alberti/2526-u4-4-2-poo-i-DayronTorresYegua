package org.iesra

class Rectangulo(val base : Double, val altura : Double) {

    init {

        require(base > 0.0) {"La base debe ser mayor a 0"}
        require(altura > 0.0) {"Altura debe ser mayor a 0"}
    }

    fun area() : Double {
        val area = base * altura
        return area
    }

    fun perimetro() : Double {

        val perimetro = 2 * (base + altura)
        return perimetro

    }

    override fun toString(): String {
        return "Base: $base, Altura: $altura. Perimetro: ${perimetro()}, area: ${area()}."
    }
}