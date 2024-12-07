package Aulas;

import java.util.Scanner;

public class ControlandoFluxoDaAplicacao {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if(incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado.");
        }else {
            System.out.println("Deve pagar alocação.");
        }

        //Leitura e laço de repetição
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        /*
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite seu filme favorito");
            String filme = scanner.nextLine();
            System.out.println("Qual o ano de lançamento?");
            int ano = scanner.nextInt();
            System.out.println("Diga sua avaliação para o filme(0 a 5)");
            double avaliacao = scanner.nextDouble();
            scanner.nextLine();

            media += avaliacao;

            //System.out.println(filme);
            //System.out.println(ano);
            System.out.println(avaliacao);
        }

        System.out.printf("Média dos filmes é: %.2f", (media/3));
        */
        int contador = 0;
        double avaliacao = 0;
        while(avaliacao != -1){
            System.out.println("Diga sua avaliação para o filme(0 a 5), digite -1 para parar");
            avaliacao = scanner.nextDouble();
            if (avaliacao != -1){
                media += avaliacao;
                contador++;
            }
        }
        System.out.printf("Média das notas é: %.2f", (media/contador));
    }
}
