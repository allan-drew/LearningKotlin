package fOOP.heranca

open class Moto (val velocidadeMaxima: Int = 200, var velocidadeAtual: Int = 0) {

    // Método para alterar a velocidade atual.
    // O método será transmitido por heranca porém não será acessado diretamente, por isso o protected.
    protected fun alterarVelocidade (velocidade: Int) {
        val novaVelocidade = velocidadeAtual + velocidade

        // validacao para não permitir ultrapassar a velocidade máxima e nem ter velocidade negativa:
        velocidadeAtual = when(novaVelocidade) {
            in 0..velocidadeMaxima -> novaVelocidade // se estiver no intervalo, retorna novaVelocidade
            in velocidadeMaxima+1..Int.MAX_VALUE -> velocidadeMaxima // se ultrapassar velocidadeMaxima, retorna a propria velocidade maxima
            else -> 0 // retorna 0 se a velocidade for negativa
        }

    }

    open fun acelerar() {
        alterarVelocidade(10) // acelera a moto de 10 em 10km/h
    }

    open fun frear() {
        alterarVelocidade(-10)
    }

    override fun toString(): String {
        return "A velocidade atual é $velocidadeAtual km/h"
    }


}

