package breeds

import org.example.DefaultAttributes

class Tiefling : DefaultAttributes() {
    override fun breed(): String {
        return "Tiefling"
    }

    override fun createAttributes(): Map<String, Int> {
        val attributes = super.createAttributes().toMutableMap()
        attributes["Inteligencia"] = attributes["Inteligencia"]!! +1
        attributes["Carisma"] = attributes["Carisma"]!! +2
        return attributes
    }
}