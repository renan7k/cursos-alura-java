package com.alura.cursos.java.curso02_aplicandoapoo.audiomusic.principal;

import com.alura.cursos.java.curso02_aplicandoapoo.audiomusic.modelo.MinhasPreferidas;
import com.alura.cursos.java.curso02_aplicandoapoo.audiomusic.modelo.Musica;
import com.alura.cursos.java.curso02_aplicandoapoo.audiomusic.modelo.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Burguesinha");
        musica1.setCantor("Seu Jorge");
        musica1.setGenero("mpb");
        musica1.setAlbum("Música para Churrasco");

        //for para simular as reproduções e curtidas
        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();
        }
        for (int i = 0; i < 50 ; i++) {
            musica1.curte();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Bolha dev");
        podcast1.setApresentador("Marcus Mendes");

        for (int i = 0; i < 600; i++) {
            podcast1.reproduz();
        }
        for (int i = 0; i < 510 ; i++) {
            podcast1.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica1);
        preferidas.inclui(podcast1);
    }
}
