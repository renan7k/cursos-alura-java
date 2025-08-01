package com.alura.cursos.java.curso04_consumindoapiarquivoexception.screenmatch.principal;

import com.alura.cursos.java.curso04_consumindoapiarquivoexception.screenmatch.excecao.ErrorDeConversaoDeAnoException;
import com.alura.cursos.java.curso04_consumindoapiarquivoexception.screenmatch.modelo.Titulo;
import com.alura.cursos.java.curso04_consumindoapiarquivoexception.screenmatch.modelo.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
        String url = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=fcf2f961"; //substituindo espaço por +
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            //desserialização - transformar o json de resposta da api em objeto
            //Gson gson = new Gson();
            //Embaixo, estamos usando o buider, pois nos campos do Json retorna algumas letras maiúsculas, e vamos desconsiderá-las por boa prática de nomenclatura de variáveis java
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            //Titulo meuTitulo = gson.fromJson(json, Titulo.class); //aqui transforma o response em titulo.class
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class); // Classe para transferência de dados
            System.out.println(meuTituloOmdb);
            //try {
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println(meuTitulo);
        } catch (NumberFormatException e) { //exception tratado
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca. Verifique a URL");
        }catch (ErrorDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("O programa finalizou corretamente!"); //msg para demonstrar que a execução não parou abruptamente
    }
}
