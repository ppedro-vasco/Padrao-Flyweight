package Flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaylistTest {
    @Test
    void deveRetornarPlayList() {
        Playlist playlist1 = new Playlist();
        playlist1.adicionarMusica("Bohemian Rhapsody", "5:55", "A Night at the Opera");
        playlist1.adicionarMusica("Stairway to Heaven", "8:02", "Led Zeppelin IV");
        playlist1.adicionarMusica("Satisfaction", "3:43", "Out of Our Heads");
        playlist1.adicionarMusica("Sweet Child O' Mine", "5:55", "Appetite for Destruction");
        playlist1.adicionarMusica("Billie Jean", "4:54", "Thriller");

        Playlist playlist2 = new Playlist();
        playlist2.adicionarMusica("Otherside", "4:15", "Californication");
        playlist2.adicionarMusica("Like a Rolling Stone", "6:13", "Highway 61 Revisited");
        playlist2.adicionarMusica("Stairway to Heaven", "8:02", "Led Zeppelin IV");
        playlist2.adicionarMusica("In the End", "3:36", "Hybrid Theory");
        playlist2.adicionarMusica("Thriller", "5:57", "Thriller");

        assertEquals(9, MusicaFactory.getTotalMusicas()); //
    }
}
