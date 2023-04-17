package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Musica> musicas = new ArrayList<>();
    public void adicionarMusica(String nome, String duracao, String album){
        Musica musica = MusicaFactory.getMusica(nome, duracao, album);
        musicas.add(musica);
    }
}
