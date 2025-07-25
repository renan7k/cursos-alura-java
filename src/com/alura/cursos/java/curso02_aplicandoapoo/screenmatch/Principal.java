package com.alura.cursos.java.curso02_aplicandoapoo.screenmatch;

import com.alura.cursos.java.curso02_aplicandoapoo.screenmatch.calculos.CalculadoraDeTempo;
import com.alura.cursos.java.curso02_aplicandoapoo.screenmatch.modelo.Filme;
import com.alura.cursos.java.curso02_aplicandoapoo.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Fórmula 1");
        filme.setAnoDeLancamento(2025);
        filme.setIncluidoNoPlano(false);
        filme.setDuracaoEmMinutos(180);

        Filme filme2 = new Filme();
        filme.setNome("Jurassic Park");
        filme2.setAnoDeLancamento(1993);
        filme2.setIncluidoNoPlano(true);
        filme2.setDuracaoEmMinutos(130);

        System.out.println(filme); //imprime a classe, e o endereço de memória/ referência
        //System.out.println(filme.nome); //acessando o atributo do objeto
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        filme.exibeFichaTecnica();
        System.out.println(filme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2001);

        lost.setTemporadas(10);
        lost.setAtiva(false);
        lost.setEpisodiosPorTemporada(23);
        lost.setMinutosPorEpisodio(45);
        System.out.println("Duração da série: " + lost.getDuracaoEmMinutos() + " minutos");
        lost.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(filme2);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
    }
}
