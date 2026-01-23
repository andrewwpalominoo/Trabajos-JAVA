// Nombre: Andrés Palomino Cassain
// 45614964F
// Fecha: 9/12/25 --> 

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
