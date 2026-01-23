package es.cide.prog;

import java.util.Random;

public class Obstaculo {
    static Random aleatorio = new Random();

    // Atr

    static String tipo;
    static int dificultad = aleatorio.nextInt(2, 11); //Dificultad entre 1 y 10

    // Cons
    public static void Obstaculo(String tipo, int dificultad) {
        tipo = Obstaculo.tipo;
        dificultad = Obstaculo.dificultad;
    }

    // GetSet
    public static String getTipo() {
        return tipo;
    }

    public static int getDificultad() {
        return dificultad;
    }

    // Metodos

}
