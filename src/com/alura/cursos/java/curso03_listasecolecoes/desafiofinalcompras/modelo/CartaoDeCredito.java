package com.alura.cursos.java.curso03_listasecolecoes.desafiofinalcompras.modelo;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    //Construtor setando um limite, igualando o saldo ao limite, e inicializando uma lista de compras
    public CartaoDeCredito(double limiteCartao) {
        this.limite = limiteCartao;
        this.saldo = limiteCartao;
        this.compras = new ArrayList<>();
    }
    //Para essa aplicação, só faz sentido os getters
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
//    Precisamos criar um metodo para adicionarmos essa compra na lista. Para tal, no arquivo CartaoDeCredito gerar um metodo booleano para lançar a compra.
//    Isso porque pode ser que o saldo seja insuficiente, assim, quando chamamos o metodo de lançar a compra, será retornado um verdadeiro ou falso.Precisamos verificar se temos limite para efetuar a compra,
//    em outras palavras: o saldo disponível é maior que o valor da compra? Usamos if(this.saldo > compra.getValor()), se o saldo for maior que o valor da compra, podemos efetuá-la.
//    Dentro das chaves, vamos subtrair do saldo o valor dessa compra e depois retornamos true. Caso o saldo seja menor que o valor da compra, retornamos false.

    public boolean lancaCompra(Compra compra){
        if(this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra); //Adicionando a compra no Arraylist
            return true;
        }
        return false;
    }
}
