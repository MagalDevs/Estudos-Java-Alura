package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.desafio02.d01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faça uma divisão!");
        try{
            System.out.println("Digite o primeiro número");
            int num1 = scanner.nextInt();
            System.out.println("Digite o segundo número");
            int num2 = scanner.nextInt();

            int div = num1/num2;

            System.out.println(div);
        }catch (ArithmeticException e){
            System.out.println("é impossivel dividir por ZERO");
        }

    }
}
