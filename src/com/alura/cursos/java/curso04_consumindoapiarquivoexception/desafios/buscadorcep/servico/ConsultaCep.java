package com.alura.cursos.java.curso04_consumindoapiarquivoexception.desafios.buscadorcep.servico;

import com.alura.cursos.java.curso04_consumindoapiarquivoexception.desafios.buscadorcep.modelo.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {
    //metodo que vai devolver um objeto Endereco
    public Endereco buscaEndereco (String cep){
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Endereco.class);

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter o endereço a partir desse CEP.");
        }
        //neste caso não fizemos uma classe intermediária pq atribuimos na classe os mesmos nomes retornados na api.
        //Diferente no projeto screenMatch
    }
}
