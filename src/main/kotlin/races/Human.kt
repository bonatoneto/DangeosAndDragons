package breeds

import org.example.DefaultAttributes

class Human : DefaultAttributes() {
    override fun breed(): String {
        return "Humano"
    }

    override fun createAttributes(): Map<String, Int> {
        val attributes = super.createAttributes().toMutableMap()
        return attributes
    }
}