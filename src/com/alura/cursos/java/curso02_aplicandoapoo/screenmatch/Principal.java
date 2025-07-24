package com.alura.cursos.java.curso02_aplicandoapoo.screenmatch;

import com.alura.cursos.java.curso02_aplicandoapoo.screenmatch.modelo.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Fórmula 1");
        filme.setAnoDeLancamento(2025);
        filme.setIncluidoNoPlano(false);
        filme.setDuracaoEmMinutos(180);

        System.out.println(filme); //imprime a classe, e o endereço de memória/ referência
        //System.out.println(filme.nome); //acessando o atributo do objeto
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        filme.exibeFichaTecnica();
        System.out.println(filme.pegaMedia());
    }
}
