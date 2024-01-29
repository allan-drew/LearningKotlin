package bFuncoes;

import kotlin.collections.CollectionsKt;
import java.util.ArrayList;

// chamando a funcao secondOrNull criada em Kotlin no arquivo AddMethods
public class ChamandoFuncaoKotlin {

    public static void main(String[] args) {
        ArrayList<String> list01 = CollectionsKt.arrayListOf("Joao Gomes", "Vidal", "Thiago Maia");

        // Para cada arquivo kotlin criado,
        // internamente é gerada uma classe com o nome do arquivo e Kt no final
        // Portanto, temos uma classe chamada AddMethodsKt
        System.out.println(AddMethodsKt.secondOrNull(list01));
                    // The created method is static, so:
                    // You can call a static method without creating an object of the class!
    }

}
