package primeiraAulas;
/*
 * PrimeiraClasse - Nome da minha classe
 * public - tipo de acesso da classe
 * class - tipo da classe
 */

public class PrimeiraClasse {

    public static void main(String[] args) {
        /*
         * Valores/Números (int, double, float, long)
         * Texto (String)
         * Booleano (boolean)
         */
        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 2.2;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 31212123333333L;
        String dadoDoTipoString = "Colocar o texto sempre com aspas duplas";
        boolean dadoDoTipoBoolean = false;

        // if - else
        if (dadoDoTipoInt == 10) {
            // sysout - System.out.println
            System.out.println("==> Entrou no if");
        } else {
            System.out.println("==> Entrou no else");
        }

        // While (Equanto uma ação for verdadeira, faça essa ação.)
        int valorInicial = 0;
        while (valorInicial < 10) {
            System.out.println("O valor inicial é: " + valorInicial);
            valorInicial++;
        }
        System.out.println("Saiu do While!");

        // FOR (faz um loop)
        System.out.println("==== Inicio do FOR ===");
        for (int i = 0; i < 10; i++) {
            System.out.println("O valor de i: " + i);
        }
        System.out.println("=== Saiu do FOR ===");

    }
}
