package cClassesAndObjetos

// Since enum class in Kotlin defines a new type,
// this class type can have its own properties and functions.


enum class Dias(val isWeekend: Boolean = false){
                // The properties can be given a default value, however,
                // if not provided, then each constant should define its own value for the property.
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true);

    //In the case of functions, they are usually defined within the companion objects so that they
    // do not depend on specific instances of the class.
                            // **** However, they can be defined without companion objects also.
    companion object {
        fun today(obj: Dias): Boolean {
            return obj.name.compareTo("SATURDAY") == 0 || obj.name.compareTo("SUNDAY") == 0
        }
    }

}


// ==============================================================================
fun main(){

    for(day in Dias.values()) {
        println("${day.ordinal} = ${day.name} is weekend ->  ${day.isWeekend}")
    }
    println()

    val hoje = Dias.MONDAY;
    println("Is today a weekend? ${Dias.today(hoje)}")
    println()


    // -----------------------------------------------
    // Usage of when expression with enum class –
    // A great advantage of enum classes in Kotlin comes into play when they are combined with the when expression.

    // A vantagem é que as classes enum restringem o valor que um tipo pode assumir, portanto,
    // quando usado com a expressão when e a definição para todas as constantes são fornecidas,
    // a necessidade da cláusula else é completamente eliminada.
    when(hoje){
        Dias.SUNDAY -> println("Today is Sunday")
        Dias.MONDAY -> println("Today is Monday")
        Dias.TUESDAY -> println("Today is Tuesday")
        Dias.WEDNESDAY -> println("Today is Wednesday")
        Dias.THURSDAY -> println("Today is Thursday")
        Dias.FRIDAY -> println("Today is Friday")
        Dias.SATURDAY -> println("Today is Saturday")
        // Adding an else clause will generate a warning
    }


}