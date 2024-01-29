package cClassesAndObjetos

// Initializer blocks:
    // The class header can't contain any runnable code.
    // If you want to run some code during object creation, use initializer blocks inside the class body.

class Apartamento (metrosQuadrados: Int, preco: Double) {
    val metrosQuadrados: Int
    val preco: Double

    // Initializer blocks are declared with the init keyword
    init {
        this.metrosQuadrados = metrosQuadrados
        this.preco = preco
    }

}


class Pessoa (_firstName: String, var age: Int) {

    var firstName: String

    // initializer block: dentro do bloco podemos colocar código de validacao, printar, etc...
    init {
        println("Executando o primeiro init....")

        // checando se o parametro passando para a funcao comeca com a letra A
        // se comecar, entao colocamos o valor do parametro _firstName na propriedade firstName
        if (_firstName.lowercase().startsWith("a")) {
            this.firstName = _firstName
            print("     O nome comeca com a letra a ou A \n")
        } else {
            // se nao comecar com a letra A, entao colocamos o valor "User" na propriedade FirstName
            this.firstName = "User"
            print("     O nome NÃO comeca com a letra a ou A \n")
        }

        println("       First Name = $firstName")
        println("       Age = $age")
    }


    // a ordem com que colocamos os blocos de inicializacao na classe será a ordem de execucao
    init {
        print("Executando o segundo init...")
    }

}



// ==================================================================================================

fun main() {

    //
    val apt001 = Apartamento(50, 180000.00)
    println("${apt001.metrosQuadrados} metros quadrados. ")
    println("R$ ${apt001.preco} reais")
    print("\n")
    println("------------------------------------------------------------------")
    //

    // Quando o objeto pessoa1 é criado, o código dentro do bloco inicializador é executado.
    val pessoa1 = Pessoa("Allan", 28)
    print("\n")
    println("------------------------------------------------------------------")

    //------------
    var pessoa2 = Pessoa("Joaozin", 21)
    print("\n")

}