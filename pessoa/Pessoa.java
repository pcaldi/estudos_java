package pessoa;

public class Pessoa {
    // nome, idade , cpf
    // tipo nomeDaVariável
    private String nome;
    private int idade;
    private String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    String dadosDaPessoa() {
        return "Seu nome é " + nome + " com a idade de " + idade + " anos do cpf " + cpf;
    }
}
