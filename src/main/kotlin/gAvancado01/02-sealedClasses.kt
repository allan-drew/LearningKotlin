package gAvancado01

// Kotlin Sealed Classes

//As classes sealed são usadas quando um valor pode ter apenas
// um dos tipos de um conjunto limitado (hierarquias restritas).

// A sealed class defines a set of subclasses within it:
sealed class Fruit(val x : String) {

    // Two subclasses defined within
    class Apple : Fruit("Apple")
    class Mango : Fruit("Mango")
}

// A subclass defined outside the sealed class
class Pomegranate: Fruit("Pomegranate")


// All the subclasses of the sealed class must be defined within the same Kotlin file.
// However, it not necessary to define them within the sealed class,
// they can be defined in any scope where the sealed class is visible.


// A function to take in an object of type Fruit
// And to display an appropriate message depending on the type of Fruit
fun display(fruit: Fruit) {
    when(fruit) {
        is Fruit.Apple -> println("${fruit.x} is good for iron")
        is Fruit.Mango -> println("${fruit.x} is delicious")
        is Pomegranate -> println("${fruit.x} is good for vitamin d")
        // Sealed class restricts the possibility of creating subclasses.
        // And, when you handle all subclasses of a sealed class in an when expression,
        // it's not necessary to use else branch.
    }
}


// =================================
fun main()
{
    // Objects of different subclasses created
    val obj = Fruit.Apple()
    val obj1 = Fruit.Mango()
    val obj2 = Pomegranate()

    // Function called with different objects
    display(obj)
    display(obj1)
    display(obj2)

}
