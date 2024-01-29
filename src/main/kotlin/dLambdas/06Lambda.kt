package dLambdas

// funcao run

    //Context object   :    this
    //Return value     :    lambda result

// ‘run’ function can be said as the combination of ‘let’ and ‘with’ functions.
// Used when the object lambda contains both initialization and the computation of the return value.
// Using run we can perform null safety calls as well as other computations.


data class Casa(var endereco: String = "", var num: Int = 0)

fun main() {

    var casa = Casa()

    // diferentemente do apply, o run não retorna o próprio objeto
    casa.run {
        endereco = "Rua ABC"
        num = 1544
    }
    println(casa)
    println(casa.endereco)
    println(casa.num)
    println("--------------------------")

    // ------------
    // como apply retorna o próprio objeto, neste caso podemos usar o .num para acessar o atributo
    var casa02 = Casa()

    println(
        casa02.apply {
        endereco = "Avenida DEF"
        num = 1320
        }.num
    )

    println(casa02.endereco)







}

