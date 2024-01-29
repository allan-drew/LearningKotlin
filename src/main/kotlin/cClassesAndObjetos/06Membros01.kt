package cClassesAndObjetos

class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}


// -----
fun main() {
    var nascimento: Data = Data(dia = 3, mes = 10, ano = 1990)

    // sem reaproveitar
    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")

    // sem reaproveitar
    with(nascimento) {
        println("${dia}/${mes}/${ano}")
    }

    // reaproveitando código (funcao formatar)
    println(nascimento.formatar())

    // reaproveitando código (funcao formatar)
    nascimento.dia = 13 // alterando o dia
    println(nascimento.formatar())


}