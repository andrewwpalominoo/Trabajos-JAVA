package es.cide.prog;



public class CocheCombustion extends Coche{
    //Atributos
    double capacidad;

    //Constructor
    public CocheCombustion (String matricula, String marca, int plazas, int velocidadMaxima, double capacidad){
        super(matricula, marca, plazas, velocidadMaxima);
        capacidad = this.capacidad;
    }

    //Metodos
    public double calcularPrecioAlquiler(int dias){
        return dias;
    };

    public String mostrarInfo() {
        System.out.println("--- FICHA VEHICULO ---");
        System.out.println("Marca: " + marca);
        System.out.println("Matrícula: " + matricula);
        return "";
    }

    public int cargarBateria() {
        int i = 0;
        while (i <=100) {
            System.err.println("Nivel de batería = " +i);
            i++;
        }
        System.err.println("Nivel de batería = " +i);
        return i;
    }
    public int getNivelBateria(){
        return 0;
    };
}

