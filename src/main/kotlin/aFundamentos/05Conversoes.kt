package aFundamentos


fun main() {

    // In Kotlin everything is an object.
    // Therefore, in the objects themselves we have specific methods for conversions

    //---------------------------------------------------------------------------------
    val a = 1
    val newIntegerA = a + 1
    println("$newIntegerA is ${newIntegerA.javaClass.simpleName}")

    val newStringA = a.toString() + 1
    println("$newStringA is ${newStringA.javaClass.simpleName}")

    println()
    //---------------------------------------------------------------------------------


    //---------------------------------------------------------------------------------
    println("1.9".toDouble() + 3)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull() ?: 0) // Elvis operator with 0 (in the case can't convert to Int)
    println("1".toInt() + 3)
    println()
    //---------------------------------------------------------------------------------


    //---------------------------------------------------------------------------------
    // Type check
    val valor = 1

    // Compile Time Error if compiler knows that there IS NO possibility of comparison
    // println(valor is String) // ERROR

    // If we put Any type (more generic), we can make comparison, because maybe the value is not String
    val valor1: Any = 2020
    println("valor1 é String? ${valor1 is String}") // false, because valor1 is not String

    val anotherValor1: Any = "uma String qualquer"
    println("anotherValor1 é String? ${anotherValor1 is String}") // true, because anotherValor1 IS String


    val valor2 = "abc"
    println("valor2 é String? ${valor2 is String}") // true, because its a String
    println("valor2 não é String? ${valor2 !is String}") // false, because its NOT String

    val valor3 = "ABCDEF" + 1
    println("valor3 $valor3 é String? ${valor3 is String}") // true, because its a String

    println()


    //---------------------------------------------------------------------------------
    // SMART CASTS
    // The compiler tracks the "is" checks
    // and inserts casts automatically when necessary:
    fun demo(x: Any) {
        // we passed x using Any, but...automatically cast to String or Int
        if (x is String) {
            println("The length is ${x.length} --> String") // x is automatically cast to String
        } else if (x is Int) {
            println("x + 3 is = ${x.plus(3)} --> Int") // x is automatically cast to Int
        }
    }
    demo("abcdef")
    demo(5)
    println()


    // Its possible to use when as well:
    fun demo2(y: Any) {
        // we passed x using Any, but...automatically cast to String or Int
        when(y) {
            is String -> println("The length is ${y.length} --> String")
            is Int -> println("y + 10 is = ${y.plus(10)} --> Int")
            else -> println("não identificado!")
        }
    }
    demo2("DSDSHISAIJSIAHSJ") // string
    demo2(100) // int
    demo2(50.3) // prints nao identificado ao passar em demo2
    println()

    // smart casts work only when the compiler can guarantee that the variable
    // won't change between the check and the usage



    // ---------------------------------------
    // CAST OPERATOR
    fun imprimirConceito(nota: Any) {
        when(nota as Int) {
                    // unsafe cast operator  --> as
                    // safe cast operator --> as?
                    // As we are using unsafe cast, we have Cast Error if we do not pass integer
            in 0..6 -> println("REPROVADO!")
            in 7..10 -> println("APROVADO!")
            else -> println("Nota inválida")
        }
    }

    // Cast Error. Double cannot be cast to Integer!
    // imprimirConceito(4.5)

    // If we change "as" to "as?" (safe cast operator), we can obtain "Nota inválida" when passing 4.5

    // If we use Integer, we dont get erros (even with unsafe cast operator)
    imprimirConceito(5)
    imprimirConceito(10)


}