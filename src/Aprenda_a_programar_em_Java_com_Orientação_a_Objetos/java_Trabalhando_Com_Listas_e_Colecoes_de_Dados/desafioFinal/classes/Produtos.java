package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_Trabalhando_Com_Listas_e_Colecoes_de_Dados.desafioFinal.classes;

public class Produtos implements Comparable<Produtos>{
    String nome;
    double preco;

    public Produtos(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return  this.nome + " - " +
                "R$ " + this.preco ;
    }

    @Override
    public int compareTo(Produtos o) {
        if (this.preco > o.preco){
            return 1;
        }
        if (this.preco < o.preco){
            return -1;
        }
        return 0;
    }
}
