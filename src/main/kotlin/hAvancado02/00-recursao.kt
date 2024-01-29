package hAvancado02

// as recursoes precisam de um criterio de parada...
// para o caso do problema do fatorial, o criterio de parada seria que 0! = 1 e 1! = 1

fun fatorial(num: Int): Int = when(num) {
    in 0..1 -> 1 //condicao de parada
    in 2..Int.MAX_VALUE -> num * fatorial(num - 1) //recursividade
    else -> throw IllegalArgumentException("Número negativo") //
}

//========
fun main() {
    val numero = 5
    println("O fatorial de $numero é: ${fatorial(numero)}")
}
