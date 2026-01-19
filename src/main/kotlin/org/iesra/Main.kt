package org.iesra

fun main() {

    // try {
    //     val rectangulo = Rectangulo(-4.0, 3.0)
    //     println(rectangulo)
    // } catch (e: IllegalArgumentException) {
    //     println(e.message)
    // }

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
}