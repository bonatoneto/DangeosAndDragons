package breeds

import org.example.DefaultAttributes

class Halfling : DefaultAttributes() {
    override fun breed(): String {
        return "Halfling"
    }

    override fun createAttributes(): Map<String, Int> {
        val attributes = super.createAttributes().toMutableMap()
        attributes["Destreza"] = attributes["Destreza"]!! +2
        attributes["Carisma"] = attributes["Carisma"]!! +1
        return attributes
    }
}