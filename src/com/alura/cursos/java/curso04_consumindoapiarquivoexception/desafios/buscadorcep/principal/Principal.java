package com.alura.cursos.java.curso04_consumindoapiarquivoexception.desafios.buscadorcep.principal;

import com.alura.cursos.java.curso04_consumindoapiarquivoexception.desafios.buscadorcep.modelo.Endereco;
import com.alura.cursos.java.curso04_consumindoapiarquivoexception.desafios.buscadorcep.servico.ConsultaCep;
import com.alura.cursos.java.curso04_consumindoapiarquivoexception.desafios.buscadorcep.servico.GeradorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o cep a ser consultado: ");
        String cep = input.nextLine();
        ConsultaCep consultaCep = new ConsultaCep();
        GeradorDeArquivo gerador = new GeradorDeArquivo();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação.");
        }
    }
}
