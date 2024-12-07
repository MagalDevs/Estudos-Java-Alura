package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_Trabalhando_Com_Listas_e_Colecoes_de_Dados.desafio01;

import Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_Trabalhando_Com_Listas_e_Colecoes_de_Dados.desafio01.Pessoa.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa joao = new Pessoa("João", 25);
        Pessoa maria = new Pessoa("Maria", 30);
        Pessoa pedro = new Pessoa("Pedro", 20);

        pessoas.add(joao);
        pessoas.add(maria);
        pessoas.add(pedro);
        System.out.println(pessoas.getFirst());

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
