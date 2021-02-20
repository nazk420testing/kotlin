package companion_objects

import java.util.*

/*
    We want to create a factory class that return Entity objects.
    Since it is a factory, therefore, we want to keep the constructor private, so that no one can instantiate an object.
    However, we need to somehow create our Entity objects.

    `companion bbject` comes to rescue, since a companion object has access to the private methods and properties
    of the enclosing class.

 */

class Entity private constructor(val id: String) {
    companion object {
        fun create(id: String) = Entity(id);
    }
}

class EntityTwo private constructor() {
    // Naming the companion object
    companion object EntityFactory {
        fun create() = EntityTwo();
    }
}

class EntityThree private constructor(val uuid: String) {
    // Naming the companion object
    companion object EntityFactoryWithProperties {
        var uuid = UUID.randomUUID().toString();
        fun create() = EntityThree(uuid);
    }
}


/*
Companion Id with interface
 */

interface IdProvider {
    fun getId() : String
}
class EntityFour private constructor(val uuid: String) {
    // Naming the companion object with interface
    companion object EntityFactoryWithProperties : IdProvider{
        fun create() = EntityFour(getId());
        override fun getId(): String {
            return UUID.randomUUID().toString()
        }
    }
}




fun main() {

//    var entity = Entity.Companion.create(" id");
    // shortcut and remove .Companion reference
    var entity = Entity.create(" id");
    println(entity.id);

    print(System.lineSeparator())
    //using a named companion object
    val entityTwo = EntityTwo.EntityFactory.create();
    println(entityTwo.toString())

    print(System.lineSeparator())
    //using a named companion object with properties
    val entityThree = EntityThree.EntityFactoryWithProperties.create();
    println(entityThree.uuid)

    print(System.lineSeparator())
    //using a named companion object that is implementing an interface
    val entityFour = EntityFour.EntityFactoryWithProperties.create();
    println(entityThree.uuid)


}