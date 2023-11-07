package veiculo;

public class TesteDoVeiculo {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        moto.acelerar();
        moto.frear();

        carro.acelerar();
        carro.frear();
    }
}
