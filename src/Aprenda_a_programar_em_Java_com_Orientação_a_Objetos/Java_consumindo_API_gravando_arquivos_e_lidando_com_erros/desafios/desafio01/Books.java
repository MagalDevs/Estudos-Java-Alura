package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.desafio01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Busque o livro pelo nome:");
        String nomeLivro = scanner.nextLine();

        String path ="https://www.googleapis.com/books/v1/volumes?q=" + nomeLivro + "&key=AIzaSyAm6uIoVcPMoZR5Su-EfFP-ABekFNrOKdE";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(path))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
