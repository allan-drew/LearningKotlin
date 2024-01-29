package dLambdas

//

fun main() {

    val soma = { x: Int, y: Int -> x + y }
    println(soma(5, 2))

    // a ultima sentenca de codigo é retornada:
    val subtracao = {
            a: Int, b: Int -> a - b
            "a ultima sentenca é retornada"
    }
    println(subtracao(6, 1))



}