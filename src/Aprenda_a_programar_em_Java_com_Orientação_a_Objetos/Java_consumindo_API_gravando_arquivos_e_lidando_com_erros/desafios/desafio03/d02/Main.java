package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.desafio03.d02;

import Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.desafio03.d02.classes.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Titulo superman = new Titulo("Superman", 1978, 143);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        try {
            FileWriter fileWriter = new FileWriter("Titulo.json");
            fileWriter.write(gson.toJson(superman));
            fileWriter.close();
            System.out.println("Arquivo criado com sucesso");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Programa encerrado.");
        }
    }
}
