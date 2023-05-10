package BFuncoes

fun multiplicar(num1: Int = 1, num2: Int = 3): Int {
    return num1*num2
}

fun main() {
    println(multiplicar()) // resposta 3
    println(multiplicar(2)) // resposta 6 --> 2 * 3
    println(multiplicar(num2 = 2)) // resposta 2 --> 1 * 2 // usando argumento nomeado
    println(multiplicar(10, 4)) // resposta 40
}