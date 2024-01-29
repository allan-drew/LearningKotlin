package bFuncoes

// Em Kotlin, você pode usar generics em funções para torná-las mais flexíveis e reutilizáveis.
// Isso permite que você escreva funções que possam lidar com diferentes tipos de dados sem precisar duplicar o código.

// Para definir uma função genérica em Kotlin, você pode usar a notação '< >'

// Neste exemplo, <E> indica que imprimirElemento é uma função genérica,
// e E é o tipo que será definido quando você chamar a função.

fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {

    // Dentro da função, você pode usar o parâmetro como se fosse do tipo E.
    val listaFiltrada = ArrayList<E>() // inicialmente vazia

    // faz um for na lista recebida como parametro
    for(e in lista) {
        if(filtro(e)) { //pegamos cada elemento e testamos na funcao.
            listaFiltrada.add(e) // Se retornar true, adicionamos na lista filtrada.
        }
    }
    return listaFiltrada
}


//-----------
// a funcao será o filtro
fun comTresLetras(nome: String): Boolean {
    return nome.length == 3
}

//-----------
// a funcao será o filtro
fun maisDezGols(gols: Int): Boolean {
    return gols > 10
}


//=============================================
fun main() {

    val nomes = listOf("Ana", "Pedro", "Bia", "Gui", "Rebeca")
    println(filtrar(nomes, ::comTresLetras))

    val gols = listOf(15, 10, 9, 45, 3, 6)
    println(filtrar(gols, ::maisDezGols))

}

