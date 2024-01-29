package aFundamentos

fun main() {


    // ===========================================================================
    // NUMBERS

    // Integers ==> Byte, Short, Int, Long

    // Byte: - 128 até 127
    val num1: Byte = 127
    //val num2: Byte = 128  // ERRO!


    // Short: -32768 até 32767
    val num5: Short = 32767
    //val num6: Short = 32768 // ERRO


    // Int: -2,147,483,648 até 2,147,483,647
    val num7: Int = 2_147_483_647   //underline to facilitate reading
    //val num8: Int = 2_147_483_648 // ERRO

    val num9 = 40 // kotlin infere Int
    println("o tipo da variavel num9 é : " + num9.javaClass.simpleName)


    // Long: -9,223,372,036,854,775,808 até 9,223,372,036,854,775,807
    val num10: Long = 9_223_372_036_854_775_807
    println("o tipo da variavel num10 é : " + num10.javaClass.simpleName)

    println("byte minimo "+ Byte.MIN_VALUE)
    println("byte maximo "+ Byte.MAX_VALUE)
    println("int minimo "+ Int.MIN_VALUE)
    println("int maximo "+ Int.MAX_VALUE)
    println()


    // Koltin also provide UNSIGNED integer types...unsigned integers can only represent positive numbers and zero
    // UByte, UShort, UInt, ULong
    val num11: UInt = 150u
    //val num12: ULong = -200u


    // -----------------------------
    // Floating-point types:
    // Float reflects the IEEE 754 single precision
    // Double reflects double precision.

    // Float Decimal digits --> 6-7
    // Double Decimal digits --> 15-16

    // For variables initialized with fractional numbers, the compiler infers the Double type:
    val pi = 3.14 // Double
    val e = 2.7182818284 // Double
    println(e)

    // To explicitly specify the Float type for a value, add the suffix f or F
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817
    println(eFloat)

    var someFloat: Float = 10f
    println("imprime someFloat: " + someFloat)

    // There are no implicit widening conversions
    // example: a function with a Double parameter can be called only on Double
    fun printSomeNumber(number: Double) {
        println(number)
    }

    // printSomeNumber(1) // ERRO
    printSomeNumber(1.0)
    //printSomeNumber(1.0f) // ERRO

    println()

    // smaller types are NOT implicitly converted to bigger types
    val num12: Byte = 1
    // val num13: Int = num12 // implicitly => ERROr
    val num14: Int = num12.toInt() // OK

    // arithmetical operations are overloaded for appropriate conversions
    val num15 = 10L + 5
    println(num15.javaClass.simpleName) // Long + Int => Long

    //
    println(2 is Int) // true, pois o literal 2 é inteiro por padrão
    println(2147483648 is Long) // true, pois o literal vira Long se passar do tamanho do inteiro
    println(1.0 is Double) // true, pois 1.0 é Double por padrão
    //

    // Division between integers returns integer
    val x = 10/3
    println("x é igual a --> " + x) // fractional part discarded
    println( x == 3) // true

    // to return a floating, convert one of the arguments
    val x2 = 10.toDouble() / 3
    println("x2 é igual a -->  " + x2)
    // println(x2 == 3) // ERROR: '==' cannot be applied to 'Double' and 'Int'
    println(x2 == 3.1) // false
    println(x2 == 3.3333333333333335) // true
    println()



    // ===========================================================================
    // Char types (Characters):
    // Character literals go in single quotes: '1'.

    val aChar: Char = 'a'
    println(aChar)

    // Special characters start from an escaping backslash \
    print("oi \n") // \n new line
    print("oi")

    val letter: Char = 'k'
    println("$letter")
    println(letter)
    println()


    // ===========================================================================
    // booleans:
    val myTrue: Boolean = true
    val myFalse: Boolean = false

    // or
    println(myTrue || myFalse) // true

    // and
    println(myTrue && myFalse) // false

    // not
    println(!myTrue) // false

    // Boolean has a nullable counterpart 'Boolean?' that also has the null value.
    val boolNull: Boolean? = null
    println(boolNull)
    // val boolNull2 = Boolean = null // ERROR


    // Check Strings in 03KotlinStrings
    // Check Arrays in eCollections

}

