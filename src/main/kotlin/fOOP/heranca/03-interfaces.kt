package fOOP.heranca


// In Kotlin, an interface is a collection of abstract methods and properties
// that define a common contract for classes that implement the interface.
//
// An interface is similar to an abstract class,
// but it can be implemented by multiple classes, and it cannot have state.

//Abstract classes in Kotlin are similar to interface with one important difference:
// It's not mandatory for properties of an abstract class to be abstract or provide accessor implementations.


interface MyInterface {

    val test: Int   // abstract property
    fun foo() : String   // abstract method (returns String)

    fun hello() {   // method with default implementation
        println("Hello")
    }
}

// InterfaceImp implements the MyInterface interface.
class InterfaceImp : MyInterface {

    // The class overrides abstract members (test property and foo() method) of the interface.
    override val test: Int = 25
    override fun foo() = "Lol"

}

// ===========================
fun main(){

    val obj = InterfaceImp()
    println("test = ${obj.test}")
    obj.hello()
    println(obj.foo())
}



