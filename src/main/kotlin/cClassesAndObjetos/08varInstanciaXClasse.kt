package cClassesAndObjetos

// em JAVA, quando queremos definir variáveis e métodos pertencentes à classe
// (e não a uma instância em particular), usamos static.
// Portanto, a variável será a mesma em todas as instâncias.

// em KOTLIN, para fazer isso, colocamos as variáveis e métodos fora da classe, diretamente dentro do arquivo.

// variável top level. Internamente é compilada como membro pertencente a uma classe interna.
// associado ao static em Java.
val diretoNoArquivo = "Boa tarde, "

// funcao top level. Internamente é compilada como membro pertencente a uma classe interna.
// associado ao static em Java.
fun funcaoTopLevel() {
    val variavelLocal = "Fulano" // variavel disponível apenas dentro da funcao
    println("$diretoNoArquivo $variavelLocal")
}



class CarroAlemao {
    var velocidadeMaxima: Double = 0.00 // variável de instância (pertence a cada objeto em particular)

    // podemos também declarar membros estáticos usando @JvmStatic, ou seja, sem usar variaveis e funcoes toplevel:
    // (entretando, em kotlin, é um bom artifício usar as top-level)
    companion object {
        @JvmStatic val velocidadeLimitada: Double = 190.00 // membro static, pertence a classe.
    }

}



// ------
fun main() {
    println(diretoNoArquivo) // acesso direto sem ter uma instancia associada
//    println(variavelLocal) // Erro, pois a variável é apenas local

    funcaoTopLevel() // acesso direto sem ter uma instancia associada

//    println(velocidadeMaxima) // Erro, pois precisamos de uma instancia associada
    val carro1 = CarroAlemao()
    println(carro1.velocidadeMaxima) // conseguimos acesso, pois temos uma instancia associada
    carro1.velocidadeMaxima = 220.00
    println(carro1.velocidadeMaxima)

    println(CarroAlemao.velocidadeLimitada)



}