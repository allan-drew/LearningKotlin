package cClassesAndObjetos


// The primary constructor is declared in the class header
class Pessoa3(nomeInicial: String) {
    val nome: String = nomeInicial
}

// Kotlin has a concise syntax for declaring properties and initializing them from the primary constructor!
class Pessoa1(var nome: String) // nome is var
class Pessoa2(val nome: String) // nome is val


// -----------------------
fun main(args: Array<String>) {

    val p1 = Pessoa1(nome = "João")
    p1.nome = "Guilherme" // var can be reassigned
    println("${p1.nome} sabe programar!")


    val p2 = Pessoa2("Maria")
    // p2.nome = "Carina" // val cannot be reassigned


    val p3 = Pessoa3(nomeInicial = "Pedro")
    println("${p2.nome} e ${p3.nome} são legais!")

}