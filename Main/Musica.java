package Flyweight;

public class Musica {
    String nome;
    String duracao;
    String album;

    public Musica (String nome, String duracao, String album){
        this.nome = nome;
        this.duracao = duracao;
        this.album = album;
    }
    public String getNome() {
        return nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getAlbum() {
        return album;
    }
}
