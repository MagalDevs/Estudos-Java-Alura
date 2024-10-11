package java_aplicando_A_OrientacaoAObjetos.aulas.Aula2;


import java_aplicando_A_OrientacaoAObjetos.aulas.Aula2.classes.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("O poderoso chefão");
        filme.setAnoDeLancamento(1972);
        filme.setDuracaoEmMinutos(175);

        filme.exibeFichaTecnica();

        filme.avalia(10);
        filme.avalia(9.5);
        filme.avalia(8.5);

        System.out.println("Média das avaliações: " + filme.pegaMedia());
    }
}
