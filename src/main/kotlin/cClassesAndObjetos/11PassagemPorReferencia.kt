package cClassesAndObjetos

// Em Kotlin, tudo é objeto.
// Portanto, tudo é passado por referência, inclusive os tipos básicos.


class Celular(var marca: String, var modelo: String, var anoFabricacao: Int = 2020)

fun porReferencia (celular: Celular) {
    celular.anoFabricacao++ // mudando a referencia de anoFabricacao
}


fun main() {

    var celular1 = Celular("Apple", "iPhone 12")

    var celular2 = celular1 //celular2 recebe a referencia de celular1.
                            // Logo, celular2 aponta para a mesma referencia de celular1

    celular2.modelo = "iPhone 13" // alterando em celular2 também irá alterar em celular1

    println("modelo celular1 => ${celular1.modelo}" )
    println("modelo celular2 => ${celular2.modelo}" )
    println(celular1 === celular2)
    println("-------")

    celular1 = Celular("Samsung", "S22") // agora celular1 aponta para um outro objeto
    println("modelo celular1 => ${celular1.modelo}" )
    println("modelo celular2 => ${celular2.modelo}" )
    println(celular1 === celular2)
    println("-------")

    porReferencia(celular1)
    porReferencia(celular2)
    println("ano de fabricacao celular1 => ${celular1.anoFabricacao}" )
    println("ano de fabricacao celular2 => ${celular2.anoFabricacao}" )



}

