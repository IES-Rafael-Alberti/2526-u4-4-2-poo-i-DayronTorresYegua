package org.iesra

fun main() {

    // try {
    //     val rectangulo = Rectangulo(-4.0, 3.0)
    //     println(rectangulo)
    // } catch (e: IllegalArgumentException) {
    //     println(e.message)
    // }

    /*
    val persona1 = Persona(50.0, 1.70)
    val persona2 = Persona(80.0, 1.6, "Juan")
    val persona3 = Persona(90.0, 1.0, "Antonio")

    println(persona1)
    println(persona2)
    println(persona3)

    var nombrePersona1 : String?

    do {
        println("Introduce el nombre de la persona 1: ")
        nombrePersona1 = readln()
    } while (nombrePersona1.isBlank())

    persona1.nombre = nombrePersona1

    println("Persona1, nombre: ${persona1.nombre}, peso: ${persona1.peso}, altura: ${persona1.altura}")

    println("Persona3, peso: ${persona3.peso}, altura: ${persona3.altura}, imc: ${persona3.imc}")
    persona3.altura = 1.80
    println("Persona3, peso: ${persona3.peso}, altura: ${persona3.altura}, imc: %.2f".format(persona3.imc))

    persona2.altura = persona3.altura

    println(persona2)
    println(persona3)

    println(persona2 == persona3)

    println(persona1.saludar())
    println(persona1.alturaEncimaMedia())
    println(persona1.pesoEncimaMedia())

    println(persona1.obtenerDescImc())
     */

    val coche1 = Coche("rojo", "Toyota", "Corolla", 150, 5, "1234ABC")
    println(coche1)

    try {
        val cocheMarcaNull = Coche("rojo", null, "Corolla", 150, 5, "1234ABC")
        println(cocheMarcaNull)
    } catch (e: IllegalArgumentException) {
        println("Marca nula: ${e.message}")
    }

    try {
        val cocheMarcaVacia = Coche("rojo", "", "Corolla", 150, 5, "1234ABC")
        println(cocheMarcaVacia)
    } catch (e: IllegalArgumentException) {
        println("Marca vacía: ${e.message}")
    }

    try {
        val cocheCaballosBajo = Coche("rojo", "Toyota", "Corolla", 50, 5, "1234ABC")
        println(cocheCaballosBajo)
    } catch (e: IllegalArgumentException) {
        println("Caballos bajos: ${e.message}")
    }

    try {
        val cocheCaballosAlto = Coche("rojo", "Toyota", "Corolla", 800, 5, "1234ABC")
        println(cocheCaballosAlto)
    } catch (e: IllegalArgumentException) {
        println("Caballos altos: ${e.message}")
    }

    try {
        val cochePuertasPocas = Coche("rojo", "Toyota", "Corolla", 150, 2, "1234ABC")
        println(cochePuertasPocas)
    } catch (e: IllegalArgumentException) {
        println("Pocas puertas: ${e.message}")
    }

    try {
        val cochePuertasMuchas = Coche("rojo", "Toyota", "Corolla", 150, 6, "1234ABC")
        println(cochePuertasMuchas)
    } catch (e: IllegalArgumentException) {
        println("Muchas puertas: ${e.message}")
    }

    try {
        val cocheMatriculaCorta = Coche("rojo", "Toyota", "Corolla", 150, 5, "123ABC")
        println(cocheMatriculaCorta)
    } catch (e: IllegalArgumentException) {
        println("Matrícula corta: ${e.message}")
    }

    try {
        val cocheModeloNull = Coche("rojo", "Toyota", null, 150, 5, "1234ABC")
        println(cocheModeloNull)
    } catch (e: IllegalArgumentException) {
        println("Modelo nulo: ${e.message}")
    }

    try {
        val cocheModeloVacio = Coche("rojo", "Toyota", "", 150, 5, "1234ABC")
        println(cocheModeloVacio)
    } catch (e: IllegalArgumentException) {
        println("Modelo vacío: ${e.message}")
    }

    val cocheValido2 = Coche("azul", "Ford", "Focus", 200, 4, "9876XYZ")
    println(cocheValido2)

    cocheValido2.color = "verde"
    println("Color cambiado: $cocheValido2")
}