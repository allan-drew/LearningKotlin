package aFundamentos

data class Carro (val marca:String, val modelo:String)
class Pessoa (val nome:String)
fun obterPreco(preco:Double):String = if(preco >= 5000.00) "Não comprar!" else "Comprar!"



// -----------------------------------------------------------------------------------
fun main() {

    // operador destructuring
    val(marca, modelo) = Carro("Ford", "Focus")
    println(marca)
    println(modelo)

    var(a, b) = Carro("Hyundai", "HB20")
    println("$a $b")

    val (camisa10, camisa9) = listOf("Gabi", "Pedro")
    println("O camisa 10 é $camisa10 e o camisa 9 é $camisa9")

    val (_, _,terceiroColocado) = listOf("Flamengo", "Vasco", "Botafogo")
    println("$terceiroColocado terminou em terceiro lugar")
    println()



    // operadores relacionais:
    println("Apple" === "Apple")
    println(3 != 2)
    println(3 !== 2)
    println()

    // verificando a igualdade referencial (se estão no mesmo endereço de memória)
    val pessoa1 = Pessoa("Allan")
    val pessoa2 = Pessoa("Allan")
    val pessoa3 = pessoa1

    println("pessoa1 === pessoa2 --> ${pessoa1 === pessoa2}") // false
    println("pessoa1 === pessoa3 --> ${pessoa1 === pessoa3}") // true
    println()


    // Operadores lógicos:

    val executouTrabalho1 : Boolean = true
    val executouTrabalho2 : Boolean = false
    val comprouSorvete : Boolean = executouTrabalho1 || executouTrabalho2 // OU
    val comprouTv50 : Boolean = executouTrabalho1 && executouTrabalho2 // E
    val comprouTv32 : Boolean = executouTrabalho1 xor executouTrabalho2 // ou exclusivo (ou um, ou outro)
    println(comprouSorvete) // true
    println(comprouTv50) // false
    println(comprouTv32) // true

    if (!comprouSorvete) {
        println("a saúde agradece")
    } else {
        println("tomou sorvete")
    }

    println()


    // ==========================================================================================
    // Operadores unários:
    var num1 : Int = 20

    // ATENCAO!!!!!!!!
    println(num1++) // primeiro imprime e depois incrementa, portanto, imprime 20
    println(num1) // imprime 21, já incrementado

    var num2 : Int = 30
    println(++num2) // imprime 31, pois incrementa antes
    println(num2) // imprime 31
    println()


    // ==========================================================================================

    // Não Existe Operador Ternário, mas...
    // simulando o operador ternário
    val nota :Double = 6.0
    val resultado : String = if(nota >= 7) "Aprovado" else "Reprovado"
    println(resultado)
    println()


    //----
    // usando a funcao obterPreco definida no início do arquivo com a simulacao do operador ternario
    println(obterPreco(4950.99))
    println()

}




