package Cartas_magi;

public class Main {

    public static void main(String[] args){

        Carta_magic c1 = new Carta_magic("Arcangel Avacyn","sol ", "Angel",
                4,4, "James Ryman", "innistrad-remastered",
                "Legendaria", "Hace 3 puntos de daño", "Criatura legendaria");

        Carta_magic c2 = new Carta_magic("Liliana del vacio","Venenno", "Liliana",
                3,3, "Steve Argyle", "innistrad-remastered",
                "Legendaria", "Sacrifica una criatura a seleccion", "Planeswalker legendario");

        Carta_magic c3 = new Carta_magic("Emrakul, el final prometido","", "ELdrazi",
                13,13, "Jaime Jones", "innistrad-remastered",
                "Legendaria", "Cuesta 1 menos de mana por cada carta que este en el cementerio", "Criatura legendaria");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

    }

}
