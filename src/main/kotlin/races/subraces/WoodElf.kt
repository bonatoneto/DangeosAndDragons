package breeds.subbreeds

import breeds.Elf

class WoodElf : Elf() {
    override fun breed(): String {
        return "Elfo da Floresta"
    }

    override fun createAttributes(): Map<String, Int> {
        val attributes = super.createAttributes().toMutableMap()
        attributes["Sabedoria"] = attributes["Sabedoria"]!! +1
        return attributes
    }
}