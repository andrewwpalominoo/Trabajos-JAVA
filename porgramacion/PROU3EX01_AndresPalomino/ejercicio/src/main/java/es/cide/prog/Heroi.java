
package es.cide.prog;

import java.util.Scanner;

public class Heroi {

    Scanner sc = new Scanner(System.in);

    // Atributos del héroe
    String nombre;
    int vida;
    boolean vivo; // Estado de vida del heroe

    // Respuestas disponibles para el héroe (deben coincidir con los ataques del Pirata)
    String[] defensa = {
            "Pues tu aliento debería considerarse igual.",
            "Que pena que todas estén inventadas.",
            "Es esa tu cara, pensé que era tu trasero.",
            "Grrr... Al ver el tamaño de tu barriga, diríase que te los has comido.",
            "Me asombra que nunca a tu mujer hayas mirado.",
            "Al menos el mio puede ser identificado.",
            "Quería asegurarme de que estuvieras a gusto conmigo",
    };

    // Constructor: inicializa el héroe con nombre, vida y estado de vida
    public Heroi(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
        this.vivo = true;
    }

    // Getter del nombre del héroe
    public String getNombre() {
        return this.nombre;
    }

    // Getter de la vida actual del héroe
    public int getVida() {
        return this.vida;
    }

    // Muestra las opciones de defensa y permite al jugador elegir una
    public String defender() {
        System.out.println("Elige tu respuesta:");
        for (int i = 0; i < defensa.length; i++) {
            System.out.println((i + 1) + ". " + defensa[i]); // Muestra las respuestas una por una haciendo una lista
        }
        int defensaElegida = sc.nextInt(); // Jugador elige

        // Si se elige un numero fuera de los indicados volverá a pedir un valor
        while (defensaElegida < 1 || defensaElegida > defensa.length) {
            System.out.println("Opción inválida. Elige otra vez");
            defensaElegida = sc.nextInt();
        }

        return defensa[defensaElegida - 1]; // Este "-1" está para que el numero sea el mismo que el del Array ya que cuenta desde 0
    }

    // Reduce la vida del héroe cuando falla una respuesta y confirma su estado de vida
    public boolean heroeVivo() {
        this.vida = vida - 1;

        if (vida > 0) { //Sigue vivo
            System.out.println("¡Sigues en pie, héroe! Vida restante: " + vida);
            this.vivo = true;
        } else { //Ha muerto
            System.out.println("Has muerto, marinero...");
            this.vivo = false;
        }

        return this.vivo;
    }
}