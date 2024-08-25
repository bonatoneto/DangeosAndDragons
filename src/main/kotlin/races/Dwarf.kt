package org.example.Breeds

import org.example.DefaultAttributes

open class Dwarf : DefaultAttributes() {
    override fun breed(): String {
        return "Anão"
    }

    override fun createAttributes(): Map<String, Int> {
        val attributes = super.createAttributes().toMutableMap()
        attributes["Constituição"] = attributes["Constituição"]!! + 2
        return attributes
    }
}