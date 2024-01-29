package aFundamentos


fun main() {

    // ========================================================================
    // Kotlin String --> In Kotlin, all strings are objects of String class.
    var nome: String = "Tonny"

    // you cannot change individual character of a string.
    // but...you can reassign a string variable again if you declared the variable using keyword var
    nome = "Tony"
    var sobrenome = "Stark"

    println("Olá " + nome + sobrenome + "!!")
    println("Hello $nome $sobrenome") // template


    // All operations that transform strings return their results in a NEW String object
    val nomeJogador = "Messi"
    println(nomeJogador.uppercase()) // Creates and prints a new String object (MESSI)
    println(nomeJogador) // Original string remains the same (Messi)
    println()

    // --------------------------------
    // String Templates
    // string templates allows strings to contain template expressions.
    // A string template expression starts with a dollar sign $
    var idade = 19
    var frase = "a idade é $idade anos"
    println(frase)
    idade = 20
    println("a idade agora é $idade anos")

    // Since literals in Kotlin are implemented as instances of String class,
    // you can use several methods and properties of this class.
    val nomeAtacante7 = "CRISTIANO"
    println("Length of nomeAtacante7 string is ${nomeAtacante7.length} ") // expression...needs curly braces
    val sobrenomeAtacante7 = " RONALDO"
    val nomeCompletoAtacante7 = nomeAtacante7.plus(sobrenomeAtacante7)
    println("O nome completo é $nomeCompletoAtacante7")
    println()


    val timesG4 = listOf("Flamengo", "Internacional", "Palmeiras", "Atlético-MG")
    println("o primeiro colocado foi ${timesG4[0]}") // necessário usar chaves (curly braces)

    println("${
        if (timesG4[0] == "Flamengo") {
            print(" o time é carioca ")
        } else {
            print(" O time pode não ser carioca ")
        }
    } ")


    // string templates X string concatenation:
    // string templates is preferable to string concatenation.
    val str = "abcde" + 1 // concatenation (works for concatenating strings with other types)
    println(str + "saoksoaksoa") // concatenation (works for concatenating strings with other types)
    // --------------------------------

}