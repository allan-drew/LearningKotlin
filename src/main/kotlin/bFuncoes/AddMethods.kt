package bFuncoes


// Temos possibilidade de incluir novos métodos a uma classe já existente, sem precisar de recorrer a herança

// incluindo um método para obter segundo elemento de uma lista:
// criando o método/funcionalidade secondOrNull()
fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null
    // se o tamanho da lista for maior do que 2, temos de fato um segundo elemento existente.
    // get(1) --> pega o segundo elemento
    // null --> retorna null caso o tamanho não seja >= 2

// E --> significa Elemento...poderia ser qualquer outra letra


fun main() {

    val list = listOf("João", "Maria", "Pedro")
    println(list.secondOrNull())

    val list02 = listOf("Renato")
    println(list02.secondOrNull())

}
