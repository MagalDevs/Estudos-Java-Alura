package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.desafio03.d03;

import Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.desafio03.d03.classes.Veiculo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Veiculo carro = new Veiculo("Fiat", "Argo", "Prata", 2024);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        try {
            FileWriter fileWriter = new FileWriter("Veiculo.json");
            fileWriter.write(gson.toJson(carro));
            fileWriter.close();
            System.out.println("Arquivo criado com sucesso");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Programa encerrado.");
        }
    }
}
