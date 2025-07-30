package com.alura.cursos.java.curso03_listasecolecoes.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        //neste caso, o getClassificacao que vai ser usado, é do objeto onde foi dado um new
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento.");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento.");
        }else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
