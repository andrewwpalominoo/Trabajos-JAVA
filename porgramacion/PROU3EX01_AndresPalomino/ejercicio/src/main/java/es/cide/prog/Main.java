
package es.cide.prog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variables de control del juego
        boolean heroeVivo = true; // Estado de vida del Heroe
        boolean acertado;
        int ronda = 0;
        String pirataName;

        // Mensaje de bienvenida y explicación
        System.out.println("¡Bienvenido marinero a la batalla de insultos en Monkey Island!");
        System.out.println("Te enfrentarás a distintos piratas a los que debes derrotar respondiendo originalmente a sus insultos.");
        System.out.print("¿Cómo te llamas, joven pirata? ");
        String nombreHeroe = sc.nextLine(); // Introducir nombre del pirata

        // Inicialización del héroe con su nombre y 10 puntos de vida
        Heroi heroe = new Heroi(nombreHeroe, 10);

        // Creación de la isla y obtención del número de piratas a enfrentar
        Illa islilla = new Illa();
        int numPiratas = islilla.getNumPiratas();

        // Continua la introducción
        System.out.println("Haz que tu nombre resuene en la isla de " + islilla.getIslaName() + " y forma de tus hazañas una leyenda.");
        System.out.println("Debes derrotar a " + numPiratas + " piratas para que canten canciones sobre tus batallas.");
        System.out.println(",,,,,,,,,,,,,,"); // Estas comas son una separación y ya, pondré bastante durante el juego

        // Bucle principal: continúa mientras el héroe esté vivo y queden piratas por derrotar
        while (heroeVivo && ronda < numPiratas) {
            // Obtener el pirata actual con sus atributos
            Pirata pirata = islilla.vullUnPirata(ronda);
            pirataName = pirata.getPirataNombre();
            int pirateVida = pirata.getPirataVida();

            // Información del combate (Numero de rondas e informacion tanto del pirata como del heroe)
            System.out.println("Combate número " + (ronda + 1) + " de " + numPiratas + ", ¡A POR TODAS!");
            System.out.println(pirataName + " se aproxima dispuesto a matarte");
            System.out.println("Vida del pirata: " + pirateVida);
            System.out.println("Vida de " + nombreHeroe + ": " + heroe.getVida());
            System.out.println(",,,,,,,,,,,,,,");

            // Bucle de combate: continúa mientras ambos estén vivos
            while (pirateVida > 0 && heroeVivo) {
                // El pirata insulta
                String insultado = pirata.insultar();
                System.out.println(pirataName + " dice: " + insultado);
                System.out.println(",,,,,,,,,,,,,,");

                // El héroe elige una defensa
                String respuestaHeroe = heroe.defender();
                System.out.println(respuestaHeroe);
                System.out.println(",,,,,,,,,,,,,,");

                // Verificar si la respuesta es correcta
                acertado = pirata.replica(respuestaHeroe);

                if (acertado) {
                    // Respuesta correcta: el pirata pierde vida
                    System.out.println("¡Buen golpe! El pirata retrocede");
                    pirata.pirataVivo();
                    pirateVida = pirata.getPirataVida();
                } else {
                    // Respuesta incorrecta: el héroe pierde vida
                    System.out.println("JA! JA! JA! Un pringado como tú jamás será leyenda");
                    heroe.heroeVivo();

                    // Verificar si el héroe ha sido derrotado
                    if (heroe.getVida() <= 0) {
                        System.out.println("El Pirata " + pirataName + " te ha derrotado.");
                        heroeVivo = false;
                    }
                }
            }

            // Se suma una ronda
            ronda++;
        }

        // Mensaje final según el resultado
        if (heroeVivo) { // Victoria
            System.out.println("¡Has ganado todas tus batallas, eres el pirata más temido de " + islilla.getIslaName() + "!");
        } else { // Derrota
            System.out.println("Has fallado marinero... Mejor dedícate a limpiar la taberna");
        }

        sc.close(); // Cerramos Scanner
    }
}