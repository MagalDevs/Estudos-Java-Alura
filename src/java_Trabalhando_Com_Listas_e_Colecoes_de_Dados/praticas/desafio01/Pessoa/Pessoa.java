package java_Trabalhando_Com_Listas_e_Colecoes_de_Dados.praticas.desafio01.Pessoa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa: " + nome + ", " + idade;
    }
}
