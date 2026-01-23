
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
        Heroi heroe = null;

        // Mensaje de bienvenida y explicación
        System.out.println("¡Bienvenido marinero a la batalla de insultos en Monkey Island!");
        System.out.println(
                "Te enfrentarás a distintos piratas a los que debes derrotar respondiendo originalmente a sus insultos.");

        // Inicialización del héroe con su nombre y 10 puntos de vida
        //Guybrush heroe = new Guybrush(null, 10, true, null);
        int personaje;
        System.out.println("Elige tu personaje:");
        System.out.println("1: Guybrush Threepwood");
        System.out.println("2: Elaine Marley");

        personaje = sc.nextInt(); // Elección del heroe

        while (personaje < 1 || personaje > 2){
            System.out.println("Introduce un valor correcto");
            personaje = sc.nextInt(); // Elección del heroe
        }

        if (personaje == 1) {
            heroe = new Guybrush("Guybrush", 10, true, null);
        } else if (personaje == 2) {
            heroe = new Elaine("Elaine", 10, true, null);
        }

        heroe.sayHello();

        // Creación de la isla y obtención del número de piratas a enfrentar
        Illa islilla = new Illa();
        int numPiratas = islilla.getNumPiratas();

        // Continua la introducción
        System.out.println("Haz que tu nombre resuene en la isla de " + islilla.getIslaName()
                + " y forma de tus hazañas una leyenda.");
        System.out.println("Debes derrotar a " + numPiratas + " piratas para que canten canciones sobre tus batallas.");
        System.out.println(",,,,,,,,,,,,,,"); // Estas comas son una separación y ya, pondré bastante durante el juego

        // Bucle principal: continúa mientras el héroe esté vivo y queden piratas por
        // derrotar
        while (heroeVivo && ronda < numPiratas) {
            // Obtener el pirata actual con sus atributos
            Piratas pirata = islilla.vullUnPirata(ronda);
            pirataName = pirata.getPirataNombre();
            int pirateVida = pirata.getPirataVida();

            // Información del combate (Numero de rondas e informacion tanto del pirata como
            // del heroe)
            System.out.println("Combate número " + (ronda + 1) + " de " + numPiratas + ", ¡A POR TODAS!");
            System.out.println(pirataName + " se aproxima dispuesto a matarte");
            System.out.println("Vida del pirata: " + pirateVida);
            System.out.println("Vida de " + heroe.getNombre() + ": " + heroe.getVida());
            heroe.sayHello();
            System.out.println(",,,,,,,,,,,,,,");

            // Bucle de combate: continúa mientras ambos estén vivos
            while (pirateVida > 0 && heroeVivo) {
                // El pirata insulta
                System.out.println(pirataName + " dice: ");
                pirata.sayHello();
                pirata.insultar();
                System.out.println(",,,,,,,,,,,,,,");

                // El héroe elige una defensa.
                heroe.defensar();
                System.out.println(",,,,,,,,,,,,,,");

                // Pasamos la defensa al pirata
                pirata.replica(heroe.getUltimaDefensa());
                // Replica acertada si/no
                acertado = pirata.estaAcertada();

                if (acertado) {
                    // Respuesta correcta: el pirata pierde vida
                    System.out.println("¡Buen golpe! El pirata retrocede");
                    pirata.vida();
                    pirateVida = pirata.getPirataVida();
                } else {
                    // Respuesta incorrecta: el héroe pierde vida
                    System.out.println("JA! JA! JA! Un pringado como tú jamás será leyenda");
                    heroe.vida();

                    // Verificar si el héroe ha sido derrotado
                    if (heroe.getVida() <= 0) {
                        System.out.println("El Pirata " + pirataName + " te ha derrotado.");
                        heroeVivo = false;
                    }
                }
            }
            if (heroeVivo) {
                pirata.sayGoodBye();
            } else {
                heroe.sayGoodBye();
            }

            // Se suma una ronda
            ronda++;
        }

        LeChuck leChuck = new LeChuck("LeChuck", 6, true);
        int vidaLeChuck = leChuck.getVida();
        String nameLeChuck = leChuck.getNombre();

        while (heroeVivo && ronda < vidaLeChuck) {
            // Información del combate (Numero de rondas e informacion tanto del pirata como
            // del heroe)
            System.out.println("Combate final, ¡A POR TODAS!");
            System.out.println(nameLeChuck + " se aproxima dispuesto a matarte");
            leChuck.sayHello();
            System.out.println("Vida del pirata: " + vidaLeChuck);
            System.out.println("Vida de " + heroe.getNombre() + ": " + heroe.getVida());
            heroe.sayHello();
            System.out.println(",,,,,,,,,,,,,,");

            // Bucle de combate: continúa mientras ambos estén vivos
            while (vidaLeChuck > 0 && heroeVivo) {
                // El pirata insulta
                System.out.println(nameLeChuck + " dice: ");
                leChuck.insultar();
                System.out.println(",,,,,,,,,,,,,,");

                // El héroe elige una defensa.
                heroe.defensar();
                System.out.println(",,,,,,,,,,,,,,");

                // Pasamos la defensa al pirata
                leChuck.replica(heroe.getUltimaDefensa());
                // Replica acertada si/no
                acertado = leChuck.estaAcertada();

                if (acertado) {
                    // Respuesta correcta: el pirata pierde vida
                    System.out.println("¡Buen golpe! El pirata " + nameLeChuck + " retrocede");
                    leChuck.vida();
                    vidaLeChuck = leChuck.getVida();
                } else {
                    // Respuesta incorrecta: el héroe pierde vida
                    System.out.println("JA! JA! JA! ¿Y tu has llegado tan lejos?");
                    heroe.vida();

                    // Verificar si el héroe ha sido derrotado
                    if (heroe.getVida() <= 0) {
                        System.out.println("El Pirata " + nameLeChuck + " te ha derrotado.");
                        heroeVivo = false;
                    }
                }
            }

            if (heroeVivo) {
                leChuck.sayGoodBye();
            } else {
                heroe.sayGoodBye();
            }
        }

        // Mensaje final según el resultado
        if (heroeVivo) { // Victoria
            System.out.println(
                    "¡Has ganado todas tus batallas, eres el pirata más temido de " + islilla.getIslaName() + "!");
        } else { // Derrota
            System.out.println("Has fallado marinero... Mejor dedícate a limpiar la taberna");
        }

        sc.close(); // Cerramos Scanner
    }
}