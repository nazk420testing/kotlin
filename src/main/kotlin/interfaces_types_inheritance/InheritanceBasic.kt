package interfaces_types_inheritance


/*
   1) Class - Add `open` keyword since class are `closed` by default i.e. cannot be inherited
   2) attribute - Need to have an `open` keyword since `closed` by default i.e. cannot be inherited
 */


interface FancyProvider {
}

// Need to have an `open` keyword since class are `closed` by default i.e. cannot be inherited
open class BasicFancy : FancyProvider {
    open var fullName: String = ""
        get() {
            println("Returning full name: $field")
            return field
        }
        set(value) {
            field = value
            println("Setting new full name: $fullName")
        }


    open fun getName(): String {
        return "My Name"
    }

}

// notice the overridden class ends with () that the constructor
class InheritanceBasic : BasicFancy() {
    override fun getName(): String {
        return super.fullName + " : Inheritance Basic"
    }

    override var fullName: String = ""
        get() = super.fullName + " : overridden in subclass"

}

fun main() {
    val inheritanceBasic = InheritanceBasic();

    println(inheritanceBasic.getName());
}