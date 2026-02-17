package Aplicacion_musica;

import java.util.ArrayList;

public class LiReproduccion {

    private String nombre;
    private ArrayList<Cancion> canciones;

    public LiReproduccion(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void mostrarCanciones() {
        System.out.println("Lista: " + nombre);
        System.out.println("================================");

        for (Cancion can : canciones) {
            System.out.println(can.toString());
        }
    }
}
