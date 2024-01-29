package fOOP.encapsulamento

// ENCAPSULAMENTO E VISIBILIDADE:
        // The principle of ENCAPSULATION says that the properties should NOT be public.
        // So, the way to change the value the data that you store inside these properties...
        // should be really USING METHODS that you expose...
        // and then you give access to those methods to your users.

//    In Kotlin, visibility modifiers are used to control the visibility of a class,
//    its members (properties, functions, and nested classes), and its constructors.

//------------------------------------------------------------------------------------------------------------
// public: makes a member visible to any code. This is the default visibility for members in Kotlin.
    // public está disponível para todos.
    // Em Kotlin, tudo é public, caso não se coloque nível de visibilidade.
//------------------------------------------------------------------------------------------------------------
// private: cannot be accessed from outside the class.
//------------------------------------------------------------------------------------------------------------
// protected: restricts the visibility of a member to the containing class and its subclasses.
    // ou seja, para acessar membros protected é através de herança.
//------------------------------------------------------------------------------------------------------------
// internal: restricts the visibility of a member to the same module. A module means a group of files that are compiled together.
    // disponível dentro do mesmo módulo. Logo, não estará disponível se for importado para outro módulo.
//------------------------------------------------------------------------------------------------------------
// https://www.geeksforgeeks.org/kotlin-visibility-modifiers/
// https://www.programiz.com/kotlin-programming/visibility-modifiers
//------------------------------------------------------------------------------------------------------------


// Variável protected só faz sentido no contexto de classe, por isso não consegue criar aqui.
//protected val variavelNaoSuportadaAqui = 1

// o mesmo ocorre com funções...
//protected fun funcaoNaoSuportadaAqui() = 1


// a classe só terá subtipos se estiver marcada como 'open'
// (em Java é o oposto. Marca-se 'final' para nao permitir herança)
open class Base() {
    var a = 1                 // public by default
    private var b = 2         // private to Base class
    protected open val c = 3  // visible to the Base and the Derived class
    protected fun e() { }     // visible to the Base and the Derived class
    internal val d = 4        // visible inside the same module

    fun imprimirB(): Int { return b }

    fun imprimirC(): Int { return c }

}

class Derived: Base() {
    // a, c, d, and e() of the Base class are visible
    // b is not visible
    override val c = 9        // c is protected

    fun imprimirCderived(): Int { return c }

}


// ============================
fun main() {

    val base = Base()
    println("imprime a: " + base.a) // conseguimos acessar pois está public

//    println(base.b) // Nao conseguimos acessar pois está private na classe
    // Se quiser imprimir, usar o método da classe
    println( "imprime b: " +base.imprimirB())

//    println(base.c) // Nao conseguimos acessar pois está protected na classe
    // Se quiser imprimir, usar o método da classe
    println( "imprime c: " +base.imprimirC())

//    println(base.e()) // Nao conseguimos acessar pois está protected na classe

    println("imprime d: " + base.d) // Conseguimos acessar pois está internal (visível no mesmo module)


    // -------------------------------------------------------
    val derived = Derived()
//    println(derived.c) // Nao conseguimos acessar pois está protected na classe
    // Se quiser imprimir, usar o método da classe
    println( "imprime c (Derived): " +derived.imprimirCderived())


}