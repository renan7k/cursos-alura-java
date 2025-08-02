package com.alura.cursos.java.curso04_consumindoapiarquivoexception.desafios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//2 - Defina uma classe chamada Titulo com os atributos necessários.
// Em seguida, crie um programa que instancia um objeto Titulo, serializa esse objeto para JSON usando a biblioteca Gson
// e imprime o resultado.

//3 - Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante.
// Utilize o metodo setPrettyPrinting para alcançar esse resultado.
public class Desafio04ObjetoToJson {

    public static void main(String[] args) {
        Documentario documentario = new Documentario("Torres gêmeas", "Adalberto Guimarães", "História");

        //Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(documentario);

        System.out.println(json);
    }
}

class Documentario {
    private String nome;
    private String diretor;
    private String categoria;

    public Documentario(String nome, String autor, String categoria) {
        this.nome = nome;
        this.diretor = autor;
        this.categoria = categoria;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getDiretor() {return diretor;}
    public void setDiretor(String diretor) {this.diretor = diretor;}
    public String getCategoria() {return categoria;}
    public void setCategoria(String categoria) {this.categoria = categoria;}

    @Override
    public String toString() {
        return "Nome do documentário: " + nome +", Diretor: "+diretor+", Categoria: "+categoria;
    }
}

