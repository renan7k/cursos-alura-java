package com.alura.cursos.java.curso04_consumindoapiarquivoexception.screenmatch.modelo;

import com.alura.cursos.java.curso04_consumindoapiarquivoexception.screenmatch.excecao.ErrorDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4){//validando se nn está vindo nenhum dígito q mais (Ocorre no filme divertidamente)
            throw new ErrorDeConversaoDeAnoException("Não foi possível converter o ano, pois possui mais de 4 caracteres.");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year()); //Convertendo string para inteiro

        //Para essa variável, tivemos que pegar apenas os numeros, pois tbm retornava "min"
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 3));
    }

    public void exibeFichaTecnica(){
        System.out.println("******** FICHA TÉCNICA ********");
        System.out.println("Nome: "+nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        System.out.println("Incluso no plano: "+incluidoNoPlano);
        System.out.println("Nota de avaliação: " + avaliacao);
        System.out.println("Quantidade de avaliações: " + totalDeAvaliacoes);
        System.out.println("Duração em minutos: "+getDuracaoEmMinutos());
    }

    public void avalia(double nota){
        avaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return avaliacao / totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome; // o this, referencia o nome DESTE objeto, recebe o parâmetro nome
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "( Filme: " + nome + " ,Ano de lançamento: " + anoDeLancamento + " ,Duração: " + duracaoEmMinutos + " )";
    }
}
