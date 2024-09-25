package Atividades_Práticas;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numtentativa = 5;
        System.out.printf("Digite um número entre 0 a 100 (você tem %d tentativa(s)): ", numtentativa);
        int tentativa = scanner.nextInt();
        while (numtentativa > 0) {
            if (tentativa < 0||tentativa > 100){
                System.out.println("Você errou! Digite um número entre(0 a 100)");
            }else if (tentativa == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou!");
                break;
            } else if (tentativa < numeroAleatorio) {
                System.out.println("Você errou! Tente um número maior.");
            } else {
                System.out.println("Você errou! Tente um número menor.");
            }


            System.out.printf("Você tem %d tentativa(s) restante(s)\n", numtentativa);
            numtentativa--;
            System.out.print("Digite novamente: ");
            tentativa = scanner.nextInt();
        }
    }
}
