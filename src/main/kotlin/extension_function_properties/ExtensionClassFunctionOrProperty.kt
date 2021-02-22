package extension_function_properties

/*
    // Let's look at extension of a function or property of a class.
    // Data class: Kotlin's way of concise immutable class
    // lets apply extension and add a new method to it outside of the class in another function
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


fun Entity.Medium.getNewStringRepresentation() {
    print("Printing Entity.Medium:[id: $id, name:$name] ${System.lineSeparator()}")
}

fun main() {
    val entity: Entity = Entity.Complex("id", "complex", 0.2f)
    val entityMedium: Entity = Entity.Medium("id", "medium")

    //using extended function
    Entity.Medium("id", "medium").getNewStringRepresentation();

    // this won't work since entity2 is of type Entity
//    entity2.getNewStringRepresentation()

    var entity4 =  entityMedium as Entity.Medium;
    entity4.getNewStringRepresentation();

    if(entityMedium is Entity.Medium) {
        // this is going to work
        entityMedium.getNewStringRepresentation()
    }
}

