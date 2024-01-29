package fOOP.heranca

//In Kotlin, all classes are 'final' by default (a 'final' class cannot be subclassed).
//To permit the derived class to inherit from the base class, we must use the 'open' keyword in front of the base class.

// Colocando 'open' na classe Professor para permitir a herança
open class Professor(age: Int, name: String) {
    init {
        println("Dentro do init:")
        println("   My name is $name.")
        println("   My age is $age")
    }
}

// fazendo a herança
class MathTeacher(age: Int, name: String): Professor(age, name) {
    fun teachMaths() {
        println("I teach math.")
    }
}

// fazendo a herança
class EnglishTeacher(age: Int, name: String): Professor(age, name) {
    fun teachEngl() {
        println("I teach english.")
    }
}


// ========================================================
fun main() {

    var professor1 = Professor(28, "Amanda")
    print("\n")

    var professorMatematica1 = MathTeacher(30, "Joaozinho")
    professorMatematica1.teachMaths()
    print("\n")


    var professorIngles1 = EnglishTeacher(25, "Mariazinha")
    professorIngles1.teachEngl()
    print("\n")

}
