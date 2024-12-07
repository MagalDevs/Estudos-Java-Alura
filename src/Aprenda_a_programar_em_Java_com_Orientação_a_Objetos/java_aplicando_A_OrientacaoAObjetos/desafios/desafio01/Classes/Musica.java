package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_aplicando_A_OrientacaoAObjetos.desafios.desafio01.Classes;

public class Musica {
    String titulo;
    String artista;
    String anoLancamento;
    double avaliacao;
    int totalAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota){
        avaliacao += nota;
        totalAvaliacoes ++;
    }

    double pegaMedia(){
        return avaliacao / totalAvaliacoes;
    }
}
