package Aplicacion_medica;

public class Main {

    public static void main(String[] args) {

        Paciente p1 = new Paciente("Pepe", "Perez", "1/1/2001", "z123545697",
                "masculino", 174, 84, "ninguna",
                "ninguno", "ninguno");

        System.out.println(p1.toString());
        p1.mostrar();
    }
}
