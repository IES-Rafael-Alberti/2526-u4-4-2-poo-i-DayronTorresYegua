package org.iesra

class Persona(var peso : Double, var altura : Double) {

    var nombre : String = ""
    val imc : Double
        get() = peso / (altura * altura)

    constructor(peso: Double, altura: Double, nombre : String) : this(peso, altura) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return "Persona(nombre='$nombre', peso=$peso, altura=$altura, imc=%.2f)".format(imc)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        else if (other !is Persona) return false

        return nombre == other.nombre && peso == other.peso && altura == other.altura
    }

    override fun hashCode(): Int {
        var result = peso.hashCode()
        result = 31 * result + altura.hashCode()
        result = 31 * result + nombre.hashCode()
        result = 31 * result + imc.hashCode()
        return result
    }

    fun saludar() : String {
        return "Hola $nombre"
    }

    fun alturaEncimaMedia() : Boolean {
        return if (altura >= 1.75) {
            true
        } else {
            false
        }
    }

    fun pesoEncimaMedia() : Boolean {
        return if (peso >= 70) {
            true
        } else {
            false
        }
    }


    fun obtenerDescImc(): String {
        return when {
            imc < 18.5 -> "peso insuficiente"
            imc in 18.5..24.9 -> "peso saludable"
            imc in 25.0..29.9 -> "sobrepeso"
            imc >= 30.0 -> "obesidad"
            else -> "Error en cálculo"
        }
    }

}

