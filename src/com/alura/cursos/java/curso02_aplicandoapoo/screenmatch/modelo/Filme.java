package com.alura.cursos.java.curso02_aplicandoapoo.screenmatch.modelo;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public void exibeFichaTecnica(){
        System.out.println("******** FICHA TÉCNICA ********");
        System.out.println("Nome: "+nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        System.out.println("Incluso no plano: "+incluidoNoPlano);
        System.out.println("Nota de avaliação: " + avaliacao);
        System.out.println("Quantidade de avaliações: " + totalDeAvaliacoes);
        System.out.println("Duração em minutos: "+duracaoEmMinutos);
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
}
