package com.alura.cursos.java.curso03_listasecolecoes;


import java.util.*;

//1 - Crie uma lista de números inteiros e utilize o metodo Collections.sort para ordená-la em ordem crescente.
// Em seguida, imprima a lista ordenada.
//2 - Crie uma classe Titulo com um atributo nome do tipo String.
// Implemente a interface Comparable na classe para ordenar uma lista de objetos Titulo.
//3 - No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista.
// Utilize o metodo Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
//4 - Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
// Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.
//5 - Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de polimorfismo.
public class Desafio04 {
    public static void main(String[] args) {
        ArrayList<Integer>listaDeNumeros = new ArrayList<>(List.of(10,2,7,23,15,198,1));
        System.out.println("------------------------- Exercício 1 -------------------------");
        System.out.println("Lista antes da ordenação: " + listaDeNumeros);
        Collections.sort(listaDeNumeros);
        System.out.println("Lista após a ordenação: " + listaDeNumeros);

        System.out.println("------------------------ Exercício 2,3 ------------------------");
        Titulos titulo1 = new Titulos("Batman Begins");
        Titulos titulo2 = new Titulos("Triplo XXX");
        Titulos titulo3 = new Titulos("Taxi 3");
        Titulos titulo4 = new Titulos("A hora da verdade");
        Titulos titulo5 = new Titulos("Homem de Ferro");
        ArrayList<Titulos> listaFilmes = new ArrayList<>();
        listaFilmes.add(titulo1);
        listaFilmes.add(titulo2);
        listaFilmes.add(titulo3);
        listaFilmes.add(titulo4);
        listaFilmes.add(titulo5);

        System.out.println("Filmes antes da ordenação: "+listaFilmes);
        Collections.sort(listaFilmes);
        System.out.println("Filmes após a ordenação: "+listaFilmes);

        System.out.println("------------------------- Exercício 4 -------------------------");
        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);

        System.out.println("------------------------- Exercício 5 -------------------------");
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
class Titulos implements Comparable<Titulos>{
    private String nome;

    public Titulos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    @Override
    public int compareTo(Titulos outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}