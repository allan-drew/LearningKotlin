package dLambdas

// Funções Escopo e Funções Lambda:

// Funcoes de escopo deixam o código mais idiomático (mais natural).

// Funcoes escopo executam um bloco de código dentro de um contexto de um objeto.
// Ao ser invocada com uma funcao lambda, as funcoes escopo formam escopo temporário, permitindo acessar os objetos sem acessar o nome.
// São muito utilizadas no Kotlin pois deixam o código menos verboso e mais legível.

// Funcões escopo: apply, with, let, run, also
// =========================================================================================================


// funcao apply:
    //Context object   :    this
    //Return value     :    context object

// As the name implies – “Apply these to the object”.
// It can be used to operate on members of the receiver object mostly to initialize members.


class PrecoConta {

    var resultado = 0

    fun soma(valor1: Int, valor2: Int) {
        resultado += valor1 + valor2
    }

    fun add(valor: Int) {
        resultado += valor
    }

}


fun main() {
    // apply retorna o próprio objeto, e não o resultado do lambda.
    // apply é muito útil quando queremos executar blocos de código que não possuem retorno
    // e operam sobre o objeto de contexto.
    // Tradução: aplique as atribuições ao objeto.

    // 1o método
    val precoConta1 = PrecoConta()
    precoConta1.apply { soma(40, 35) }.apply { add(20) }.apply { println(resultado) }


    // 2o método
    val precoConta2 = PrecoConta()
    precoConta2.apply {
        soma(20, 30)
        add(10)
        println(resultado)
    }

    // 3o metodo (usando with)
    // with é muito útil para agrupar chamadas de funções do mesmo objeto: com esse objeto, faça o seguinte.
    val precoConta3 = PrecoConta()

    with(precoConta3) {
        soma(15, 15)
        add(15)
        println(resultado)
    }

}



// ================================================================================================================
// While using the scope function,
// we can directly refer to members without the object name.
// This is one of the ways of using the scope function.

//    The Kotlin standard library contains several functions whose sole purpose is
//    to execute a block of code within the context of an object.
//    When you call such a function on an object with a lambda expression provided,
//    it forms a temporary scope.
//    In this scope, you can access the object without its name.
//    Such functions are called scope functions.
//    There are five of them: let, run, with, apply, and also.

// Each of these functions is quite similar in nature with minor differences.
// It’s often confusing to decide which function to use and when.
//    https://www.geeksforgeeks.org/kotlin-scope-function/

// ================================================================================================================

