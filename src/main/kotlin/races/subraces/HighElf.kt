package org.example.breeds.subbreeds

import breeds.Elf
import org.example.utils.chooseAndUpdateAttribute

class HighElf : Elf() {
    override fun breed(): String {
        return "Alto Elfo"
    }

    override fun createAttributes(): Map<String, Int> {
        val attributes = super.createAttributes().toMutableMap()
        attributes["Inteligencia"] = attributes["Inteligencia"]!! +1
        return attributes
    }

    fun chooseAttribute() {
        val attribute = createAttributes().toMutableMap()
        chooseAndUpdateAttribute(attribute)
    }
}