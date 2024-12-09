package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.desafio02.d02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite a sua senha:");
            String senha = scanner.nextLine();

            if (senha.length() < 8){
                throw new SenhaInvalidaException("Senha inválida, menor que 8 dígitos");
            }else {
                System.out.println("Sua senha é: " + senha);
            }
        }catch (SenhaInvalidaException e){
            System.out.println(e);
        }

    }
}
