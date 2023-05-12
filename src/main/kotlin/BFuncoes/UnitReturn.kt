package BFuncoes

// The type with only one value: the Unit object. This type corresponds to the void type in Java.

// Em Kotlin, o objeto Unit é uma representação do tipo de retorno de uma função que não retorna nenhum valor significativo.
// É usado principalmente quando uma função tem um efeito colateral,
// como imprimir algo no console ou realizar uma tarefa sem retornar um valor relevante.

// The Unit type is what you return from a function that doesn't return anything of interest.
// Such a function is usually performing some kind of side effect.
// The unit type has only one possible value, which is the Unit object.
// You use Unit as a return type in Kotlin when you would use void (lowercase v) in Java.

// Todas as funcoes abaixo são equivalentes:
fun printaMaior(num1: Int, num2: Int) { // retorna Unit, mesmo não explicitando
    println(Math.max(num1,num2))
}

fun printaMaior2 (num1: Int, num2: Int): Unit { //retornar Unit (explícito)
    println(Math.max(num1,num2)) // não é necessário colocar return para retornar Unit
}

fun printaMaior3 (num1: Int, num2: Int): Unit {
    println(Math.max(num1,num2))
    return // chamando de forma explícita o return
}

fun printaMaior4(num1: Int, num2: Int): Unit {
    println(Math.max(num1,num2))
    return Unit // chamando de forma mais explícita o return Unit
}

fun printaMaior5(num1: Int, num2: Int) {
    println(Math.max(num1,num2))
    return Unit
}

// -------------------
fun main() {
    println("Printando de diferentes maneiras:")
    printaMaior(5, 2)
    printaMaior2(5, 2)
    printaMaior3(5, 2)
    printaMaior4(5, 2)
    printaMaior5(5, 2)
    println("-----")

    // Unit é um objeto, portanto temos algumas funcionalidades:
    // Unit tem, por exemplo, a funcionalidade run
    println("Funcionalidades do Unit:")
    printaMaior(5, 2).run { 5 > 2 }.run { println("Resultado = $this") }
    println("-----")
    printaMaior2(5, 2).run { println("$this") }


}

