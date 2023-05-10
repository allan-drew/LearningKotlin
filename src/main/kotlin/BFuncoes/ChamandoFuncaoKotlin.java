package BFuncoes;

import kotlin.collections.CollectionsKt;
import java.util.ArrayList;

public class ChamandoFuncaoKotlin {

    public static void main(String[] args) {
        // chamando a funcao secondOrNull criada em Kotlin no arquivo AddMethods
        ArrayList<String> list01 = CollectionsKt.arrayListOf("Joao Gomes", "Vidal", "Thiago Maia");

        // Para cada arquivo kotlin criado, internamente é gerada uma classe com o nome do arquivo e Kt no final
        // Portanto, temos uma classe chamada AddMethodsKt
        System.out.println(AddMethodsKt.secondOrNull(list01));
                    // o método criado é do tipo static, portanto:
                        // A static method is a method that belongs to a class rather than an instance of a class.
                        // This means you can call a static method without creating an object of the class
    }

}
