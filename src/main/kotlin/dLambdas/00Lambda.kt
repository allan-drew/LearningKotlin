package dLambdas

// Functions are also data types, so you can store functions in variables,
// pass them to functions, and return them from functions.

fun desligar() {
    println("Desligar...(1)")
}


// Lambda expressions provide a concise syntax to define a function without the fun keyword.
// After the assignment operator (=) is the lambda expression,
// which consists of a pair of curly braces that form the function body.
val desligando = { // With lambda expressions, you can create variables that store functions!!
    println("Desligando...(2)")
}


// -------------------
fun main() {

    // To refer to a function as a value, you need to use the function reference operator (::)
    val desligue = ::desligar

    // With lambda expression we refer to a variable rather than a function:
    desligando() // call variable like functions

    // We can store in other variables that you can call like functions.
    val desligue02 = desligando
    desligue02()

}

