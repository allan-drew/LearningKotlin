package Afundamentos


fun main() {

    // ================================================================================================
    // One of the most common pitfalls in many programming languages, including Java,
    // is that accessing a member of a null reference will result in a null reference exception.

    // NullPointerExeception é um erro que ocorre quando tentamos usar uma propriedade de uma classe
    // que tem seu valor como null.
    //A linguagem Kotlin tenta ao máximo evitar esse tipo de problema


    // In Kotlin, the type system distinguishes between references that can hold null (nullable references)
    // and those that cannot (non-null references).

    // For example, a regular variable of type String cannot hold null:
    var time: String = "Flamengo"
//    time = null // Null can not be a value of a non-null type String


    // To allow nulls, you can declare a variable as a nullable string by writing String?
    // ? ==> safe call operator
    var jogador: String? //com o ?, estamos dizendo que a variável pode ter valor nulo (pode nao ter valor)
    jogador = null
    println(jogador)


    // Now, if you call a method or access a property on 'time',
    // it's guaranteed NOT to cause an NPE (NullPointerException)
    println("O length do time é ${time.length}")

    // But if you want to access the same property on 'jogador', that would NOT be safe,
    // and the compiler reports an error:
//    println(jogador.length) // Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

    // But you still need to access that property. There are a few ways to do so:
    // 1) Checking for null in conditions

    // 2) Safe calls: using the safe call operator ---> ?
    // This returns jogador.length if jogador is not null,
    // and return null otherwise.
    jogador = "Romário"
    println("O length do jogador é ${jogador?.length}") //podemos chamar que não dará erro

    jogador = null
    println("O length do jogador é ${jogador?.length}") //podemos chamar que não dará erro


    // Safe calls are useful in chains.
    // Such a chain returns null if any of the properties in it is null.
    // page 387/1308 Kotlin reference pdf
    println()
    println()


    // ================================================================================================
    // OPERADOR ELVIS --->   ?:
    // o operador Elvis nos ajuda atribuir um valor padrão
    // caso uma variável que estamos querendo atribuir seja null

    // no exemplo abaixo, atribuimos o valor padrão "empty profile description" para a variável descricaoPerfil
    // quando a descricao for null

    // permitindo nulls na variável descricao:
    // val descricao: String? = "ola a todos"
    val descricao: String? = null

    // variavel obrigatória descricaoPerfil:
    val descricaoPerfil: String = descricao ?: "empty profile description"
    println(descricaoPerfil)


    // ================================================================================================

    // Forçando NullPointerException (The !! operator)

    // This is for "NPE-lovers":
    // the not-null assertion operator (!!) converts any value to a non-null type
    // and throws an exception if the value is null.
    var camisa10: String? = null
    println("Erro => ${camisa10!!.length}" )

    // Portanto, se você deseja um NPE, pode obtê-lo, mas deve solicitá-lo explicitamente e não aparecerá do nada.

    // ================================================================================================








}

