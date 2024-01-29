package cClassesAndObjetos

// Kotlin Getters and Setters
// In Kotlin, getters and setters are optional and are auto-generated if you do not create them in your program.

class Empresa {
    var nome: String = "Nome default"
}

// O código acima é equivalente a este código:
class Company {

    var name: String = "Default Name"

        // getter
        get() = field // the 'value' is assigned to 'field', and then, 'field' is assigned to get().

        // setter
        set(value) {
            field = value // Conventionally, we choose the name of the setter parameter as 'value'...
        }

}


// Podemos também alterar o comportamento dos getters e setters:
class Customer {

    var name: String
        get() = "The name of the customer is ${field}" // alterando o comportamento do get
        set(value) { // alterando o comportamento do set
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }

    constructor(name: String){
        this.name = name
    }

}


// ==========
fun main() {

    val empresa001 = Empresa()
    println(empresa001.nome)
    empresa001.nome = "O Nome da Empresa"
    println(empresa001.nome)
    println("------")
    // =======================

    val company001 = Company()
    println(company001.name)
    company001.name = "My Company Name"
    println(company001.name)
    println("------")
    // =======================

    val customer001 = Customer("")
    println(customer001.name) // usa o get() alterado implicitamente
    println("------")
    // =======================

    val customer002 = Customer("Pedrinho")
    println(customer002.name) // usa o get() alterado implicitamente
    customer002.name = "Pedro" // chama o set() implicitamente
    println(customer002.name) // usa o get() alterado implicitamente
    println("------")


}
