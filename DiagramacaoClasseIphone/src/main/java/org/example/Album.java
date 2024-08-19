package org.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@RequiredArgsConstructor
@Getter@Setter
public class Album {
    private String cantor;
    private List<Musica> musicas;
}
