package org.example;

import java.util.List;

public class ReprodutorMusical implements FuncoesReprodutorMusical {

    List<Album> playlist;

    @Override
    public void tocar(Album album) {
        System.out.println("Selecionando musica: "+ this.playlist.get(0));
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica");
    }
}
