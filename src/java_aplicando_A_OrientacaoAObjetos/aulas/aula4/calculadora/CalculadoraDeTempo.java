package java_aplicando_A_OrientacaoAObjetos.aulas.aula4.calculadora;

import java_aplicando_A_OrientacaoAObjetos.aulas.aula4.Classes.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
