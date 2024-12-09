package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.desafio02.d03;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o nome de usuário do Github:");
            String username = scanner.nextLine().trim();

            String endereco = "https://api.github.com/users/" + username;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();


            if (response.statusCode() == 404){
                throw new ErroConsultaGitHubException("Usuário não encontrado");
            }else {
                System.out.println("Usuário encontrado");
                System.out.println(json);
            }
        }catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }
    }
}
