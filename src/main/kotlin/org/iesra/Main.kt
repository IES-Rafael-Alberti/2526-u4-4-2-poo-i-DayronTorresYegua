package org.iesra

fun main() {

    try {
        val rectangulo = Rectangulo(-4.0, 3.0)
        println(rectangulo)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

}