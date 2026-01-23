package es.cide.prog;

// INTERFÍCIE: Defineix tot allò que porti bateria
interface Recargable {
    int cargarBateria();

    int getNivelBateria();
}

// CLASSE ABSTRACTA: La base de tots els objectes
abstract class Vehiculo {
    protected String matricula;
    protected String marca;

    public Vehiculo(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    // Mètode abstracte: obliguem als fills a programar-lo
    public abstract double calcularPrecioAlquiler(int dias);

    public String mostrarInfo() {
        System.out.println("--- FICHA VEHICULO ---");
        System.out.println("Marca: " + marca);
        System.out.println("Matrícula: " + matricula);
        return "";
    }
}
