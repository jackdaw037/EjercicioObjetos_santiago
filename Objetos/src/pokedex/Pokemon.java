package pokedex;

public class Pokemon {

    private String nombre;
    private String tipo;
    private String generacion;
    private int numero;
    private int evolucion;
    private  int involucion;
    private boolean capturado;

    public Pokemon(String nombre, String tipo,String generacion, int numero, int evolucion,int involucion, boolean capturado){

        this.nombre = nombre;
        this.tipo = tipo;
        this.generacion = generacion;
        this.numero = numero;
        this.evolucion = evolucion;
        this.involucion = involucion;
        this.capturado = capturado;

    }

    public String getNombre(){
        return nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public String getGeneracion(){
        return generacion;
    }

    public int getNumero(){
        return numero;
    }

    public int getEvolucion() {
        return evolucion;
    }

    public int getInvolucion() {
        return involucion;
    }

    public boolean getCapturado(){
        return capturado;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", generacion='" + generacion + '\'' +
                ", numero=" + numero +
                ", evolucion=" + evolucion +
                ", involucion=" + involucion +
                ", capturado=" + capturado +
                '}';
    }
}


