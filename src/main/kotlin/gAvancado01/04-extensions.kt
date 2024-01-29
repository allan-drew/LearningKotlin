package gAvancado01

// Kotlin Extension Function:
// Kotlin gives the programmer the ability to add more functionality to the existing classes, without inheriting them.
// This is achieved through a feature known as extensions.

class Circle (val radius: Double){

    fun area(): Double{
        return Math.PI * radius * radius;
    }

}

// =========================================
fun main(){

    // Extension function created for a class Circle
    // A new function is appended to the class using dot notation with class Circle.perimeter(),
    // and its return type is Double.
    fun Circle.perimeter(): Double{
        return 2*Math.PI*radius;
    }

    val newCircle = Circle(2.5);
    println("Area of the circle is ${newCircle.area()}")

    // invoke extension function
    println("Perimeter of the circle is ${newCircle.perimeter()}")

}