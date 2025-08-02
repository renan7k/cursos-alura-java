package com.alura.cursos.java.curso04_consumindoapiarquivoexception.screenmatch.principal;

import com.alura.cursos.java.curso04_consumindoapiarquivoexception.screenmatch.excecao.ErrorDeConversaoDeAnoException;
import com.alura.cursos.java.curso04_consumindoapiarquivoexception.screenmatch.modelo.Titulo;
import com.alura.cursos.java.curso04_consumindoapiarquivoexception.screenmatch.modelo.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Buscando dados dos filmes em api externa
public class PrincipalComBuscaApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        //desserialização - transformar o json de resposta da api em objeto
        //Gson gson = new Gson();
        //Embaixo, estamos usando o buider, pois nos campos do Json retorna algumas letras maiúsculas, e vamos desconsiderá-las por boa prática de nomenclatura de variáveis java
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")) { //enquanto busca for diferente de sair
            System.out.println("Qual filme deseja buscar?");
            busca = input.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

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

                //Titulo meuTitulo = gson.fromJson(json, Titulo.class); //aqui transforma o response em titulo.class
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class); // Classe para transferência de dados
                System.out.println(meuTituloOmdb);
                //try {
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println(meuTitulo);

//                //escrevendo num arquivo
//                FileWriter escrita = new FileWriter("filmes.txt");
//                escrita.write(meuTitulo.toString());
//                escrita.close(); //necessário para identificar que terminou a escrita no arquivo

                //adicionando buscas no arraylist
                titulos.add(meuTitulo);
            } catch (NumberFormatException e) { //exception tratado
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca. Verifique a URL");
            } catch (ErrorDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println(titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos)); //convertendo a lista para json
        escrita.close();
        System.out.println("O programa finalizou corretamente!"); //msg para demonstrar que a execução não parou abruptamente
    }
}
