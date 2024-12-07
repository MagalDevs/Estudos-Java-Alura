package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_Trabalhando_Com_Listas_e_Colecoes_de_Dados.desafio02.Classes;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel: " + "Nome - " + this.getNome() + ", preco - R$" + this.getPreco() + ", quantidade - " + this.getQuantidade() + ", data de validade - " + this.dataValidade;
    }
}
