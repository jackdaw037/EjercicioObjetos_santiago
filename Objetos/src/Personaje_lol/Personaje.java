package Personaje_lol;

public class Personaje {

    private String nombre;
    private String rol;
    private String dificultad;
    private  String recurso;

    private int vidaMax;
    private  int ad;
    private int ap;
    private int armadura;
    private int rm;

    private Habilidades pasiva;
    private Habilidades Q;
    private Habilidades W;
    private Habilidades E;
    private Habilidades R;




    public  Personaje(String nombre, String rol, String dificultad,
                      String recurso, int vidaMax, int ad, int ap, int armadura, int rm,
                      Habilidades pasiva, Habilidades Q, Habilidades W, Habilidades E, Habilidades R){

        this.nombre = nombre;
        this.rol = rol;
        this.dificultad = dificultad;
        this.recurso = recurso;

        this.vidaMax = vidaMax;
        this.ad = ad;
        this.ap = ap;
        this.armadura = armadura;
        this.rm = rm;

        this.pasiva = pasiva;
        this.Q = Q;
        this.W = W;
        this.E = E;
        this.R = R;
    }

    public void mostrarCampeon() {
        System.out.println("===== CAMPEÓN =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Rol: " + rol);
        System.out.println("Dificultad: " + dificultad);
        System.out.println("Recurso: " + recurso);
        System.out.println("Vida máxima: " + vidaMax);
            System.out.println("Daño de ataque: " + ad);
        System.out.println("Poder de habilidad: " + ap);
        System.out.println("Armadura: " + armadura);
        System.out.println("Resistencia mágica: " + rm);
        System.out.println();

        pasiva.verHabilidad();
        Q.verHabilidad();
        W.verHabilidad();
        E.verHabilidad();
        R.verHabilidad();
   }
}
