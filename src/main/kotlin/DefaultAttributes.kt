package org.example

import org.example.Interfaces.Create_Attributes

open class Default_Attributes: Create_Attributes {
    override fun breed(): String {
        return "Raça desconhecida"
    }

    override fun createAttributes(): Map<String, Int> {
        return mapOf(
            "Força" to 10,
            "Destreza" to 10,
            "Constituição" to 10,
            "Inteligência" to 10,
            "Sabedoria" to 10,
            "Carisma" to 10
        )
    }
}