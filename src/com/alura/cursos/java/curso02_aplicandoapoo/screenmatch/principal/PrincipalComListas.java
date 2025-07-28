package com.alura.cursos.java.curso02_aplicandoapoo.screenmatch.principal;

import com.alura.cursos.java.curso02_aplicandoapoo.screenmatch.modelo.Filme;
import com.alura.cursos.java.curso02_aplicandoapoo.screenmatch.modelo.Serie;
import com.alura.cursos.java.curso02_aplicandoapoo.screenmatch.modelo.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Fórmula 1", 2025);
        Filme filme2 = new Filme("Jurassic Park", 1993);
        Filme filme3 = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2001);

        filme1.avalia(9);
        filme2.avalia(6);
        filme3.avalia(8);

        //trocamos a lista para "título", classe mãe, para podermos guardar filmes e séries
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(lost);

        //forEach: para cada variável item que está dentro da lista
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            //se quisermos exibir um atributo que só existe em filme (não em série ou título)
            //temos que realizar um casting, para podermos usar o metodo getClassificacao que só existe em filme
            if (item instanceof Filme){ //verifica se o item é do tipo filme
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
            //Quando for item do tipo série, a classificação nn será exibida
        }

    }
}
