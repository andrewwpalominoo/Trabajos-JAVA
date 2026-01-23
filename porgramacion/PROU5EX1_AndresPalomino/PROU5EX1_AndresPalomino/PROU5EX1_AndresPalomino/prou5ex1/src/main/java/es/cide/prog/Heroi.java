
package es.cide.prog;

public abstract class Heroi extends Personatge implements Speak, Fight {
    String ultimaDefensa; // Guarda la defensa elegida.

    // Constructor: inicializa el héroe con nombre y vida
    public Heroi(String nombre, int vida, String ultimaDefensa) {
        super(nombre, vida);
        this.ultimaDefensa = ultimaDefensa;
    }

    public String getNombre(){
        return this.nombre;
    };

    public String getUltimaDefensa() {
        return this.ultimaDefensa;
    }

    public int getVida() {
        return this.vida;
    }
}