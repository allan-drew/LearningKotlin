package dLambdas

// Pq usar lambda ?
// Usando lambda VERSUS Sem usar lambda:

//-----
interface Operacao {
    fun executar(a: Int, b: Int): Int
}

// classe que implementa a interface Operacao
class Multiplicacao: Operacao {
    override fun executar(a: Int, b: Int): Int {
        return a * b
    }
}
//-----


class Calculadora {

    // por padrão, o método calcular() faz a soma de 'a' com 'b':
    fun calcular(a: Int, b: Int): Int {
        return a + b
    }

    // ----------
    // Podemos ter tbm outro método calcular() que irá realizar alguma outra operacao em 'a' e 'b'.

    // Fazendo SEM LAMBDA (necessário ter uma interface e uma classe que implementa a interface):
    fun calcular(a: Int, b: Int, operacao: Operacao): Int {
        return operacao.executar(a, b)
    }

    // Fazendo COM LAMBDA (não precisamos da interface e da classe):
    fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
                                // o parâmetro 'operacao é uma funcao lambda.
        return operacao(a, b)
    }
    // ----------


}


fun main() {

    val calculadora = Calculadora()

    val resultado1 = calculadora.calcular(3, 4) // por padrão temos a soma de 'a' com 'b'

    // sem lambda (usando interface e classe que implementa a interface):
    val resultado2 = calculadora.calcular(3, 4, Multiplicacao())

    // com lambda:
    val subtracao = { a: Int, b: Int -> a - b }
    val resultado3 = calculadora.calcular(3, 4, subtracao)


    println("resultado 1: $resultado1; resultado 2: $resultado2; resultado 3: $resultado3")


}