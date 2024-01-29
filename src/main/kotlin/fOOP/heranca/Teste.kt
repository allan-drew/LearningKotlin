package fOOP.heranca

fun main() {

    val moto001 = CB1000R()
    println(moto001)

    moto001.acelerar()
    println(moto001)

    moto001.ligarTurbo()
    moto001.acelerar()
    println(moto001)

    moto001.frear()
    println(moto001)


}