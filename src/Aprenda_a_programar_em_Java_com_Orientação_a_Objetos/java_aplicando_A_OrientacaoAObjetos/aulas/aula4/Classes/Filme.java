package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_aplicando_A_OrientacaoAObjetos.aulas.aula4.Classes;

import Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_aplicando_A_OrientacaoAObjetos.aulas.aula4.calculadora.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }
}
