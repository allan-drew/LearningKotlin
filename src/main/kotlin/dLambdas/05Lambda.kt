package dLambdas

// funcao let:
    // Usa it como referencia do objeto
    // É muito usada com uma safe call para executar um código somente se uma referência não for nula.

        //Context object  :   it
        //Return value    :   lambda result

// let function is often used to provide null safety calls.
// Use safe call operator(?.) with ‘let’ for null safety.
// It executes the block only with the non-null value.

fun main() {

    var campoFormulario: String? = null
    campoFormulario?.let { println(it) } // statement will NOT execute as campoFormulario is null.
    // let function simply avoid the code block. Solving the biggest nightmare of programmers – NullPointerException.

    campoFormulario = "Belo Horizonte"
    campoFormulario?.let { println(it) } // statement will execute as campoFormulario is NOT null.


    // ==========================================================================================
    val listaAleatoria: List<String?> = listOf("A", null, "B", null, "C", null)

    for (item in listaAleatoria) {
        item?.let { print("$it / ") }
    }


}
