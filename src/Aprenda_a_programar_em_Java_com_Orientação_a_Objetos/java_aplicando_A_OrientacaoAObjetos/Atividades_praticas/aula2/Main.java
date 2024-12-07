package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_aplicando_A_OrientacaoAObjetos.Atividades_praticas.aula2;

import Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_aplicando_A_OrientacaoAObjetos.Atividades_praticas.aula2.classes.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(123);
        conta.setSaldo(1000);
        conta.titular = "João";

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());
    }
}
