package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_Trabalhando_Com_Listas_e_Colecoes_de_Dados.desafioFinal;

import Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_Trabalhando_Com_Listas_e_Colecoes_de_Dados.desafioFinal.classes.Produtos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produtos> carrinho = new ArrayList<>();
        double limite = 0;

        while(true){
            System.out.println("Digite o limite do cartão:");
            limite = scanner.nextDouble();

            if (limite < 0){
                System.out.println("não é possível limites negativos.");
            }else {
                break;
            }
        }

        while (true){
            System.out.println("Digite a descrição da compra:");
            String nomeProduto = scanner.next();
            scanner.nextLine();

            System.out.println("Digite o valor da compra:");
            double precoProduto = scanner.nextDouble();

            double totalLimite = limite - precoProduto;
            if (totalLimite <= 0) {
                System.out.println("Saldo Insuficiente");
                break;
            }else{
                carrinho.add(new Produtos(precoProduto, nomeProduto));
                limite -= precoProduto;
            }

            int check = 1;
            while (true){
                System.out.println("Digite 0 para sair e 1 para continuar");
                check = scanner.nextInt();
                if (check != 0 && check != 1){
                    System.out.println("Número inválido. Digite novamente");
                }else{
                    break;
                }
            }

            if (check == 0){
                break;
            }
        }

        Collections.sort(carrinho);

        System.out.println("*********************");
        System.out.println("COMPRAS REALIZADAS:");
        System.out.println("");
        carrinho.forEach(System.out::println);
        System.out.println("");
        System.out.println("*********************");
        System.out.println("");
        System.out.println("Saldo do cartão: " + limite);
    }
}
