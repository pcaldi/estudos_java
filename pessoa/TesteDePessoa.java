package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Tico");
        pessoa1.setIdade(7);
        pessoa1.setCpf("11133344455");

        Aluno aluno = new Aluno();
        aluno.setNome("Loiro");
        aluno.setIdade(25);
        aluno.setCpf("111333444455");
        aluno.setMatricula("1234");
        System.out.println(aluno.dadosDaPessoa());

        Professor professor = new Professor();
        professor.setCpf("11122233344");
        professor.setIdade(59);
        professor.setNome("Paulo");
        professor.setSalario(3000);

        System.out.println(professor.dadosDaPessoa());

    }
}
