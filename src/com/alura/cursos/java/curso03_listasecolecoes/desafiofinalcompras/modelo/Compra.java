package com.alura.cursos.java.curso03_listasecolecoes.desafiofinalcompras.modelo;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    //Para essa aplicação, só faz sentido os getters
    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra - Descrição: "+descricao + " valor: R$ " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        //Queremos ordenar pelo valor, porém o valor é um tipo primitivo, portanto nn tem como usar o compareTo
        //Nesse caso, será utilizado um wrapper
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
