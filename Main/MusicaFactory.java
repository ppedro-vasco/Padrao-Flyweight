package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class MusicaFactory {
    private static Map<String, Musica> musicas = new HashMap<>();

    public static Musica getMusica(String nome, String duracao, String album){
        Musica musica = musicas.get(nome + album);
        if (musica == null) {
            musica = new Musica(nome, duracao, album);
            musicas.put(nome + album, musica);
        }
        return musica;
    }

    public static int getTotalMusicas() {
        return musicas.size();
    }
}

