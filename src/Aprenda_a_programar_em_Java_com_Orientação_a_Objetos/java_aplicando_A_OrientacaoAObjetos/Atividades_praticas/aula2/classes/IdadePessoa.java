package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_aplicando_A_OrientacaoAObjetos.Atividades_praticas.aula2.classes;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade() {
        if (idade >= 18) {
            System.out.println("A pessoa " + nome + " é maior de idade.");
        } else {
            System.out.println("A pessoa " + nome + " é menor de idade.");
        }
    }
}
