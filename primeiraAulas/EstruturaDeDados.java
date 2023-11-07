package primeiraAulas;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        // Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Paulo");
        nomes.add("Ricardo");
        nomes.add("Loiro");
        nomes.add("Tico");

        System.out.println(nomes.get(2));

        for (String nome : nomes) {
            System.out.println("O nome é " + nome);
        }

        nomes.forEach(nome -> System.out.println("O nome é => " + nome));

    }
}
