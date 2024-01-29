package cClassesAndObjetos

// Na programação, às vezes surge a necessidade de um tipo ter apenas determinados valores.
// Para conseguir isso, o conceito de enumeração foi introduzido. Enumeração é uma lista nomeada de constantes.

// Em Kotlin, como em muitas outras linguagens de programação, um enum tem seu próprio tipo especializado,
// indicando que algo tem vários valores possíveis.

// Ao contrário das enumerações Java, as enumerações Kotlin são classes.

// =============================================================================
enum class Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
// =============================================================================


// =============================================================================
// Como as constantes enum são instâncias de uma classe Enum,
// as constantes podem ser inicializadas passando valores específicos para o construtor primário.
enum class Cards(val color: String) {
    Diamond("black"),
    Heart("red"),
}
// =============================================================================



// =============================================================================
fun main() {

    println("The best day of the week is ${Days.SATURDAY}")

    // Kotlin enum classes has some inbuilt properties and functions which can be used by the programmer.
    // For example, values(): This method returns a list of all the constants defined within the enum class.
    for (day in Days.values()) {
        println("${day.ordinal} = ${day.name}")
    }


    // =============================================================================
    // We can easily access the color of a card using:
    val cor = Cards.Diamond.color
    println(cor)

    val cor2 = Cards.Heart.color
    println(cor2)
    // =============================================================================


}


