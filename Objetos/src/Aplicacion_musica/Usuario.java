package Aplicacion_musica;

import java.time.LocalDate;

public class Usuario {

    private String nombreUsuario;
    private String correo;
    private String tipoCuenta;
    private LocalDate fechaRegistro;
    private LiReproduccion lista;

    public Usuario(String nombreUsuario, String correo, String tipoCuenta) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.tipoCuenta = tipoCuenta;
        this.fechaRegistro = LocalDate.now();
        this.lista = new LiReproduccion("Playlist");
    }

    public LiReproduccion getLista() {
        return lista;
    }

    public void mostrarUsuario() {
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Correo: " + correo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Fecha de registro: " + fechaRegistro);
    }
}
