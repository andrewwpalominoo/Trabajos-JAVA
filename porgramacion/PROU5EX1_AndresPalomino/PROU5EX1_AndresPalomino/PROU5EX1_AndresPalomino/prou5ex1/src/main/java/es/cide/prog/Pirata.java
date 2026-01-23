package es.cide.prog;

public abstract class Pirata extends Personatge implements Speak, Fight {

    public Pirata(String nombre, int vida) {
        super(nombre, vida);
    }
}