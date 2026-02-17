package Aplicacion_musica;

public class Cancion {

    private String titulo;
    private String artista;
    private String album;
    private double duracion;
    private String genero;
    private int reproducciones;

    public Cancion(String titulo, String artista, String album, double duracion, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.duracion = duracion;
        this.genero = genero;
        this.reproducciones = 0;
    }

    public void reproducir() {
        reproducciones++;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", album='" + album + '\'' +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", reproducciones=" + reproducciones +
                '}';
    }

}
