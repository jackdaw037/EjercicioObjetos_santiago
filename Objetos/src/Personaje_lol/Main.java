package Personaje_lol;

public class Main {

    public static void main(String[] args){

        Habilidades pasiva = new Habilidades("Depredador invisible",
                "Cuando está en la maleza, Rengar se abalanza sobre su objetivo con su ataque básico. Rengar genera ferocidad cuando lanza una habilidad",
                25, 10, 1, "P");

        Habilidades Q = new Habilidades("Fiereza",
                "El siguiente ataque de Rengar apuñala brutalmente a su objetivo y le inflige daño adicional",
                25, 10, 1, "Q");

        Habilidades W = new Habilidades("Rugido de batalla",
                "Rengar profiere un rugido de batalla que daña a los enemigos y le cura parte del daño que ha recibido recientemente",
                25, 10, 1, "W");

        Habilidades E = new Habilidades("Golpe bola",
                "Rengar lanza una boleadora que ralentiza durante unos momentos al primer objetivo al que alcanza",
                25, 10, 1, "E");

        Habilidades R = new Habilidades("Emoción por la cacería",
                "Los instintos de depredador de Rengar toman el control y, además de camuflarlo, le revelan la presencia del campeón más próximo en una zona de amplio radio",
                50, 70, 6, "R");

        Personaje Rengar = new Personaje("Rengar",
                "Asesino/Luchador",
                "Alto",
                "Energia",
                600, 500, 0, 230, 200,

                pasiva, Q, W, E, R);

        Rengar.mostrarCampeon();
    }
}
