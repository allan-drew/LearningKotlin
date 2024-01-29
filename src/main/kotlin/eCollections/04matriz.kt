package eCollections

// matriz é um array de arrays

fun main() {

    val matriz = Array(3) {// array
        arrayOfNulls<Int>(4)    // outro array
    }

    matriz[0][0] = 1
    matriz[0][1] = 2
    matriz[0][2] = 3
    matriz[0][3] = 4

    matriz[1][0] = 5
    matriz[1][1] = 6
    matriz[1][2] = 7
    matriz[1][3] = 8

    matriz[2][0] = 9
    matriz[2][1] = 10
    matriz[2][2] = 11
    matriz[2][3] = 12

    matriz.forEach {
        it.forEach {
            print("$it / ")
        }
    }

    println()
    println("=============")

    matriz.forEach {
            linha -> linha.forEach {
            valor -> print("$valor | ")
        }
    }


    println()
    println("=============")


    // ----------------------------------------
    for ((linha, linhaArray) in matriz.withIndex()) {
        // indice //valor
        for ((coluna, valor) in linhaArray.withIndex()) {
            // indice //valor
            println("[$linha][$coluna] =>  $valor")
//            println("[$linha][$coluna] => ${matriz[linha][coluna]}")

            // linha = indice
            // coluna = indice tbm
        }
    }





}


