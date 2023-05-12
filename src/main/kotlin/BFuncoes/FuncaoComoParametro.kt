package BFuncoes

// Passando funcões como parâmetros:

fun calcularLucro (receita: Double, custo: Double, functionParametro: (Double, Double) -> Double): Double {
                                                        // recebe dois Doubles e retorna um Double
    return functionParametro(receita, custo)
                // Portanto, quando chamarmos calcularLucro,
                // na verdade iremos chamar a funcao functionParametro que foi passada como parametro
}
        // Ao passarmos uma funcao para outra funcao, isso abre um conjunto de possibilidades.


class OperacaoEmpresa {
    // funcao dentro de classe
    fun calcLucro(receita: Double, custo: Double): Double {
        return receita - custo
    }
}

// funcao top level
fun calcLucro(receita: Double, custo: Double): Double {
    return receita - custo
}

// -------
fun main() {
    // passando uma funcao que está dentro de uma classe
    println(calcularLucro(2000.00, 1500.00, OperacaoEmpresa()::calcLucro))

    // passando uma funcao top level (que está fora da classe)
    println(calcularLucro(2000.00, 1500.00, ::calcLucro))

}
