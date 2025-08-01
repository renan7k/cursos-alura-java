package com.alura.cursos.java.curso04_consumindoapiarquivoexception.desafios;
//Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade.
// Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON representando uma pessoa em um objeto do tipo Pessoa.
//Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos estiverem ausentes
// ou se houver campos adicionais não representados no objeto Pessoa. Consulte a documentação da biblioteca Gson para flexibilizar a conversão.

import com.google.gson.Gson;

record Pessoa(String nome, int idade, String cidade) {}

public class Desafio02Pessoa {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
