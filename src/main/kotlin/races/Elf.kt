package breeds

import org.example.DefaultAttributes

open class Elf : DefaultAttributes() {
    override fun breed(): String {
        return "Elfo"
    }

    override fun createAttributes(): Map<String, Int> {
        val attributes = super.createAttributes().toMutableMap()
        attributes["Força"] = attributes["Força"]!! -2
        attributes["Destreza"] = attributes["Destreza"]!! +4
        return attributes
    }
}