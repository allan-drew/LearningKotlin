package BFuncoes

// Java é totalmente centrado em classe e não suporta o conceito de função top-level.
// Isso não ocorre em Kotlin. Logo, podemos criar funcoes top-level sem necessidade de uma classe só para colocar uma funcao
// (*** embora a nível de compilador seja gerada uma classe ***)
fun min (a: Int, b: Int): Int {
    return if (a<b) a else b
}

// ========================================================
fun main() {

    println("O menor valor é ${min(4,10)}")



}


