package Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_aplicando_A_OrientacaoAObjetos.aulas.aula5.principal;

import Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_aplicando_A_OrientacaoAObjetos.aulas.aula5.modelos.MinhasPreferidas;
import Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_aplicando_A_OrientacaoAObjetos.aulas.aula5.modelos.Musica;
import Aprenda_a_programar_em_Java_com_Orientação_a_Objetos.java_aplicando_A_OrientacaoAObjetos.aulas.aula5.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 100; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1250; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);
    }
}
