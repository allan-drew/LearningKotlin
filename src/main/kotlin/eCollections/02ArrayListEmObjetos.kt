package eCollections


data class Cars (var nome : String, var preco: Double)


fun main() {
    var carro001 = Cars("Peugeot 208", 70000.00)
    var carro002 = Cars("Fiat Mobi", 69000.00)

    var listaDeCarros = arrayListOf(carro001, carro002) // o tipo do array list é Cars

    for(carro in listaDeCarros) {
        println("${carro.nome} - R$ ${carro.preco}")
    }

    // temos alguns métodos disponíveis para usar nesta lista
    println("O tamanho é ${listaDeCarros.size}")

    println("O elemento na posicao zero é ${listaDeCarros.get(0)}")

    var carro003 = Cars("VW Polo Track", 79990.00)
    listaDeCarros.add(carro003) // Appends the specified element to the end of this list.
    println(listaDeCarros)

    var carro004 = Cars("Citroen C3", 69990.00)
    listaDeCarros.add(0, carro004) // adicionando o C3 na posicao 0
    println("Agora, o novo elemento na posicao zero é ${listaDeCarros.get(0)}")
    println(listaDeCarros)






}