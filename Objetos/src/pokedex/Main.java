package pokedex;

public class Main {

    public static void main (String[] args){

        Pokemon p1 = new Pokemon("Drakloak", "Dragon/Fantasma",
                "Octava", 886, 885,
                886, true);

        Pokemon p2 = new Pokemon("Cosmog ", "Psiquico",
                "Septima", 789, 790,
                789, false);

        Pokemon p3 = new Pokemon("Capsakid ", "Planta",
                "Novena", 951, 952,
                951,true);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }


}