package data_class

import java.util.*

/*
    // Data class: Kotlin's way of concise immutable class
 */

enum class ComplexityLevel(val value: String) {
    EASY("Easy"), MEDIUM("Medium"), COMPLEX("Complex"), HELP("Help")
}

sealed class Entity() {
    //data classes but can be normal classes too
    // Kotlin's way of concise immutable class
    data class Easy(val id: String, val name: String) : Entity()
    data class Medium(val id: String, val name: String) : Entity()
    data class Complex(val id: String, val name: String, val multiplier: Float) : Entity()

    //a generic static help entity
    object Help : Entity() {
        val name = "Help"
    }

}

object EntityFactory {
    private val id: String = UUID.randomUUID().toString()
    fun create(type: ComplexityLevel): Entity {
        return when (type) {
            ComplexityLevel.EASY -> Entity.Easy(id, type.value)
            ComplexityLevel.MEDIUM -> Entity.Medium(id, type.value)
            ComplexityLevel.COMPLEX -> Entity.Complex(id, type.value, 2f)
            ComplexityLevel.HELP -> Entity.Help
        }
    }
}

fun main() {
    val entity: Entity = EntityFactory.create(ComplexityLevel.COMPLEX);
    val entity2: Entity = EntityFactory.create(ComplexityLevel.EASY);

    when(entity == entity2) {
        true ->   println(" ${entity} ${System.lineSeparator()} ${entity2} ${System.lineSeparator()} ==>>> Equal")
        else ->   println(" ${entity} ${System.lineSeparator()} ${entity2} ${System.lineSeparator()} ==>>> Not Equal")
    }

}