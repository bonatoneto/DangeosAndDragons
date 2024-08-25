package breeds

import org.example.DefaultAttributes

class HalfOrc : DefaultAttributes() {
    override fun breed(): String {
        return "Meio Orc"
    }

    override fun createAttributes(): Map<String, Int> {
        val attributes = super.createAttributes().toMutableMap()
        attributes["Força"] = attributes["Força"]!! +2
        attributes["Constituição"] = attributes["Constituição"]!! +1
        return attributes
    }
}