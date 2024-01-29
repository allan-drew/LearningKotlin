package bFuncoes

// Passando funcões como parâmetros!
// Ao passarmos uma funcao para outra funcao, isso abre um conjunto de possibilidades.

// Quando chamarmos lucroCal, na verdade iremos chamar a funcao functionParametro que foi passada como parametro!
fun lucroCal (receita: Double,
              custo: Double,
              functionParametro: (Double, Double) -> Double): Double {

    return functionParametro(receita, custo)

}


//
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


// ------------------------------------------------------------------------------------
fun main() {
    // chamando uma funcao que está dentro da classe OperacaoEmpresa
    println(lucroCal(2000.00, 1500.00, OperacaoEmpresa()::calcLucro))

    // chamando uma funcao top level (que está fora da classe)
    println(lucroCal(2000.00, 1500.00, ::calcLucro))

}

