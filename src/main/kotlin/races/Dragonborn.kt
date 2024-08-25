package org.example.Breeds

import org.example.DefaultAttributes

class Dragonborn : DefaultAttributes() {
    override fun breed(): String {
        return "Draconato"
    }

    override fun createAttributes(): Map<String, Int> {
        val attributes = super.createAttributes().toMutableMap()
        attributes["Força"] = attributes["Força"]!! + 2
        return attributes
    }
}