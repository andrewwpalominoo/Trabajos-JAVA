package es.cide.prog;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();// Declaramos random

        String[] tiposString = { // Array de obstaculos
                "Piedra",
                "Agujero",
                "Muro",
                "Barranco",
                "Rampa"
        };

        Robot bot = new Robot(); // Creamos robot
        int ronda = 0; // Declaramos ronda

        // Info del robot
        System.out.println("El nombre de tu robot es " + bot.getNombre());
        System.out.println("Tu robot tiene una energía de " + bot.getEnergia());
        System.out.println("Tu robot tiene una fuerza de " + bot.getFuerza());

        // Inicio de bucle hasta que el bot se quede sin energia o se superen los
        // obstaculos
        Obstaculo obstaculillo = new Obstaculo();
        while (bot.getEnergia() > 0 && ronda <= 4) {
            System.out.println("Tu robot intenta pasar por un obstaculo tipo " + tiposString[ronda]);
            Robot.superarObstaculo(); // Metodo para ver si pasa
            if (bot.getEnergia() > 0) { // Solo quiero que muestre este mensaje si aun tiene energia
                System.out.println("Energía restante del robot " + bot.getEnergia());
            }
            ronda++;
        }
        if (bot.getEnergia() > 0) { // Mensaje victoria o derrota
            System.out.println("¡El robot ha superado todos los obstaculos! Enhorabuena");
        } else {
            System.out.println("El robot no ha superado la prueba, mejor úsalo de cafetera");
        }
    }
}