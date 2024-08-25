package org.example.breeds.subbreeds

import breeds.Elf

class MoonElf : Elf() {
    override fun breed(): String {
        return "Elfo da Lua"
    }

    override fun createAttributes(): Map<String, Int> {
        val attributes = super.createAttributes().toMutableMap()
        attributes["Sabedoria"] = attributes["Sabedoria"]!! +1
        return attributes
    }
}