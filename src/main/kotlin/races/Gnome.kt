package org.example.breeds

import org.example.DefaultAttributes

class Gnome : DefaultAttributes() {
    override fun breed(): String {
        return "Gnomo"
    }

    override fun createAttributes(): Map<String, Int> {
        val attributes = super.createAttributes().toMutableMap()
        attributes["Inteligencia"] = attributes["Inteligencia"]!! +2
        return attributes
    }
}