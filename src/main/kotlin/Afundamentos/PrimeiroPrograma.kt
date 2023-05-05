package Afundamentos

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
    var idade: Int

    var age = 25 // tipo inferido
    println(age)
    age = 30
    println(age)
//    age = 1.5  // The floating-point literal does not conform to the expected type Int

    var tempoEmSegundos: Int = 53
    println(tempoEmSegundos)











}

