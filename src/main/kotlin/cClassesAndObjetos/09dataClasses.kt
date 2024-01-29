package cClassesAndObjetos

// Pode surgir uma situação em que você precise criar uma classe centrada em dados.
// Nesses casos, você pode marcar a classe como 'data' para criar uma classe de dados

// Kotlin Data Class Requirements:
        //O construtor primário deve ter pelo menos um parâmetro.
        //Os parâmetros do construtor primário devem ser marcados como val ou var
        //A classe não pode ser open, abstract, inner ou sealed.
        //A classe pode estender outras classes ou implementar interfaces.

data class User(val name: String, val age: Int)

class Usuario(val nome: String, val idade: Int)



fun main() {

    val usuario001 = User("Joaozinho", 30)
    println("nome = ${usuario001.name}")
    println("idade = ${usuario001.age}")
    println()

    // When you declare a data class, the compiler automatically generates several functions such as
    // toString(), equals(), hashcode() etc behind the scenes.

    // Sometimes we need to copy an object, with some change in some of its properties keeping all others unchanged.
    // neste caso, vamos manter a idade a mesma (30) e mudar o nome (Mariazinha)
    // using copy function to create an object...
    val usuario002 = usuario001.copy(name = "Mariazinha")
    println("nome = ${usuario002.name}")
    println("idade = ${usuario002.age}")
    println()

    // data class já implementa um toString()
    // The toString() function returns a string representation of the object.
    println(usuario001.toString())
    println(usuario002.toString())
    println()

    // data class já implementa um hashCode()
    // The hashCode() method returns hash code for the object.
    // If two objects are equal, hashCode() produces the same integer result.
    println("hascode do usuario001 => ${usuario001.hashCode()}")
    println("hascode do usuario002 => ${usuario002.hashCode()}")
    println()

    // data class já implementa um copy()
    //copiando o usuario002 para o usuario003 (eles terao o mesmo hascode, portanto)
    val usuario003 = usuario002.copy()
    println("hascode do usuario002 => ${usuario002.hashCode()}")
    println("hascode do usuario003 => ${usuario003.hashCode()}")
    println()

    // The equals() returns true if two objects are equal (has same hashCode()).
    if (usuario002.equals(usuario003)) {
        println("usuario002 e usuario003 sao iguais? ${usuario002.equals(usuario003)}")
    } else {
        println("usuario002 e usuario003 nao sao iguais")
    }


    if (usuario001.equals(usuario002)) {
        println("usuario001 e usuario002 sao iguais? ${usuario001.equals(usuario002)}")
    } else {
        println("usuario001 e usuario002 nao sao iguais")
    }
    println()

    println("=========================================================")

    // ===========

    // data class VERSUS class:

    // data class
    val user0001 = User("Maria", 20)
    val user0002 = User("Maria", 20)
    println(user0001 == user0002) // equals implementado, resultado true
    println(user0001 === user0002) // compara as referencias, resultado false, portanto.
    println("---")

    // class
    val usuario0001 = Usuario("Pedro", 23)
    val usuario0002 = Usuario("Pedro", 23)
    println(usuario0001 == usuario0002) // equals nao implementado, resultado false


    println("---")


    // class
    val usuario01 = Usuario("Pedrinho", 19)
    println(usuario01.toString()) // nao implementado em class, só em data class

//    val usuario02 = usuario01.copy(name = "Felipinho") // Unresolved reference: copy
    val usuario02 = Usuario("Felipinho", 20)


    // destructuring data class VS class:
    val (name, age) = user0001 // passando data class
    println("$name, $age")

//    Kotlin: Destructuring declaration initializer of type Usuario must have a 'component1()' function
//    val (nome, idade) = usuario0001 // passando class - ERRO
//    println("$nome, $idade")


}

