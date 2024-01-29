package eCollections

import kotlin.collections.ArrayList

// Arrays in Kotlin are represented by the Array class.


// ---------------------
fun main() {

    // To create an Array, use the function arrayOf() and pass the item values
    val array1 = arrayOf(1, 4, 6, 10)
    println(array1[0])
    println(array1[1])
    println(array1[2])
    print("imprimindo array1 completa: ")
    array1.forEach { print(it) }

    println()
    println("----------------------------")


    // Another option to create an Array is to use the Array constructor that takes
    //  - the array size
    //  - and the function that returns values of array elements given its index:
    val tenArray = Array(5){
        10
    }

    tenArray.forEach { println(it) }
    println("----------------------------")


    val arr = Array(4) { it * 3} // 0*3 / 1*3 / 2*3 / 3*3

    arr.forEach { println(it) }
    println("----------------------------")


    // Kotlin also has classes that represent arrays of primitive types
    // ByteArray, ShortArray, IntArray, and so on:

    val arr2 = IntArray(3) {50}
    arr2.forEach { println(it) }
    println("----------------------------")

    var arr3 = IntArray(5) { it * 2 }
    arr3.forEach { println(it) }
    println("----------------------------")


    //===========================================================
    val numeros = Array<Int>(10) { i -> i * 10 }
    numeros.forEach { println(it) }
    println("------")

    // podemos mudar o valor de um elemento do array
    numeros[0] = 150 // indice 0 agora terá o valor de 150
    numeros.forEach { println(it) }

    // arrays no kotlin possuem tamanho fixo
    // portanto, não conseguimos aumentar o tamanho adicionando um novo elemento na posicao 10 neste caso, já que vai até a posicao 9
//    numeros.set(10, 100) // Exception ---> .ArrayIndexOutOfBoundsException - Index 10 out of bounds for length 10
    println("----------------------------")


    // ---------------------
    // No entanto, Kotlin também possui a classe ArrayList, que é uma implementação de uma lista redimensionável.
    val minhaLista: ArrayList<Int> = arrayListOf(1, 2, 3)
    println(minhaLista)

    minhaLista.add(4) // Adiciona o número 4
    println(minhaLista)

    minhaLista.removeAt(1) // Remove o elemento na posição 1 (neste caso, o número 2)
    println(minhaLista)

    println("----------------------------")


    // ---------------------
    // arrayListOf
    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião") // array list de String
    for(item in strings) {
        println(item.uppercase())
    }
    println("-------")

    val anyList = arrayListOf("string 1", "string 2", 1, "another string", 453) // array list de Any

    for (i in anyList) {
        println(i)
//        println(i.uppercase())
    }
    println("-------")


    // int array
    val pares = arrayListOf(2, 4, 6)  // int
    val impares = intArrayOf(1, 3, 5) // int

    for(n in impares.union(pares).sorted()) {
        print("$n ")
    }
    println()
    println("-------")


    // Array List Heterogêneo:
    // embora não seja recomendado, é possível misturar tipos de dados diferentes
    val listaMix = arrayListOf("Rafael", true, 1, 3.14, 'p')

    for(item in listaMix) {
        if(item is String) { // smart cast
            println(item.uppercase()) }
        else {
            println(item)
        }
    }

    println("-------")


    // União de Array Lists

    val numeros02 = arrayListOf(1, 2, 3, 4, 5)
    val strings02 = arrayListOf("Rafael", "Pedro", "Leandro", "Gustavo")

    val uniao = numeros02 + strings02 // kotlin possui sobrecarga de operador

    for(item in uniao) {
        println(item)
    }

    println("-------")







}