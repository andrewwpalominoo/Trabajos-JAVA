

package es.cide.prog;

import java.util.Random;
import java.util.Scanner;

public class Guybrush extends Heroi {
    Scanner sc = new Scanner(System.in);
    Random aleatorio = new Random();

    boolean vivo; // Estado de vida del heroe

    public Guybrush(String nombre, int vida, boolean vivo, String ultimaDefensa) {
        super(nombre, vida, ultimaDefensa);
        this.vivo = true;
    }

    // GetSet
    @Override
    public String getNombre() {
        return "Guybrush";
    }

    public int getVida() {
        return this.vida;
    }

    // Array defensa
    String[] defensa = {
            "Pues tu aliento debería considerarse igual.",
            "Que pena que todas estén inventadas.",
            "Es esa tu cara, pensé que era tu trasero.",
            "Grrr... Al ver el tamaño de tu barriga, diríase que te los has comido.",
            "Me asombra que nunca a tu mujer hayas mirado.",
            "Al menos el mio puede ser identificado.",
            "Quería asegurarme de que estuvieras a gusto conmigo.",
            "¿Es que TANTO me parezco a tu hermana?"
    };

    // Metodos
    @Override
    public void defensar() {
        System.out.println("Elige tu respuesta:");

        // Creamos un random para ver si se muestran los numeros pares o los impares,
        // así siempre se muestran la mitad
        int pares = aleatorio.nextInt(0, 1);
        if (pares == 0) {
            for (int i = 0; i < defensa.length; i++) { // Caso de solo los pares
                if (i % 2 == 0) {
                    System.out.println((i + 1) + ". " + defensa[i]); // Muestra las respuestas una por una haciendo una
                                                                     // lista
                }
            }
        } else {
            for (int i = 0; i < 10; i++) { // Caso de solo los impares
                if (i % 2 != 0) {
                    System.out.println((i + 1) + ". " + defensa[i]); // Muestra las respuestas una por una haciendo una
                                                                     // lista
                }
            }
        }
        int defensaElegida = sc.nextInt(); // Jugador elige

        // Si se elige un numero fuera de los indicados volverá a pedir un valor
        while (defensaElegida < 1 || defensaElegida > defensa.length) {
            System.out.println("Opción inválida. Elige otra vez.");
            defensaElegida = sc.nextInt();
        }

        // Guardamos la opción elegida en el campo `ultimaDefensa` (manteniendo `defensar()` void)
        this.ultimaDefensa = defensa[defensaElegida - 1];
        System.out.println(this.ultimaDefensa); // Este "-1" está para que el numero sea el mismo que el del
                                                // Array ya que cuenta desde 0
    }

    // Devuelve la última defensa elegida por el héroe
    public String getUltimaDefensa() {
        return this.ultimaDefensa;
    }

    @Override
    public void insultar() {

    }

    //Método de saludo cada vez que entra en batalla
    @Override
    public void sayHello() {
        System.out.println("Que pasa piratilla ¿le tienes miedo a un verdadero espadachín?");
    }

    //Método de despedida al morir
    @Override
    public void sayGoodBye() {
        System.out.println("Agradece tu golpe de suerte, bastardo.");
    }

    // Reduce la vida del héroe cuando falla una respuesta y confirma su estado de
    // vida
    @Override
    public boolean vida() {
        this.vida = vida - 2;

        if (vida > 0) { // Sigue vivo
            System.out.println("¡Guybrush sigue en pie! Vida restante: " + vida);
            this.vivo = true;
        } else { // Ha muerto
            System.out.println("Guybrush ha muerto...");
            this.vivo = false;
        }

        return this.vivo;
    }
}
