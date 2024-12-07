package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.desafio01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Meals {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da receita:");
        String receita = scan.nextLine();

        String path = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(path))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
