package java_aplicando_A_OrientacaoAObjetos.aulas.Aula1.classes;


public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.nome = "O poderoso chefão";
        filme.anoDeLancamento = 1972;
        filme.duracaoEmMinutos = 175;

        filme.exibeFichaTecnica();

        filme.avalia(10);
        filme.avalia(9.5);
        filme.avalia(8.5);

        System.out.println("Média das avaliações: " + filme.pegaMedia());
    }
}
