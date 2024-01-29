package dLambdas

import java.text.DecimalFormat


data class Carros2023 (val nome: String, val potenciaCV: Int)

class Tenis(val nome: String, val preco: Double)

val tenisSport = listOf(
    Tenis("Adidas runfalcon 3.0", 233.99),
    Tenis("Mizuno Wave titan 2", 215.99),
    Tenis("Asics gel impression 11", 246.99),
    Tenis("Under Armour Pacer", 294.49)
)

//---------------

// Lambdas are most often used to iterate through collections to modify or filter certain elements in some way.
// Algumas funcoes da API recebem lambda como parâmetro: sortedBy, filter, map, mapIndexed, reduce...


//-----------
fun main() {

    // SortedBy:
    val nomes = arrayListOf("Fulano", "Ciclano", "Beltrano", "Zutano")
    val resultOrdenado = nomes.sortedBy { it } // it -> cada item elemento da lista
    println(resultOrdenado)
    println("------------")


    // ----------------------------
    // Filter:
    // nessa abordagem, evitamos o uso de if, for, etc...deixando o código mais conciso
    val carros = arrayListOf(
        Carros2023("Argo", 71),
        Carros2023("Polo", 75),
        Carros2023("Kwid", 68),
        Carros2023("Onix", 78),
        Carros2023("208", 71)
    )

    val potentes = carros.filter { it.potenciaCV >= 70 }.sortedBy { it.nome }
    println(potentes)
    println("------------")



    // ----------------------------
    // Map
    // The basic mapping function is map().
    // It applies the given lambda function to each subsequent element and returns the list of the lambda results.
    // The order of results is the same as the original order of elements.
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })

    // To apply a transformation that additionally uses the element index as an argument, use mapIndexed().
    println(numbers.mapIndexed { idx, value -> value * idx })
                                            // 1*0 = 0; 2*1 = 2; 3*2 = 6

    //
    val alunos = arrayListOf("Pedro", "Tiago", "Jonas")
    println(alunos.map { it.uppercase() })
    println("------------")


    // ----------------------------
    // map reduce
    val totalizar = { total: Double, atual: Double -> total + atual }

    val precoTotalMap = tenisSport.map { it.preco }
    println(precoTotalMap)

    val precoTotalReduce = precoTotalMap.reduce(totalizar) // reduce: acumula o valor começando com o primeiro elemento
    println(precoTotalReduce)

    println("O preço médio é R$ ${precoTotalReduce/tenisSport.size}.")

    // printando com duas cadas decimais
    println(DecimalFormat("#.##").format(precoTotalReduce/tenisSport.size))
    println("------------")


    // ----------------------------
    //




}
