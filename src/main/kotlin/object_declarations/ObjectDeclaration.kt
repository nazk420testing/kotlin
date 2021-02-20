package object_declarations

import java.util.UUID

/*
    A convenient way to create a threadsafe singletons in Kotlin
 */

class Entity(val id: String, val name: String) {
    override fun toString(): String {
        return "id: $id, name: $name"
    }
}

object EntityFactory {
    fun create() = Entity(UUID.randomUUID().toString(), "Bond")
}

fun main() {
    val entity = EntityFactory.create();
    println(entity)
}