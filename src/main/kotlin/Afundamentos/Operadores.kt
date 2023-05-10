package Afundamentos

data class Carro (val marca:String, val modelo:String)

class Pessoa (val nome:String)

fun obterPreco(preco:Double):String = if(preco >= 5000.00) "Não comprar!" else "Comprar!"


// ====================
fun main() {

    // operador destructuring
    val(marca, modelo) = Carro("Ford", "Focus")
    println(marca)
    println(modelo)

    var(a, b) = Carro("Hyudnai", "HB20")
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

    println("pessoa1 === pessoa2 --> ${pessoa1 === pessoa2}")
    println("pessoa1 === pessoa3 --> ${pessoa1 === pessoa3}")
    println()



    // Operadores lógicos:

    val executouTrabalho1 : Boolean = true
    val executouTrabalho2 : Boolean = false
    val comprouSorvete : Boolean = executouTrabalho1 || executouTrabalho2 // OU
    val comprouTv50 : Boolean = executouTrabalho1 && executouTrabalho2 // E
    val comprouTv32 : Boolean = executouTrabalho1 xor executouTrabalho2 // ou exclusivo (ou um, ou outro)
    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)

    if (!comprouSorvete) {
        println("a saúde agradece")
    } else {
        println("tomou sorvete")
    }

    println()


    // Operadores unários:
    var num1 : Int = 1
    var num2 : Int = 2

    num1++
    println("num1 = $num1")

    --num1
    println("num1 = $num1")

    // Incremento e decremento
    println(++num1 == num2--) // true --> 2 (incrementa antes) == 2 (decrementa depois da comparação)
    println(num1 == num2) // false --> 2 != 1 (decrementado)
    println()



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