package Atividades_Práticas;

import java.util.Scanner;

public class DesafioAula3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
        System.out.println("Digite um número positivo ou negativo");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        //2.Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("Primeiro número é maior.");
        }else {
            System.out.println("Segundo número é maior.");
        }

        //3.Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        System.out.println("1. Calcular área do quadrado\n2. Calcular área do círculo");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite o lado do quadrado:");
                double ladoQuadrado = scanner.nextDouble();
                double areaQuadrado = Math.pow(ladoQuadrado, 2);
                System.out.printf("Área do quadrado: %.2f\n", areaQuadrado);
                break;
            case 2:
                System.out.println("Digite o raio do círculo:");
                double raioCirculo = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);
                System.out.printf("Área do círculo: %.2f\n", areaCirculo);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        //4.Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        System.out.println("Digite um número:");
        int numTabuada = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numTabuada, i, numTabuada * i);
        }

        //5.Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
        System.out.println("Digite um número:");
        int numParOuImpar = scanner.nextInt();
        if (numParOuImpar % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }

        //6.Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        System.out.println("Digite um número para calcular o seu fatorial:");
        int numFatorial = scanner.nextInt();
        String fatorialString = numFatorial + " x ";
        int fatorialTotal = numFatorial;

        for (int i = numFatorial - 1; i >= 1; i--) {
            fatorialTotal *= i;

            if(i == 1){
                fatorialString += i + " = " + fatorialTotal;
            }else{
                fatorialString += i + " x ";
            }
        }
        System.out.println(fatorialString);
    }
}
