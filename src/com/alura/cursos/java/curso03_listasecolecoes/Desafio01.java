package com.alura.cursos.java.curso03_listasecolecoes;

import java.util.ArrayList;

public class Desafio01 {
//    1-Crie uma classe Pessoa com atributos como nome, idade, e um metodo toString que represente esses atributos.
//    2-No metodo main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
//    3-Adicione pelo menos três pessoas à lista utilizando o metodo add.
//    4-Imprima o tamanho da lista utilizando o metodo size.
//    5-Imprima a primeira pessoa da lista utilizando o metodo get.
//    6-Imprima a lista completa

    //2
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        //3
        Pessoa pessoa1 = new Pessoa("Akemi", 18);
        Pessoa pessoa2 = new Pessoa("Rodrigo", 30);
        Pessoa pessoa3 = new Pessoa("Caroline", 35);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        //4
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        //5
        System.out.println("Primeira Pessoa: " + listaDePessoas.get(0));
        //6
        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
        System.out.println("-------------------------------");
        System.out.println("Impresão com toString:" + listaDePessoas);

    }
}
//1
 class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa: " + nome + " (Idade: " + idade + ")";
    }
}
