package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.DesafioFInal;

import Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.DesafioFInal.Classes.Endereco;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                .setPrettyPrinting()
                .create();
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu cep:");
        String cep = scanner.nextLine();

        Endereco novoEndereco = new Endereco(cep);
        
        String enderecoCorrigido = gson.toJson(novoEndereco);
        try {
            FileWriter escrita = new FileWriter("Endereco.json");
            escrita.write(enderecoCorrigido);
            escrita.close();
            System.out.println("Arquivo criado com sucesso");
        }catch (Exception e){
            System.out.println("Houve um erro: " + e.getMessage());
        }

    }
}
