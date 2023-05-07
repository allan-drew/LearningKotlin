package Afundamentos


fun main() {

    // ================== Kotlin String

    // Strings are a sequence of characters. For example, "Hello there!" is a string literal.
    // In Kotlin, all strings are objects of String class.
    var nome: String = "Allan"
    println(" O nome é $nome")

    // you cannot change individual character of a string.
    // but...you can reassign a string variable again if you declared the variable using keyword var
    nome = "Andrew"
    println(" O nome é $nome")


    // ================== String Templates
    // string templates allows strings to contain template expressions.
    // A string template expression starts with a dollar sign $
    val idade = 19
    val frase = "a idade é $idade anos"
    println(frase)

    // delimitando com chaves:
    val timesG4 = listOf("Flamengo", "Internacional", "Palmeiras", "Atlético-MG")
    println("o primeiro colocado foi ${timesG4[0]}")

    println("${
        if (timesG4[0] == "Flamengo") {
            print(" o time é carioca ")
        } else {
            print(" O time pode não ser carioca ")
        }
    } ")



    // ==================
    // sem template string (forma antiga, com concatenacao)
    val frase2 = "ele tem " + idade + " anos"
    println(frase2)


    // ================== Few String Properties and Functions
    // Since literals in Kotlin are implemented as instances of String class,
    // you can use several methods and properties of this class.
    val string01 = "Allan"
    println("Length of string01 string is ${string01.length}.")

    val string02 = " Andrew"
    val result = string01.plus(string02)
    println(result)


    


}