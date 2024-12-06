package java_Trabalhando_Com_Listas_e_Colecoes_de_Dados.praticas.desafio02;

import java_Trabalhando_Com_Listas_e_Colecoes_de_Dados.praticas.desafio02.Classes.Produto;
import java_Trabalhando_Com_Listas_e_Colecoes_de_Dados.praticas.desafio02.Classes.ProdutoPerecivel;

public class Main {
    public static void main(String[] args) {
        Produto celular = new Produto("Celular", 1000.0, 10);
        Produto notebook = new Produto("Notebook", 2000.0, 5);
        Produto tv = new Produto("TV", 1500.0, 7);

        ProdutoPerecivel banana = new ProdutoPerecivel("Banana", 5.00, 100, "10/10/2021");

        System.out.println(celular);
        System.out.println(banana);
    }
}
