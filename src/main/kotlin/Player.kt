package org.example

import org.example.Interfaces.CreateAttributes

class Player(val name: String, private val attributes: CreateAttributes) {
    fun showAttributes() {
        println("Atributos de ${name}:")
        for ((attribute, value) in attributes) {
            println("$attribute: $value")
        }
    }
}