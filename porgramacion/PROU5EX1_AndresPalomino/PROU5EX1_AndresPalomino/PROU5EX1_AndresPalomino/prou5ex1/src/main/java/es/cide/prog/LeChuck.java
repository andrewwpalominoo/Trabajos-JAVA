

package es.cide.prog;

import java.util.Random;

public class LeChuck extends Pirata{

    Random aleatorio = new Random();

    boolean vivo;
    String[] insultoAleatorio = new String[4]; // Array de insultos
    int insultoRandom1, insultoRandom2, insultoRandom3, insultoRandom4; // Los 4 insultos que tendrá LeChuck
    int insultoPosicion; // Índice del último insulto lanzado
    boolean acertada; // Resultado de la replica.
    

    // Respuestas correctas del héroe (deben coincidir con las de la clase Heroe)
    private final String[] defensaHeroe = {
            "Pues tu aliento debería considerarse igual.",
            "Que pena que todas estén inventadas.",
            "Es esa tu cara, pensé que era tu trasero.",
            "Grrr... Al ver el tamaño de tu barriga, diríase que te los has comido.",
            "Me asombra que nunca a tu mujer hayas mirado.",
            "Al menos el mio puede ser identificado.",
            "Quería asegurarme de que estuvieras a gusto conmigo.",
            "¿Es que TANTO me parezco a tu hermana?"
    };

    // Insultos que puede lanzar el pirata
    private final String[] insultoLeChuck = {
            "Dicen que mis puños son un arma letal.",
            "Mis grandes hazañas por todo el Caribe son celebradas.",
            "¡Si luchas cara a cara conmigo necesitarás un consejero!",
            "Ugh.. Hoy con brazo poderoso a doce hombres he vencido.",
            "Uuggh Eres el bicho más feo que en mi vida haya encontrado...",
            "Cuando tu padre te vio por primera vez debió sentirse mortificado.",
            "Tienes los modales de un mendigo!",
            "Eres tan repulsivo como una mona marrana.", // Insulto extra de LeChuck
    };

    public LeChuck(String nombre, int vida, boolean acertada) {
        super(nombre, vida);
        this.vivo = true;
        this.acertada = true;

        // Seleccionar 4 índices diferentes para los insultos
        do {
            insultoRandom1 = aleatorio.nextInt(insultoLeChuck.length);
            insultoRandom2 = aleatorio.nextInt(insultoLeChuck.length);
            insultoRandom3 = aleatorio.nextInt(insultoLeChuck.length);
            insultoRandom4 = aleatorio.nextInt(insultoLeChuck.length);
        } while (insultoRandom1 == insultoRandom2 ||
                insultoRandom2 == insultoRandom4 ||
                insultoRandom3 == insultoRandom1 ||
                insultoRandom4 == insultoRandom3);

        // Guardar los 4 insultos seleccionados
        insultoAleatorio[0] = insultoLeChuck[insultoRandom1];
        insultoAleatorio[1] = insultoLeChuck[insultoRandom2];
        insultoAleatorio[2] = insultoLeChuck[insultoRandom3];
        insultoAleatorio[3] = insultoLeChuck[insultoRandom4];
    }


    public String getNombre() {
        return "LeChuck";
    }
    
    public int getVida(){
        return this.vida;
    }

    //Método de saludo cada vez que entra en batalla
    @Override
    public void sayHello(){
        System.out.println("Soy el legendario LeChuck, una eminencia que acabará contigo.");
    }

    //Método de despedida al morir
    @Override
    public void sayGoodBye(){
        System.out.println("Por mucho que me hayas derrotado, seré recordado por siempre...");
    }

    @Override
    public void insultar(){
        int indiceInsulto = aleatorio.nextInt(3); // Elige el insulto

        // Determinar la posición del insulto en el array original y la guarda
        if (insultoAleatorio[indiceInsulto].equals(insultoLeChuck[insultoRandom1])) {
            insultoPosicion = insultoRandom1;
        } else if (insultoAleatorio[indiceInsulto].equals(insultoLeChuck[insultoRandom2])) {
            insultoPosicion = insultoRandom2;
        } else if (insultoAleatorio[indiceInsulto].equals(insultoLeChuck[insultoRandom3])) {
            insultoPosicion = insultoRandom3;
        } else if (insultoAleatorio[indiceInsulto].equals(insultoLeChuck[insultoRandom4])) {
            insultoPosicion = insultoRandom4;
        }

        System.out.println(insultoAleatorio[indiceInsulto]);
    }

    @Override
    public void defensar(){

    }

    // Verifica si la respuesta del héroe es correcta.
    public void replica(String defensilla) {
        this.acertada = defensilla.equals(defensaHeroe[insultoPosicion]);
    }

    // Getter para saber si la última réplica fue acertada
    public boolean estaAcertada() {
        return this.acertada;
    }


    @Override
    public boolean vida() {
        this.vida = vida - 1;

        if (vida > 0) { // Sigue vivo
            System.out.println("¡LeChuck aún tiene " + vida + " puntos de vida!");
            this.vivo = true;
        } else { // Esta muerto
            System.out.println("¡Has derrotado a LeChuck!");
            this.vivo = false;
        }

        return this.vivo;
    }
}
