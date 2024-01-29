package eCollections

fun main(args: Array<String>) {

    val alunos = arrayListOf("Amanda", "André", "Bernardo", "Carlos")

    // for...in
    for (aluno in alunos) {
        print("$aluno  ")
    }
    println()

    // for...in... withIndex
    for ((index, aluno) in alunos.withIndex()) {
        print("$index - $aluno  ")
    }
    println()

    // usando expressão para mudar o index
    for ((index, aluno) in alunos.withIndex()) {
        print("${index + 1} - $aluno  ") // agora o print começa do 1
    }
    println()


    // forEach
    alunos.forEach {
        print("$it  ")
    }

}