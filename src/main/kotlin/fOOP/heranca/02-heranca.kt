package fOOP.heranca

// Kotlin inheritance secondary constructor:

// Se a classe derivada não contiver um construtor primário,
// precisamos chamar o construtor secundário da classe base a partir do construtor secundário da classe derivada
// usando a palavra-chave super.

open class Jogador {
    constructor(name: String,age: Int) { // We also need to initialize the base class secondary constructor
        // using the parameters of the derived class.
        println("Name of the Jogador is $name")
        println("Age of the Jogador is $age")
    }
}

// derived class
class JogadorDeFutebol : Jogador {
    // super
    constructor( name: String,age: Int, salary: Double): super(name,age) {
        println("Salary per annum is $salary million dollars")
    }
}

// =========================================================================
fun main () {
    JogadorDeFutebol("Gabigol", 26, 5.00)
}

