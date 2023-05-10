package BFuncoes

// Funcionalidade do Kotlin

// O uso de argumentos nomeados além de tornar a chamada à função mais legível,
// permite que os parâmetros sejam passados numa ordem diferente do que foi declarado na função.

fun atacantesFlamengo (camisa10: String, camisa9: String): String {
    return "O $camisa9 geralmente faz mais gols do que o $camisa10"
}

fun main() {
    println(atacantesFlamengo("Gabi", "Pedro"))
    println(atacantesFlamengo(camisa10 = "Gabi", camisa9 = "Pedro"))
    println(atacantesFlamengo(camisa9 = "Pedro", camisa10 = "Gabi"))

}
