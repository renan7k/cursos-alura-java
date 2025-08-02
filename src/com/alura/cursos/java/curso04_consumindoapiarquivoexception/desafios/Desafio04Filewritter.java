package com.alura.cursos.java.curso04_consumindoapiarquivoexception.desafios;

import java.io.FileWriter;
import java.io.IOException;
//Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo."
// Utilize as classes do pacote java.io.
public class Desafio04Filewritter {
    public static void main(String[] args) {
        String data = "Conteúdo a ser gravado no arquivo.";

        try (FileWriter writer = new FileWriter("arquivo.txt")) {
            writer.write(data);
            System.out.println("Dados gravados com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
