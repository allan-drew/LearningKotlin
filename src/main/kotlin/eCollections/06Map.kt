package eCollections

// MAP:
    // estrutura de CHAVE (sem repeticao) e VALOR (pode ter repeticao)
    // dinâmica
    // Pode ser homogênea (regra) --> dados do mesmo tipo
    // Pode ser heterogênea --> dados com tipos diferentes

fun main() {

    var map = HashMap<Long, String>()
                // tipo da chave ---> Long
                // tipo do valor ---> String

    // put:
    // Associates the specified value with the specified key in this map.
    // If the map previously contained a mapping for the key, the old value is replaced.
    map.put(10020030040, "João") // chave CPF; valor nome
    map.put(30040050060, "Maria")

    map.put(60070080090, "Pedro")
    map.put(60070080090, "Pedro Junior") // substituindo valor (passando a mesma chave)


    // não guarda ordem de insercao nem a ordem natural da chave
    for(parMapeado in map) {
        println(parMapeado)
    }

    println()

    // pegando apenas as chaves
    for (cpf in map.keys) {
        println(cpf)
    }

    println()

    // pegando apenas os valores
    for (nome in map.values) {
        println(nome)
    }

    println()

    // percorrendo usando destructuring
    for ((cpf, nome) in map) {
        println("NOME = $nome; CPF = $cpf")
    }

    println()

    println(map.size)
    println(map.get(30040050060)) // pegando o valor cuja chave é o cpf 30040050060
    println(map[30040050060]) // pegando o valor cuja chave é o cpf 30040050060
    println(map.contains(30040050060))
    map.clear() //limpando
    println(map.isEmpty()) // verificando se está vazio

    println("--------------------------------------------------")

    // usando hashMapOf:
    var map002 = hashMapOf(1 to "Gui", 2 to "Rebeca", 3 to "Cibalena")

    for ((chave, valor) in map002) {
        println("$chave) $valor")
    }

    for(parMapeado002 in map002) {
        println(parMapeado002)
    }

}