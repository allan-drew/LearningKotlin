package cClassesAndObjetos

// https://www.geeksforgeeks.org/kotlin-constructor/

//In Kotlin, there are two constructors:
        //Primary constructor - concise way to initialize a class
        //Secondary constructor - allows you to put additional initialization logic

// ================ PRIMARY CONSTRUCTOR
// The primary constructor is part of the class header:
class Car constructor(CarName: String) { /*...*/ }


// If the primary constructor does not have any annotations or visibility modifiers,
// the constructor keyword can be omitted:
class Moto(nomeDaMoto: String) { /*...*/ }


// In KOTLIN, we can declare properties directly in the constructor!
// Kotlin has a concise syntax for declaring properties and initializing them from the primary constructor!
// Properties declared in the primary constructor can be mutable (var) or read-only (val).
class Funcionario (var nomeFuncionario: String, var idadeFuncionario: Int) {
    // as propriedades nomeFuncionario
    // e idadeFuncionario de fato guardam valores
}


// ==================================================================================================
fun main() {

    //
    var funcionar1 = Funcionario("Joaozinho", 33)
    println(funcionar1.nomeFuncionario)
    println(funcionar1.idadeFuncionario)
    print("\n")


}