package java_aplicando_A_OrientacaoAObjetos.aulas.aula4;

import java_aplicando_A_OrientacaoAObjetos.aulas.aula4.Classes.Episodio;
import java_aplicando_A_OrientacaoAObjetos.aulas.aula4.Classes.Filme;
import java_aplicando_A_OrientacaoAObjetos.aulas.aula4.Classes.Serie;
import java_aplicando_A_OrientacaoAObjetos.aulas.aula4.calculadora.CalculadoraDeTempo;
import java_aplicando_A_OrientacaoAObjetos.aulas.aula4.calculadora.FiltroRecomendacao;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("O Poderoso Chefão");
        filme.setAnoDeLancamento(1972);
        filme.setDiretor("Francis Ford Coppola");
        filme.setDuracaoEmMinutos(180);

        filme.exibeFichaTecnica();
        filme.avalia(5);
        filme.avalia(4);
        filme.avalia(5);
        System.out.println("Média: " + filme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodios(10);
        lost.setMinutosPorEpisodio(40);
        System.out.println("Duração: " + lost.getDuracaoEmMinutos());

        Filme divertidamente = new Filme();
        divertidamente.setNome("Divertidamente");
        divertidamente.setAnoDeLancamento(2015);
        divertidamente.setDiretor("Pete Docter");
        divertidamente.exibeFichaTecnica();
        divertidamente.setDuracaoEmMinutos(95);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(divertidamente);
        calculadora.inclui(lost);
        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);
    }
}
