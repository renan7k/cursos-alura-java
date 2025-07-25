package com.alura.cursos.java.curso02_aplicandoapoo.screenmatch.modelo;

import com.alura.cursos.java.curso02_aplicandoapoo.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }
}
