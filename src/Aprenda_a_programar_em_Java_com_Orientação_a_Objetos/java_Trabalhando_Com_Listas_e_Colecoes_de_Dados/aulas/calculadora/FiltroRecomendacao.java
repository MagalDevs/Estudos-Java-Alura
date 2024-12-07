package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_Trabalhando_Com_Listas_e_Colecoes_de_Dados.aulas.calculadora;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
