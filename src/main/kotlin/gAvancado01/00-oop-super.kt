package gAvancado01

// Calling the superclass implementation:

// You can call functions (and access properties) of the base class
// from a derived class using super keyword.

// base class
open class Phone() {

    var color = "Rose Gold"

    fun displayCompany(name:String) {
        println("Company is: $name")
    }
}


// derived class
class Iphone: Phone() {

    fun display(){

        // calling the base class property color (usando super)
        println("Color is: " + super.color)

        // calling the base class member function (usando super)
        super.displayCompany("Apple")
    }

}

// ==============
fun main(){
    var phone1 = Iphone()
    phone1.display()
}