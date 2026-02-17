package Personaje_lol;

public class Habilidades {

    private String nombreH;
    private String descripcion;
    private int costreRecurso;
    private double enfriamietno;
    private int nivel;
    private String tecla;

    public Habilidades(String nombreH, String descripcion, int costreRecurso, double enfriamietno,
                       int nivel , String tecla){

        this.nombreH = nombreH;
        this.descripcion = descripcion;
        this.costreRecurso = costreRecurso;
        this.enfriamietno = enfriamietno;
        this.nivel = nivel;
        this.tecla = tecla;

    }

    public void verHabilidad(){
        System.out.println("Tecla: "+ tecla);
        System.out.println("Nombre: "+ nombreH);
        System.out.println("Descripcion: "+ descripcion);
        System.out.println("Enfriamiento: "+ enfriamietno);
        System.out.println("Coste: "+ costreRecurso);
        System.out.println("Nivel: "+ nivel);
    }

}
