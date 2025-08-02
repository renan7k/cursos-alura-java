package com.alura.cursos.java.curso04_consumindoapiarquivoexception.desafios.buscadorcep.servico;

import com.alura.cursos.java.curso04_consumindoapiarquivoexception.desafios.buscadorcep.modelo.Endereco;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void salvaJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder()
                //.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        FileWriter escrita = new FileWriter(endereco.getCep() +".json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }
}
