package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.desafio03.d02.classes;

public class Titulo {
    private String nome;
    private int ano;
    private int duracaoMinutos;

    public Titulo(String nome, int ano, int duracaoMinutos) {
        this.nome = nome;
        this.ano = ano;
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", duracaoMinutos=" + duracaoMinutos +
                '}';
    }
}
