package com.alura.cursos.java.curso03_listasecolecoes.screenmatch.calculos;

import com.alura.cursos.java.curso03_listasecolecoes.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui (Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    //sobrecarga de métodos
//    public void inclui (Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    //Trocamos os 2 metodos de cima, por 1: Referenciando a super classe, assim aceitamos filmes e séries
    //como filme e série são um título, funciona. isso já é o polimorfismo
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
