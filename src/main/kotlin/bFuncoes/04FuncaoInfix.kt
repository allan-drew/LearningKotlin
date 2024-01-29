package bFuncoes

//In Kotlin, functions marked with infix keyword can also be called using infix notation
// means calling without using parenthesis and dot.

// A definição para as notações infixas é: Uma notação comum em aritmética e na lógica,
// onde os operadores são colocados entre os operandos em que eles atuam.

// Para deixar claro que uma funções pode ser utilizada com notação infixa
// é preciso adicionar a palavra-chave infix na definição

// - Em Kotlin as funções infixas devem ser anexadas como membro de uma classe ou uma extensão.
// - Devem ter somente um único parâmetro

class Jogador (val nome: String, val numeroGols: Int)

infix fun Jogador.maisGolsQue (jogador: Jogador): Boolean =
    this.numeroGols > jogador.numeroGols
            // funcao que verifica se o jogador atual tem mais gols do que o jogador passado para a funcao

// -------------------------
fun main() {
    val j1 = Jogador("Gabigol", 20)
    val j2 = Jogador(numeroGols = 22, nome = "Pedro")

    println(j1 maisGolsQue j2) // infix notation: código elegante, como se fosse uma frase!
    println(j1.maisGolsQue(j2)) // também podemos chamar da forma tradicional

    println(j2 maisGolsQue j1) // infix notation: código elegante, como se fosse uma frase!
    println(j2.maisGolsQue(j1)) // também podemos chamar da forma tradicional
}