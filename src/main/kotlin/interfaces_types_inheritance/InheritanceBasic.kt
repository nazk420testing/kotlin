package interfaces_types_inheritance


/*
   1) Class - Add `open` keyword since class are `closed` by default i.e. cannot be inherited
   2) attribute - Need to have an `open` keyword since `closed` by default i.e. cannot be inherited

   A field is the actual field in a class that should not be visible but through properties
   A property is used to make a field visible to the outside world
   https://stackoverflow.com/questions/295104/what-is-the-difference-between-a-field-and-a-property

 */


interface FancyProvider {
}

// Need to have an `open` keyword since class are `closed` by default i.e. cannot be inherited
open class BasicFancy : FancyProvider {

    //protected since we don't want our `field` to be directly accessible except in children and the class itself
    protected open var fullName: String = ""
        get() {
            println("Getting full name via getter: $field")
            return field
        }
        set(value) {
            field = value
            println("Setting new full name: $fullName")
        }

    // here we have made our `field` available through a public `property`
    open fun getName(): String {
        println("Getting full name via property: $fullName")
        return fullName;
    }

}

// notice the overridden class ends with () that the constructor
class InheritanceBasic : BasicFancy() {
    override fun getName(): String {
        return super.fullName + " : Inheritance Basic"
    }

    fun setName(name: String) {
        super.fullName = name;
    }

    override var fullName: String = ""
        get() = super.fullName + " : overridden in subclass"

}

fun main() {
    val inheritanceBasic = InheritanceBasic();

    // accessing a protected field via a public open property
    println(inheritanceBasic.getName());
    println(inheritanceBasic.getName());

    inheritanceBasic.setName("New Name from main")
    println(System.lineSeparator())
    println(inheritanceBasic.getName());
    println(inheritanceBasic.getName());
}