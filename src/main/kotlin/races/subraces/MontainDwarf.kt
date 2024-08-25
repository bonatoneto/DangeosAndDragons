package org.example.breeds.subbreeds

import org.example.Breeds.Dwarf
import org.example.utils.chooseAndUpdateAttribute

class MontainDwarf : Dwarf() {
    override fun breed(): String {
        return "Anão da Colina"
    }

    override fun createAttributes(): Map<String, Int> {
        val attributes = super.createAttributes().toMutableMap()
        attributes["Força"] = attributes["Força"]!! +2
        return attributes
    }
}