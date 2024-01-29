package fOOP.polimorfismo

open class Comida(val peso: Double)

class Feijao(peso: Double) : Comida(peso)
class Arroz(peso: Double) : Comida(peso)
class Ovo(peso: Double) : Comida(peso)

class Pessoa(var peso: Double) {
    // Com o polimorfismo, não é necessário criar o método comer() várias vezes.
    // Todas as classes que herdam de Comida serão suportadas pelo método comer(), devido ao Polimorfismo.
    fun comer(comida: Comida) {
        peso += comida.peso
    }
}

// ====================================
fun main() {

    val feijao = Feijao(0.3)
    val arroz = Arroz(0.3)
    val ovo = Ovo(0.2)
    val ovo2 = Ovo(0.22)

    val pessoa2 = Pessoa(80.5)
    pessoa2.comer(feijao)
    pessoa2.comer(arroz)
    pessoa2.comer(ovo)
    pessoa2.comer(ovo2)
    println(pessoa2.peso)

}