package com.alura.cursos.java.curso03_listasecolecoes;
//1 - Crie uma classe Produto com atributos como nome, preco, e quantidade.
//Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
//Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice.

//2 - Implemente o metodo toString() na classe Produto para retornar uma representação em texto do objeto.
// Em seguida, imprima a lista de produtos utilizando o metodo System.out.println().

//3 - Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos.
// Em seguida, crie objetos Produto utilizando esse novo construtor.

//4 - Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor
// que utilize o construtor da classe mãe (super) para inicializar os atributos herdados.
// Crie um objeto ProdutoPerecivel e imprima seus valores.

import java.util.ArrayList;

public class Desafio02 {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        //1, 3
        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto na posição 0: " + listaProdutos.get(0).getNome());

        System.out.println("Exercício 2 -------------------------------------");
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        System.out.println("Exercício 4 -------------------------------------");
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");
        System.out.println(produtoPerecivel);
    }
}
//1 e 2
class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

//4
class ProdutoPerecivel extends Produto {
    String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecível{" +
                " nome: " + this.getNome() + '\n' +
                "preço: " + this.getPreco() + '\n' +
                "quantidade: " + this.getQuantidade() + '\n' +
                "dataValidade=" + dataValidade + '\n' +
                '}';
    }
}
