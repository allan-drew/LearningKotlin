package Afundamentos


fun main() {

    val nota:Double = 6.0

    if (nota < 6) {
        println("reprovado")
    } else {
        println("aprovado")
    }


    if (nota>=6)
        println("muito bem!")

    println()



    // ----------------------

    val num1: Int = 20
    val num2: Int = 34

    // Kotlin suporta o if como uma expressão
    // Em Kotlin, if é uma expressão: retorna um valor.
    // Portanto, não há operador ternário (condição ? então: senão) porque o if comum funciona bem nessa função.
    val maiorValor = if (num1 > num2) {
        println("processando...")
        println("processando...")
        num1
    } else {
        println("processando...")
        println("processando...")
        num2
    }
    println("O maior valor é $maiorValor")

    //-------
    // de forma mais simples:
    val a = 5
    val b = 10
    val max = if (a > b) a else b
    println("O maior entre a e b é: $max ")
    println()


    // -----------------
    // If em cascata

    val notaProva: Double = 8.3

    // Usando operador range
    if (notaProva in 9.0..10.0) {
        println("Fantástico")
    } else if (notaProva in 7.0..8.0) {
        println("Parabéns")
    } else if (notaProva in 4.0..6.0) {
        println("Tem como recuperar")
    } else if (notaProva in 0.0..3.0) {
        println("Te vejo no próximo semestre")
    } else {
        println("Nota inválida")
    }


    // atencao:
    println(5 in 10..2) // false
    println(5 in 2..10) // true
    println()

    // -----------------
    // Refatorando para WHEN (correspondente ao switch)
    val numGols:Int = 2

    when(numGols) {
        10, 9 -> print("Fantástico")
        8, 7 -> print("Parabéns")
        6, 5, 4 -> print("Tem como recuperar")
        in 0..3 -> print("Te vejo próximo semestre")
        else -> print("Nota inválida") // default
    }

    println()
    println()


    // -----------------
    // WHILE
    // O uso do 'while' é recomendado quando NÃO se sabe quantas vezes irá repetir

    var num:Int = 0
    var soma:Int = 0

    // **** comentado pois tem entrada por teclado  ****
//    println("Enter some number to add or -1 to exit : \n\n")
//
//    while (num != -1) {
//        val line = readLine() ?: "0"  // Reads a line of input from the standard input stream.
//        num = line.toIntOrNull() ?: 0 // passando o valor lido para Int
//        println("You entered $num")
//
//        soma += num
//        println("A soma até agora é: $soma")
//    }
    // **** comentado pois tem entrada por teclado  ****


    println("FIM! Até a próxima!")
    println()

    // portanto, neste exemplo não sabemos quantas vezes iremos executar, logo o while se torna adequado.


    // -----------------
    // FOR:
    for (i in 1..10)
        print("$i, ")
        println()

    for (i in 10 downTo 1)
        print("$i, ")
        println()


    for(i in 0..100 step 5)
        print("$i, ")
        println()

    for(i in 100 downTo 0 step 5)
        print("$i, ")
        println()


    val alunos = arrayListOf("André", "Carla", "Marcos")

    for ((indice, aluno) in alunos.withIndex()) {
        print("$indice - $aluno \n" )
    }

    println()


    // -----------------
    // DO....WHILE
    // Do While loop runs before the test. Executa pelo menos uma vez.

    var cont: Int = 0

    do {
        println("Love music!")
        cont++
    } while (cont < 0)

    println("Loop music done!")
    println()

    // -----------------
    // BREAK
    // Suppose you are working with loops.
    // It is sometimes desirable to terminate the loop immediately without checking the test expression.
    //In such case, break is used.

    // Termina o loop envolvente mais próximo quando encontrado (sem verificar a expressão de teste)
    for (i in 1..10) {
        if (i == 5) {
            break // quando i == 5, o break faz terminar o for
        }
        println(i)
    }

    println()

    // Existe outra maneira de usar o break (labeled form) para encerrar o loop desejado
    // (pode ser um loop externo).
    // Label in Kotlin starts with an identifier which is followed by @.

            first@ for (i in 1..4) {

                second@ for (j in 1..5) {
                    println("i = $i; j = $j")

                    if (i == 2)
                        break@first // quando i == 2, o break faz terminar o for mais externo, não executando i= 3 nem i = 4
                    // Se nao tivesse o label @first, terminaria o loop com i = 2 e iria para o i = 3
                }
            }

    println()


    // CONTINUE:

    // It is sometimes desirable to skip the current iteration of the loop. In such case, continue is used.

    // O continue pula a iteração atual do loop envolvente
    // e o controle do programa salta para o final do corpo do loop.

    for (i in 1..5) {

        // *** Se i> i && i <5, pulamos a iteracao atual e vamos para a próxima ***
        if (i > 1 && i < 5) {
            continue
        }
        println("i = $i.")
    }

    println("nao imprime i > 1 e nem i < 5 pois pula a iteração")
    println()


    // continue também pode ser usado para pular a iteração do loop desejado
    // (pode ser um loop externo) usando rótulos continue.

    // by using continue with the label,
    // you can skip the execution of codes of the specific loop for that iteration.

    externo@ for (i in 1..5) {

        for (j in 1..4) {

            if (i == 3 || j == 2)
                continue@externo

            println("i = $i; j = $j")

        }

    }




}