package conta;

public class TestContaBancaria {

    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();

        contaBancaria1.setNumero("1234");
        contaBancaria1.setTitular("Loiro");

        contaBancaria1.depositar(200);
        contaBancaria1.sacar(75);
    }
}
