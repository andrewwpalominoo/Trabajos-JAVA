
package es.cide.prog;

import java.util.Random;

public class Pirata {

    Random aleatorio = new Random();

    // Atributos del pirata
    int vida;
    boolean vivo; // Estado de vida
    String pirataNombre;
    String[] insultoAleatorio = new String[3]; // Array de insultos
    int insultoRandom1, insultoRandom2, insultoRandom3; // Los 3 insultos que tendrá el pirata
    int insultoPosicion; // Índice del último insulto lanzado

    // Respuestas correctas del héroe (deben coincidir con las de la clase Heroe)
    private String[] defensaHeroe = {
            "Pues tu aliento debería considerarse igual.",
            "Que pena que todas estén inventadas.",
            "Es esa tu cara, pensé que era tu trasero.",
            "Grrr... Al ver el tamaño de tu barriga, diríase que te los has comido.",
            "Me asombra que nunca a tu mujer hayas mirado.",
            "Al menos el mio puede ser identificado.",
            "Quería asegurarme de que estuvieras a gusto conmigo",
    };

    // Insultos que puede lanzar el pirata
    private String[] insultoPirata = {
            "Dicen que mis puños son un arma letal.",
            "Mis grandes hazañas por todo el Caribe son celebradas.",
            "¡Si luchas cara a cara conmigo necesitarás un consejero!",
            "Ugh.. Hoy con brazo poderoso a doce hombres he vencido.",
            "Uuggh Eres el bicho más feo que en mi vida haya encontrado...",
            "Cuando tu padre te vio por primera vez debió sentirse mortificado.",
            "Tienes los modales de un mendigo!",
    };

    // Constructor: inicializa el pirata con nombre, vida y selecciona 3 insultos únicos
    public Pirata(String pirataNombre, int vida) {
        this.pirataNombre = pirataNombre;
        this.vida = vida;
        this.vivo = true;

        // Seleccionar 3 índices diferentes para los insultos
        do {
            insultoRandom1 = aleatorio.nextInt(insultoPirata.length);
            insultoRandom2 = aleatorio.nextInt(insultoPirata.length);
            insultoRandom3 = aleatorio.nextInt(insultoPirata.length);
        } while (insultoRandom1 == insultoRandom2 ||
                insultoRandom1 == insultoRandom3 ||
                insultoRandom2 == insultoRandom3);

        // Guardar los 3 insultos seleccionados
        insultoAleatorio[0] = insultoPirata[insultoRandom1];
        insultoAleatorio[1] = insultoPirata[insultoRandom2];
        insultoAleatorio[2] = insultoPirata[insultoRandom3];
    }

    // Getter del nombre del pirata
    public String getPirataNombre() {
        return this.pirataNombre;
    }

    // Getter de la vida actual del pirata
    public int getPirataVida() {
        return this.vida;
    }

    // Lanza un insulto aleatorio de los 3 disponibles y guarda su posición
    public String insultar() {
        int indiceInsulto = aleatorio.nextInt(3); // Elige el insulto

        // Determinar la posición del insulto en el array original y la guarda
        if (insultoAleatorio[indiceInsulto].equals(insultoPirata[insultoRandom1])) {
            insultoPosicion = insultoRandom1;
        } else if (insultoAleatorio[indiceInsulto].equals(insultoPirata[insultoRandom2])) {
            insultoPosicion = insultoRandom2;
        } else if (insultoAleatorio[indiceInsulto].equals(insultoPirata[insultoRandom3])) {
            insultoPosicion = insultoRandom3;
        }

        return insultoAleatorio[indiceInsulto];
    }

    // Verifica si la respuesta del héroe es correcta para el último insulto
    public boolean replica(String defensilla) {
        return defensilla.equals(defensaHeroe[insultoPosicion]);
    }

    // Reduce la vida del pirata cuando el héroe acierta y confirma su estado de vida
    public boolean pirataVivo() {
        this.vida = vida - 1;

        if (vida > 0) { // Sigue vivo
            System.out.println("¡El pirata sigue con " + vida + " puntos de vida!");
            this.vivo = true;
        } else { // Esta muerto
            System.out.println("¡Has derrotado al pirata!");
            this.vivo = false;
        }

        return this.vivo;
    }
}