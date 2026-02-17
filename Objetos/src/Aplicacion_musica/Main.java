package Aplicacion_musica;

public class Main {

    public static void main(String[] args) {

        Usuario us1 = new Usuario("pepe", "pepe@gmail.com", "Premium");

        Cancion c1 = new Cancion("Blinding Lights", "The Weeknd", "After Hours", 3.2, "Pop");
        Cancion c2 = new Cancion("Bohemian Rhapsody", "Queen", "A Night at the Opera", 5.9, "Rock");

        us1.getLista().agregarCancion(c1);
        us1.getLista().agregarCancion(c2);

        us1.mostrarUsuario();
        System.out.println();
        us1.getLista().mostrarCanciones();
    }
}
