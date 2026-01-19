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
}

