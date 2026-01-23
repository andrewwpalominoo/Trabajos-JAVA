package es.cide.prog;

public class Vehiculo {

    // Atributos
    double peso;
    int plaza;
    String tipocombustible;
    double capacidadcombustible;
    double consumo;
    int ocupantes;

    // Constructor
    public Vehiculo(double peso2, int plaza2, String tipocombustible2, double capacidadcombustible2, double consumo2, int ocupantes2) {
        this.peso = peso2;
        this.plaza = plaza2;
        this.tipocombustible = tipocombustible2;
        this.capacidadcombustible = capacidadcombustible2;
        this.consumo = consumo2;
        this.ocupantes = ocupantes2;
    }

    // Getters y setters

    public double getPeso(double peso3) {
        return this.peso;
    }

    public int getPlaza(int plaza3) {
        return this.plaza;
    }

    public void setCombustible(String tipocombustible3) {
        this.tipocombustible = tipocombustible3;
    }

    public String getCombustible(String tipocombustible3) {
        return this.tipocombustible;
    }

    public void setCapacidad(double capacidadcombustible3) {
        this.capacidadcombustible = capacidadcombustible3;
    }

    public double getCapacidad(double capacidadcombustible3) {
        return this.capacidadcombustible;
    }

    public double getConsumo(double consumo3) {
        return this.consumo;
    }

    public void setOcupantes(int ocupantes3) {
        this.ocupantes = ocupantes3;
    }

    public int getOcupantes(int ocupantes3) {
        return this.ocupantes;
    }

    // Metodos
    public double autonomiaCalculo() {
        double Autonomia = (capacidadcombustible / consumo)*100;
        return Autonomia;
    }
}
