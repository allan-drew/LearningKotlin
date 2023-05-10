package Afundamentos


fun main() {

    // Em Kotlin tudo é objeto.
    // Portanto, nos próprios objetos temos os métodos específicos para conversões

    // Número para String
    val a = 1
    println(a + 1)
    println(a.toString() + 1) // string 11. Se fosse inteiro seria 2
    println()

    // String para Número
    println("1.9".toDouble() + 3)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull() ?: 0) // usando Elvis com 0 para caso não consiga converter para um tipo int
    println("1".toInt() + 3)
    println()


    // -------
    // Checando os tipos:
    val valor = 1
    //println(valor is String) // se o compilador sabe que não existe a possibilidade da comparação,
                                // ele gera um erro em tempo de compilação

    val valor2 = "abc"
    println("valor2 é String? ${valor2 is String}") // is --> neste caso, o compilador sabe que é uma String, não gerando erro
    println("valor2 não é String? ${valor2 !is String}") // !is --> negando

    val valor3: Any = 1
    println("valor3 é String? ${valor3 is String}") // Se colocarmos o tipo Any (um tipo mais genérico), conseguimos comparar,
                            // pois existe a possibilidade do valor não ser do tipo String

    println()


    // ---------------------------------------
    // Smart Casts
    // conversões inteligentes no momento da checagem de tipos.

    // The compiler tracks the is-checks and explicit casts for immutable values
    // and inserts (safe) casts automatically when necessary:

    fun demo(x: Any) {
        if (x is String) {
            println("The length is ${x.length}") // x is automatically cast to String
        } else if (x is Int) {
            println("x + 3 is = ${x.plus(3)}") // x is automatically cast to iNT
        }
    }

    demo("abcdef")
    demo(5)
    println()

    // Também podemos fazer usando when:
    fun demo2(x: Any) {
        when(x) {
            is String -> println("The length is ${x.length}")
            is Int -> println("x + 3 is = ${x.plus(3)}")
            else -> println("não identificado!")
        }
    }

    demo2("DSDSHHSJ")
    demo2(10)
    println()

    // smart casts work only when the compiler can guarantee that the variable won't change between the check and the usage



    // ---------------------------------------
    // Operador Cast
    fun imprimirConceito(nota: Any) {
        when(nota as Int) { // operador cast --> as  // cast seguro --> as?
                    // Estamos, portanto, pegando uma variável de tipo mais genérica (Any) e usando como tipo Int
                    // Como estamos usando como tipo inteiro, se passarmos uma nota diferente de inteiro vai dar erro de Cast
            10, 9 -> println("A")
            8, 7 -> println("B")
            6, 5 -> println("C")
            4, 3 -> println("D")
            2, 1, 0 -> println("E")
            else -> println("Nota inválida")
        }
    }


//    imprimirConceito(4.5) // Erro de cast. Para corrigir, podemos usar um cast seguro (as?) , e retornar "Nota inválida"

    print("O conceito da nota 9.6 é:  ")
    imprimirConceito(9.6.toInt())
            // Usando toInt() pois o cast não é responsável por converter.
            // O cast é responsável por passar de um tipo mais genérico para um tipo mais específico
            // e assim possamos usar as funcionalidades do tipo mais específico


}