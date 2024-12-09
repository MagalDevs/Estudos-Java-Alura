package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.Java_consumindo_API_gravando_arquivos_e_lidando_com_erros.desafios.DesafioFInal.Classes;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Endereco {
    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String cep) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                .setPrettyPrinting()
                .create();

        String path = "https://viacep.com.br/ws/"+ cep.replace("-", "") +"/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request =  HttpRequest.newBuilder()
                .uri(URI.create(path))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        EnderecoRecord enderecoRecord = gson.fromJson(json, EnderecoRecord.class);

        this.cep = enderecoRecord.cep();
        this.rua = enderecoRecord.logradouro();
        this.bairro = enderecoRecord.bairro();
        this.cidade = enderecoRecord.localidade();
        this.estado = enderecoRecord.estado();
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
