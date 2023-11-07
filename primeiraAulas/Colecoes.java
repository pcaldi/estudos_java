package primeiraAulas;

import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Paulo", 10);
        notas.put("Ricardo", 9);
        notas.put("Tico", 10);
        notas.put("Loiro", 10);

        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("Nome: " + key + " - Nota: " + value);
        }
    }
}
