package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_aplicando_A_OrientacaoAObjetos.Atividades_praticas.aula2.classes;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
