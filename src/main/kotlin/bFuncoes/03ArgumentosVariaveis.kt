package bFuncoes

// Variable number of arguments (varargs).
// This means that the ordenar() function can accept zero or more integers
fun ordenar(vararg numeros: Int): IntArray {
    return numeros.sortedArray()
}

// Sometimes we need a function where we can pass n number of parameters,
// and the value of n can be decided at runtime.
// Kotlin provides us to achieve the same by defining a parameter of a function as vararg.
// We can pass n number of parameters to a vararg variable of the defined datatype or even of a generic type.

// -------------------------------------------------------------------------------------------------
fun main(args: Array<String>) {

    for(n in ordenar(38, 3, 456, 8, 51, 1, 88, 73)) {
        print("$n ")
    }

    println()

    for(n in ordenar(10, 1, -3, 4, 0, 1)) {
        print("$n ")
    }

    println()

    for(n in ordenar(100, 19)) {
        print("$n ")
    }

}

