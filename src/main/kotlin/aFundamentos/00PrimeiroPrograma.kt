package aFundamentos

fun main() {
    print("Primeiro")
    println("Programa");

    /** Kotlin suporta KDoc
     * @param args lista de parâmetros passados por linha de comando
     * @author
     *
     * A ferramenta Dokka do koltin interpreta os comentários feitos em Kdoc para gerar documentação
     *
     */

    // Comentário de uma linha

    /*
    Comentário de multiplas linhas (parecido com Kdoc)
     */

    // ===================================================================
    // VARIÁVEIS
    // Kotlin é fortemente tipado (as variáveis têm tipo e não mudam, mesmo que elas sejam inferidas)

    // To declare a variable in Kotlin, either var or val keyword is used.
        //    val (read-only variable)
        //    var (mutable variable - use var only if necessary)

    val sobrenome = "Tony"
    // sobrenome = "Tonnnnny"  // erro

    var nome = "Olá"
    nome = "Hello"


    // Kotlin's ability to infer the data type is called type inference
    var age = 25 // tipo inferido (int)
    println(age::class)
    age = 30
    //age = 1.5  // The floating-point literal does not conform to the expected type Int


    // String templates
    // Template expressions start with $
    val nota = 9
    println("SUA NOTA É $nota")
    println("SUA NOTA ATUALIZADA É ${nota + 1}")

    //
    val tempoEmSegundos: Int = 53
    println("$tempoEmSegundos segundos")


    //------------
    var a: Int
    var b = 2
    a = 10
    print("a + b é igual a ")
    println(a + b )
    //------------




}

