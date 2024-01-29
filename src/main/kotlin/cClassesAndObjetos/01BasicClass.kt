package cClassesAndObjetos

class Carro {

    var nome = ""
    var modelo = ""
    var color = ""

    fun andar() {
        println("o carro está andando")
    }

    fun parar() {
        println("o carro parou!")
    }

}


// ==================================================
fun main() {

    val carro1 = Carro()
    carro1.nome = "Up"
    carro1.modelo = "TSI"
    carro1.color = "branco"

    println("o nome do carro é ${carro1.nome}")
    println("o modelo do carro é ${carro1.modelo}")
    println("a cor do carro é ${carro1.color}")
    carro1.andar()
    carro1.parar()

    println("=======================")


    val carro2 = Carro()
    carro2.nome = "Polo"
    carro2.modelo = "TSI"
    carro2.color = "preto"

    println("o nome do carro é ${carro2.nome}")
    println("o modelo do carro é ${carro2.modelo}")
    println("a cor do carro é ${carro2.color}")
    carro2.andar()
    carro2.parar()

    // o problema é que dessa maneira, se quisermos criar vários objetos com muitos atributos cada,
    // teremos que repetir muito código
    // portanto, um jeito melhor de criar esses objetos é utilizar um construtor


}