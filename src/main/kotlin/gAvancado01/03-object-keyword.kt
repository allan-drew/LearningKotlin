package gAvancado01

// Kotlin Object Declarations and Expressions

// Object Declarations:
// Singleton is an object-oriented pattern where a class can have only ONE instance (object).
//https://www.programiz.com/kotlin-programming/object-singleton
// https://medium.com/@jeffersontpadua/padr%C3%A3o-singleton-simplificado-utilizando-objects-em-kotlin-e1bc0faeb64e

// Ao fazer uso do comando object, o compilador irá gerar automaticamente um construtor privado,
// garantindo que não exista mais de uma instância para essa classe.

// Além disso, o object funciona como uma classe, então você pode estender outras classes,
// implementar interfaces, criar métodos, atributos e etc.

//Muitas vezes criamos os dois objetos diferentes da mesma classe...
// ...mas temos que lembrar que a criação de dois objetos diferentes também requer a atribuição de
// duas memórias diferentes para os objetos.
// Portanto, é melhor fazer um único objeto e usá-lo repetidamente.

//For example, you are working an application having SQL database backend.
//You want to create a connection pool to access the database while reusing the same connection for all clients.
//For this, you can create the connection through singleton class so that every client get the same connection.


object Test {
    private var a: Int = 0

    var b: Int = 1

    fun makeMe12(): Int {
        a = 12
        return a
    }
}

//////============
class ClasseNormal {

}


fun main() {
//    val objeto1 = Test()
    println(Test.b)
    println(Test.makeMe12())

    println(Test.toString())
    println(Test.toString())
    println(Test.toString())

    // =====================

    val obj1 = ClasseNormal()
    val obj2 = ClasseNormal()
    val obj3 = ClasseNormal()

    println(obj1.toString())
    println(obj2.toString())
    println(obj3.toString())


}
