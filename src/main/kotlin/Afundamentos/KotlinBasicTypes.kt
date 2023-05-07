package Afundamentos

fun main() {


    // ==============================================
    // Integer types:

    //    https://kotlinlang.org/docs/numbers.html#integer-types

//    BYTE: - 128 até 127
    val num1: Byte = 127
    //val num2: Byte = 128  // ERRO!
    val num3: Byte = -128
    //val num4: Byte = -129 // ERRO!

// Short: -32768 até 32767
    val num5: Short = 32767
//    val num6: Short = 32768 // ERRO

//  Int: -2,147,483,648 até 2,147,483,647
    val num7: Int = 2_147_483_647   //underline para facilitar leitura
//    val num8: Int = 2_147_483_648

//    Long: -9,223,372,036,854,775,808 até 9,223,372,036,854,775,807

    println(Byte.MIN_VALUE)
    println(Byte.MAX_VALUE)
    println(Int.MIN_VALUE)
    println(Int.MAX_VALUE)
    println()

    // ==============================================

//    Floating-point types
    // Float reflects the IEEE 754 single precision,
    // while Double reflects double precision.

//    For variables initialized with fractional numbers, the compiler infers the Double type:
    val pi = 3.24 // Double

//    To explicitly specify the Float type for a value, add the suffix f or F
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817
    println(e)
    println(eFloat)

//    Float Decimal digits --> 6-7
//    Double Decimal digits --> 15-16

    println()


    // ==============================================
    // To represent a character in Kotlin, Char types are used.
    // Character literals go in single quotes: '1'.
    val aChar: Char = 'a'
    println(aChar)

    // Special characters start from an escaping backslash \
    print("oi \n") // \n new line
    print("oi")
    println()

    val letter: Char = 'k'
    println("$letter")
    println(letter)
    println()


    // ==============================================
    // booleans
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    // or
    println(myTrue || myFalse)

    // and
    println(myTrue && myFalse)

    // not
    println(!myTrue)

    println()

    // ==============================================

    println(2 is Int) // true, pois o literal 2 é inteiro por padrão
    println(2147483648 is Long) // true, pois o literal vira Long se passar do tamanho do inteiro
    println(1.0 is Double) // true, pois 1.0 é Double por padrão



}