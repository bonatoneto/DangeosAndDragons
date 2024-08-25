package org.example.breeds.subbreeds

import breeds.Elf
import org.example.interfaces.ChooseAttribute
import org.example.utils.chooseAndUpdateAttribute

class Drow : Elf(), ChooseAttribute {
    override fun breed(): String {
        return "Drow (Elfo Negro)"
    }

    override fun createAttributes(): Map<String, Int> {
        val attributes = super.createAttributes().toMutableMap()
        attributes["Carisma"] = attributes["Carisma"]!! +1
        return attributes
    }

    override fun chooseAttribute() {
        val attribute = createAttributes().toMutableMap()
        chooseAndUpdateAttribute(attribute)
    }
}