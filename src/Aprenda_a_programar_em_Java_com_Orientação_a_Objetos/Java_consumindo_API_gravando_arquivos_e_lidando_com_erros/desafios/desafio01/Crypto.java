package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.desafio01;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Crypto {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Procure a Criptomoeda pelo nome: ");
        String crypto = scan.nextLine();

        String path = "https://api.coingecko.com/api/v3/coins/"+ crypto +"?x_cg_pro_api_key=CG-BtUGp35YXSaHaP4tEcCrJuBQ";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(path))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
