package gAvancado01

// An abstract class cannot be instantiated (you cannot create objects of an abstract class).
// However, you can inherit subclasses from can them.

// Abstract classes are always open. You do not need to explicitly use open keyword to inherit subclasses from them.
abstract class Notebook {

    // But...if we declare a member function as abstract then we does NOT need to annotate with 'open' keyword
    // because these are open by default.
    abstract var nomeDoNotebook: String // An abstract member doesn’t have a body/initializer, and it must be implemented in the derived class.
    abstract fun displayPreco(preco: Double) // An abstract member doesn’t have a body/initializer, and it must be implemented in the derived class.

    // If you need to override these members (anoDeLancamento e displayMemoriaRAM) in the subclass,
    // they should be marked with open keyword:
    var anoDeLancamento: Int = 0     // Membro Nao-abstrato
    fun displayMemoriaRAM(memoriaRam: Int) {     // Membro nao-abstrato
        println("O notebook tem $memoriaRam GB de ram")
    }


}


// When a subclass extends an abstract class,
// it must provide implementations for all of the abstract methods defined in the abstract class.
class Macbook : Notebook() {

    override var nomeDoNotebook: String = "Macbook Air"

    override fun displayPreco(preco: Double) {
        println("O preço do macbook é : $preco" )
    }

}

// ========================
fun main() {
    var macbook1 = Macbook()
    macbook1.anoDeLancamento = 2020
    println("O nome do mac é ${macbook1.nomeDoNotebook} e o preço é ${macbook1.displayPreco(7000.00)}")
    macbook1.displayMemoriaRAM(512)
}