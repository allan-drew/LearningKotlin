package bFuncoes


inline fun transacao (funcao:() -> Unit ) { // passando uma funcao como parametro.
                                        // a funcao nao recebe nenhum parametro e retorna Unit (void)
    println("abrindo transação...")
    try {
        funcao() // se esse trecho gerar uma excecao, então o código vai para finally
    } finally {
        println("fechando transação")
    }

}

// ----------------
fun main(args: Array<String>) {

    // chamando uma funcao inline
    transacao() {  // podemos chamar tambem sem parentesis quando não temos outro parametro adicional
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }

}