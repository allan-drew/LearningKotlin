package cClassesAndObjetos

// Encadeando chamadas de funcoes


class PerfilMusical {

    private var ouvintesMensais: Int = 0 //variavel de instancia, que pertence ao objeto

    fun adicionarOuvintes (vararg numOuvintes: Int): PerfilMusical { //retornando PerfilMusical
        numOuvintes.forEach { ouvintesMensais += it }
        return this //como estamos retornando PerfilMusical, ao usar o this estamos retornando o PerfilMusical atual
    }

    fun diminuirOuvintes (vararg numOuvintes: Int): PerfilMusical {
        numOuvintes.forEach { ouvintesMensais -= it }
        return this
    }

    fun limparOuvintes(): PerfilMusical {
        ouvintesMensais = 0
        return this
    }

    fun print(): PerfilMusical {
        println(ouvintesMensais)
        return this
    }

    fun obterNumOuvintes(): Int {
        return ouvintesMensais
    }

}


// ------------------------------------------
fun main() {

    val perfil1 = PerfilMusical()
    perfil1.adicionarOuvintes(3, 6, 10).diminuirOuvintes(2, 4, 0).print()
    perfil1.adicionarOuvintes(3, 5).print()
    perfil1.adicionarOuvintes(5, 10, 2)
    perfil1.print()

    perfil1.diminuirOuvintes(8).print()

    perfil1.limparOuvintes()
    println(perfil1.obterNumOuvintes())


}

