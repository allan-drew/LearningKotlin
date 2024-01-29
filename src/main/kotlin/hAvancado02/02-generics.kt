package hAvancado02

// o nome generics vem do ponto de vista de quem construiu a classe de forma genérica,
// e não de quem usa a classe de uma maneira mais específica.

class Caixa<T>(val objeto: T) {

    private val objetos = ArrayList<T>()

    init {
        adicionar(objeto)
    }

    fun adicionar(novoObjeto: T) {
        objetos.add(novoObjeto)
    }

    override fun toString(): String = objetos.toString()

}

// ==================================
fun main() {
    // inferindo o tipo:
    val roupas = Caixa("calça") // inferindo o tipo String
    roupas.adicionar("camisa")
    roupas.adicionar("jaqueta")
    println(roupas)

    //-------
    // explicitamente:
    val pecasComputador = Caixa<String>("monitor")
    pecasComputador.adicionar("ssd")
    pecasComputador.adicionar("mouse")
    println(pecasComputador)


    // outro tipo
    val numeros = Caixa(objeto = 1)
    numeros.adicionar(3)
    numeros.adicionar(5)
//    numeros.adicionar("10") // Type mismatch
    println(numeros)
}
