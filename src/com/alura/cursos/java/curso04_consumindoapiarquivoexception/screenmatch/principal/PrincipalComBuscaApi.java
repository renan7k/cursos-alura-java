package com.alura.cursos.java.curso04_consumindoapiarquivoexception.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//Buscando dados dos filmes em api externa
public class PrincipalComBuscaApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual filme deseja buscar?");
        var busca = input.nextLine();
        String url = "https://www.omdbapi.com/?t=" + busca +"&apikey=fcf2f961";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
