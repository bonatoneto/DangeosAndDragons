package org.example.breeds.subbreeds

import org.example.Breeds.Dwarf
import org.example.utils.chooseAndUpdateAttribute

class HillDwarf : Dwarf() {
    override fun breed(): String {
        return "Anão da Colina"
    }

    override fun createAttributes(): Map<String, Int> {
        val attributes = super.createAttributes().toMutableMap()
        attributes["Sabedoria"] = attributes["Sabedoria"]!! +1
        return attributes
    }
}