package fOOP.heranca


// Kotlin inheritance primary constructor:

// Se a classe derivada contiver um construtor primário,
// precisamos inicializar o construtor da classe base usando os parâmetros da classe derivada.

open class Employee(name: String, age: Int) {
    init{
        println("----------------------------------------")
        println("Name of the Employee is $name")
        println("Age of the Employee is $age")
        println("----------------------------------------")
    }
}

// derived class
class CEO(name: String, age: Int, salary: Double): Employee(name,age) {
    init {
        println("Salary per annum is $salary")
        println("----------------------------------------")
    }
}


// =========================
fun main() {

    CEO("Sunder Pichai", 42, 450.00)

    // As variáveis locais da classe derivada inicializam com os respectivos valores...
    // e passam as variaveis 'name' e 'age' como parâmetros para a classe Employee.

    // The employee class prints the variable’s names and values to the standard output
    // and transfers the control back to the derived class.

    // Then, the derived class executes the println() statement and exits.

}
