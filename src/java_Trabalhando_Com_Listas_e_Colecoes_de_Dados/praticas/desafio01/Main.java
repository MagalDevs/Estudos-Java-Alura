package java_Trabalhando_Com_Listas_e_Colecoes_de_Dados.praticas.desafio01;

import java_Trabalhando_Com_Listas_e_Colecoes_de_Dados.praticas.desafio01.Pessoa.Pessoa;

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
