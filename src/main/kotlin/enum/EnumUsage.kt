package enum

import java.util.UUID

/*
    Enum : a group of distinct constants. Can have properties
    Object declarations: a convenient way to create a threadsafe singletons in Kotlin
 */

enum class ComplexityLevel(val value: String) {
    EASY("Easy"), MEDIUM("Medium"), COMPLEX("Complex")
}

class Entity(val id: String, val complexity: String) {
    override fun toString(): String {
        return "id: $id, complexityLevel: $complexity"
    }
}

object EntityFactory {
    private val id: String = UUID.randomUUID().toString()
    fun create(complexityLevel: ComplexityLevel): Entity {
        return Entity(id, complexityLevel.value)
    }
}

fun main() {
    val entity = EntityFactory.create(ComplexityLevel.COMPLEX);
    println(entity)
}