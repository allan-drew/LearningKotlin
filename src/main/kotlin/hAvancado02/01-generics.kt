package hAvancado02

// Generics allow us to define classes, methods and properties which are accessible using different data types

// A generic type is a class or method that is parameterized over types.
// We always use angle brackets <> to specify the type parameter in the program.
class MyClass<T> (algumParametro: T) {
    var variavel = algumParametro
}


// ===============================
fun main() {

    // To create an instance of the class (MyClass), we need to provide the type arguments:
    val myclass1 : MyClass<String> = MyClass<String>("Texto Um")
    println(myclass1.variavel)

    // Se os parâmetros puderem ser inferidos dos argumentos do constructor, é permitido omitir os argumentos de tipo:
    val myclass2 = MyClass("Texto Dois")
    // Texto Dois has type String,
    // so the compiler figures out that we are talking about MyClass<String>
    println(myclass2.variavel)

    // Como é uma classe generica, podemos passar tambem outros tipos de argumentos, como inteiro por exemplo
    val myclass3 = MyClass(10)
    println(myclass3.variavel)
    println()

}