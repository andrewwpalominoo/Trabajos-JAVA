package es.cide.prog;

public class Vehiculo {
    String propietario;
    String numSerie;

    public Vehiculo(String propietario, String numSerie) {
        this.propietario = propietario;
        this.numSerie = numSerie;
    }

    public String getPropietario() {
        return this.propietario;
    }

    public String getNumSerie() {
        return this.numSerie;
    }
    
}
