package Atividades_Práticas;

public class DesafioAula2 {
    public static void main(String[] args) {
        //1.
        double nota1 = 8.60;
        double nota2 = 9.25;
        double media = (nota1 + nota2) / 2;
        System.out.println(media);
        //2.
        int mediaCasting = (int) media;
        System.out.println(mediaCasting);
        //3.
        char letra = 'M';
        String nome = "Marina";
        System.out.println(nome + " começa com a letra" + letra);
        //4.
        double precoProduto = 29.30;
        int quantidade = 4;
        double total = precoProduto * quantidade;

        System.out.println(total);
        //5.
        double dolares = 1;
        double reais = dolares * 4.94;
        System.out.printf("$%.2f é igual a R$%.2f\n",dolares,reais);
        //6.
        double precoOriginal = 56.78;
        double percentualDesconto = 1.3;
        double precoComDesconto = precoOriginal - (precoOriginal * (percentualDesconto - 1));
        System.out.printf("Preço original R$%.2f\nO preço com desconto é R$%.2f", precoOriginal, precoComDesconto);
    }
}
