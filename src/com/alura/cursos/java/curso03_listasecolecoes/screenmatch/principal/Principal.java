package com.alura.cursos.java.curso03_listasecolecoes.screenmatch.principal;

import com.alura.cursos.java.curso03_listasecolecoes.screenmatch.calculos.CalculadoraDeTempo;
import com.alura.cursos.java.curso03_listasecolecoes.screenmatch.calculos.FiltroRecomendacao;
import com.alura.cursos.java.curso03_listasecolecoes.screenmatch.modelo.Episodio;
import com.alura.cursos.java.curso03_listasecolecoes.screenmatch.modelo.Filme;
import com.alura.cursos.java.curso03_listasecolecoes.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme("Fórmula 1", 2025);
        filme.setIncluidoNoPlano(false);
        filme.setDuracaoEmMinutos(180);

        Filme filme2 = new Filme("Jurassic Park", 1993);
        filme2.setIncluidoNoPlano(true);
        filme2.setDuracaoEmMinutos(130);

        System.out.println(filme); //imprime a classe, e o endereço de memória/ referência
        //System.out.println(filme.nome); //acessando o atributo do objeto
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        filme.exibeFichaTecnica();
        System.out.println("A nota de avaliação do filme é: "+filme.pegaMedia());

        Serie lost = new Serie("Lost", 2001);
        System.out.println("--------------------------------------------------------------");

        lost.setTemporadas(10);
        lost.setAtiva(false);
        lost.setEpisodiosPorTemporada(23);
        lost.setMinutosPorEpisodio(45);
        System.out.println("Duração da série: " + lost.getDuracaoEmMinutos() + " minutos");
        lost.exibeFichaTecnica();
        System.out.println("--------------------------------------------------------------");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(filme2);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
        System.out.println("--------------------------------------------------------------");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setNome("Day one");
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
        System.out.println("-----------------------------------------------------------------------");
        //TRABALHANDO COM LISTAS E COLEÇÕES
        //Classe arrayList é uma das mais usadas
        Filme filme3 = new Filme("Dogville", 2003);
        filme3.setIncluidoNoPlano(true);
        filme3.setDuracaoEmMinutos(200);
        filme.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("Quantidade de filmes na lista: "+listaDeFilmes.size());
        System.out.println("1º Filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes); //o toString do arrayList, já é configurado para fazer um "for" e percorrer a lista
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
    }
}
