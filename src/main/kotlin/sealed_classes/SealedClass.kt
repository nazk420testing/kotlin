package sealed_classes

import java.util.*

/*
    Sealed class: allows us to define restricted class hierarchies
    Enum : a group of distinct constants. Can have properties
    Object declarations: a convenient way to create a threadsafe singletons in Kotlin
 */

enum class ComplexityLevel(val value: String) {
    EASY("Easy"), MEDIUM("Medium"), COMPLEX("Complex"), HELP("Help")
}

//sealed classes can not be instantiated directly
//sealed classes can have classes that can have different properties and compiler can do smart-casting between them
sealed class Entity() {
    //data classes but can be normal classes too
    //
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
    val msg: String = when (entity) {
        is Entity.Easy -> "We have an Easy Entity"
        is Entity.Medium -> "We have a Medium Entity"
        is Entity.Complex -> "We have a Complex Entity"
        Entity.Help -> "We have a Help Entity"
    }

    println(msg)
}