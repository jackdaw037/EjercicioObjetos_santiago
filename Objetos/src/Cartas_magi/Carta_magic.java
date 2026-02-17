package Cartas_magi;

public class Carta_magic {

    private String nombre;
    private String costeMana;
    private String subtipo;
    private int fuerza;
    private int vida;
    private String artista;
    private String expancion;
    private String rareza;
    private String habilidad;
    private String tipoCarta;

    public Carta_magic(String nombre, String costeMana, String subtipo,int fuerza, int vida,
                       String artista, String expancion,
                       String rareza, String habilidad, String tipoCarta){

        this.nombre = nombre;
        this.costeMana = costeMana;
        this.subtipo = subtipo;
        this.fuerza = fuerza;
        this.vida = vida;
        this.artista = artista;
        this.expancion = expancion;
        this.rareza = rareza;
        this.habilidad = habilidad;
        this.tipoCarta = tipoCarta;

    }

    public String getNombre(){
        return nombre;
    }

    public String getCosteMana(){
        return costeMana;

    }

    public String getSubtipo(){
        return subtipo;

    }

    public int getFuerza(){
        return fuerza;

    }

    public int getVida(){
        return vida;

    }

    public String getArtista(){
        return  artista;

    }

    public String getExpancion(){
        return expancion;

    }

    public String getRareza(){
        return rareza;

    }

    public String getHabilidad(){
        return habilidad;

    }

    public String getTipoCarta(){
        return tipoCarta;

    }

    @Override
    public String toString() {
        return "Carta_magic{" +
                "nombre='" + nombre + '\'' +
                ", costeMana='" + costeMana + '\'' +
                ", subtipo='" + subtipo + '\'' +
                ", fuerza=" + fuerza +
                ", vida=" + vida +
                ", artista='" + artista + '\'' +
                ", expancion='" + expancion + '\'' +
                ", rareza='" + rareza + '\'' +
                ", habilidad='" + habilidad + '\'' +
                ", tipoCarta='" + tipoCarta + '\'' +
                '}';
    }
}
