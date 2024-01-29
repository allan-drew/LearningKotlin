package hAvancado02

// https://www.alura.com.br/artigos/criando-anotacoes-no-java

annotation class Positivo
annotation class NaoVazio

class Pessoa(id: Int, nome: String) {
    @Positivo
    var id: Int = id

    @NaoVazio
    var nome: String = nome
}


fun getValue(objeto: Any, atributo: String): Any {
    val field = objeto.javaClass.getDeclaredField(atributo)
    val isAccessibleOriginal = field.isAccessible

    field.isAccessible = true
    val value = field.get(objeto)
    field.isAccessible = isAccessibleOriginal

    return value
}


fun validar(objeto: Any): List<String> {
    val msgs = ArrayList<String>()

    objeto::class.members.forEach { member ->
        member.annotations.forEach { annotation ->
            val value = getValue(objeto, member.name)
            when (annotation) {
                is Positivo ->
                    if (value !is Int || value <= 0) {
                        msgs.add("O valor '$value' não é um número positivo!")
                    }
                is NaoVazio ->
                    if (value !is String || value.trim().isEmpty()) {
                        msgs.add("O valor '$value' não é uma string válida!")
                    }
            }
        }
    }
    return msgs
}

fun main(args: Array<String>) {

    val obj1 = Pessoa(1, "Chico")
    println(validar(obj1))

    val obj2 = Pessoa(-1, "")
    println(validar(obj2))
}

