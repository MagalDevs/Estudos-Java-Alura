package java_aplicando_A_OrientacaoAObjetos.aulas.aula3.calculadora;

import java_aplicando_A_OrientacaoAObjetos.aulas.aula3.Classes.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
