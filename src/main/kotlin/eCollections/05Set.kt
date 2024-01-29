package eCollections

// SET:
    // não indexada
    // pode ser ordenado (mas a implementação mais comum é não ordenada)
        // Pode ser homogênea (regra) --> dados do mesmo tipo
        // Pode ser heterogênea --> dados com tipos diferentes
    // não aceita objetos duplicados


fun main() {

    //Set Heterogêneo (tipos diferentes)
    val conjunto = hashSetOf( 3, 'a', "texto", true, 3.14) // criando um hash set

//    conjunto.get(0) // erro, pois não é indexado. Mesmo se fosse ordenado não teria indice

    println(conjunto)
    conjunto.add(3) // set não aceita repetição, portanto, não irá adicionar o 3 para o Set
    println(conjunto) // 3 não adicionado (repetição)

    conjunto.add(4343)
    println(conjunto) // 4343 adicionado, pois não é repetido

    println(conjunto.size) // 6

    conjunto.remove("a") // não remove, pois não temos uma string "a"
    conjunto.remove('a') // remove, pois temos um character 'a'

    println(conjunto)


    println(conjunto.contains('a')) // verificando se existe no conjunto - false, pois foi removido
    println(conjunto.contains("Texto"))  // verificando se existe no conjunto - false
    println(conjunto.contains("texto"))  // verificando se existe no conjunto -  true


    // set de somente leitura:
    val nums = setOf(1, 2, 3)

    // não conseguimos adicionar
//    nums.add(41232)


    println("----------------------------------------------------")

    // Set Homogêneo (dados mesmo tipo):

    val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    println("Sem ordem...")
    for (aprovado in aprovados) {
        print("$aprovado  /  ") // não garante a ordem
    }

    println()

    val aprovadosNaOrdem1 = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana") // linkedSetOf garante a ordem
    println("\nLinked...")
    for (aprovado in aprovadosNaOrdem1) {
        print("$aprovado  /  ")
    }

    println()

    val aprovadosNaOrdem2 = sortedSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    println("\nSorted...")
    for (aprovado in aprovadosNaOrdem2) {
        print("$aprovado  /  ")
    }


    println()


    // podemos também definir o critério do sorted com o sortedBy
    // ordenando pela segunda letra
    println("\nSortedBy...")
    println( aprovados.sortedBy { it.substring(1) } )


}


