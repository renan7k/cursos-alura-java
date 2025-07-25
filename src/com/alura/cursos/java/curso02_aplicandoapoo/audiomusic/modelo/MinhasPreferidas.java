package com.alura.cursos.java.curso02_aplicandoapoo.audiomusic.modelo;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo() + " é uma boa opção.");
        }
    }

}
