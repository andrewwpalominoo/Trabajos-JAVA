

package es.cide.prog;

public abstract class Personatge {

    protected String nombre;
    protected int vida;

    public Personatge(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public abstract boolean vida();
}
