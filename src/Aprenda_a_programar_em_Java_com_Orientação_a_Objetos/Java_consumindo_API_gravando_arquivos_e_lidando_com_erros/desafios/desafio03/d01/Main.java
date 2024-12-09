package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.desafio03.d01;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter escrita = new FileWriter("arquivo.txt");
        escrita.write("Conteúdo a ser gravado no arquivo.");
        escrita.close();
    }
}
