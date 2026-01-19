package org.iesra

class Coche(var color : String?,
            val marca: String?,
            val modelo: String?,
            val numeroCaballos : Int?,
            val numeroPuertas : Int?,
            val matricula : String?) {

    val marcaMayus: String? get() = marca?.replaceFirstChar { it.uppercaseChar() }
    val modeloMayus: String? get() = modelo?.replaceFirstChar { it.uppercaseChar() }

    init {
        require(!marca.isNullOrBlank()) {"Marca no puede ser null ni estar vacio"}
        require(!modelo.isNullOrBlank()) {"Modelo no puede ser null ni estar vacio"}
        require(numeroCaballos != null && numeroCaballos in 70..700) {"Los caballos deben de estar entre 70 y 700 y no puede ser null"}
        require(numeroPuertas != null && numeroPuertas in 3..5) {"El numero de puertas debe de estar entre 3 y 5 y no puede ser null"}
        require(matricula != null && matricula.length == 7) {"La matricula debe tener 7 caracteres y no puede ser null"}
        require(color != null) {"Se requiere un color"}
    }

    override fun toString(): String {
        return "Coche: color = $color, marca: $marcaMayus, modelo: $modeloMayus, numeroCaballos: $numeroCaballos, numeroPuertas: $numeroPuertas, matricula: $matricula"
    }
}