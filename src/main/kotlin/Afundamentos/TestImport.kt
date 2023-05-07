package Afundamentos

//importando a funcao retornaNomePessoa alterando o nome para returnPersonName
import Afundamentos.PacoteA.retornaNomePessoa as returnPersonName

//importando a classe Carro
import Afundamentos.PacoteA.Carro

//importando apenas um elemento da enum
import Afundamentos.PacoteA.FaceMoeda.CARA

//importando todos os elementos do pacote B
import Afundamentos.PacoteB.*

fun main() {

    // O pacote kotlin.io é importado por padrão
    // porém, vamos fazer explicitamente, e chamando a funcao importada do pacoteA:
    kotlin.io.println(returnPersonName("Allan"))

    // Usando a classe Carro
    val carro01 = Carro("Honda Civic")
    println(carro01.nomeCarro)

    // Acessando o elemento da enum
    println(CARA)

    // Usando as funcoes do pacoteB
    println("A soma de 3 com 5 é ${somarInteiros(3, 5)}")
    println("A subtracao de 3 com 5 é ${subtrairInteiros(3, 5)}")


}