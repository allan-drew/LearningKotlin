package fOOP.polimorfismo

class Feijao0(val peso: Double)
class Arroz0(val peso: Double)

// neste exemplo SEM polimorfismo, devemos adicionar o método comer()
// a cada tipo de comida, alterando a classe Pessoa
class Pessoa0(var peso: Double) {

    // metodo comer
    fun comer(feijao: Feijao0) {
        peso += feijao.peso
    }

    // metodo comer
    fun comer(arroz: Arroz0) {
        peso += arroz.peso
    }
}



// ==================
fun main() {
    val feijao = Feijao0(0.3)
    val arroz = Arroz0(0.3)

    val pessoa1 = Pessoa0(80.5) // 80.5 + 0.3 + 0.3 ===> 81.1
    pessoa1.comer(feijao)
    pessoa1.comer(arroz)
    println(pessoa1.peso)

}