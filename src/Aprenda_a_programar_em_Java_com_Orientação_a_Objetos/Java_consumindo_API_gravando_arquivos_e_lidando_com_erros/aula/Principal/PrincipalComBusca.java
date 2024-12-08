package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.aula.Principal;

import Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.aula.Classes.Titulo;
import Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.aula.Classes.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca");
        var busca = leitura.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=fc73cd7d";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

        try {
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo convertido");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("aconteceu um erro");
            System.out.println(e.getMessage());
        }
    }
}
