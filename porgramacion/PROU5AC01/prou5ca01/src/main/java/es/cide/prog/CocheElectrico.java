package es.cide.prog;

public class CocheElectrico extends Coche{
    //Constructor
    public CocheElectrico (String matricula, String marca, int plazas, int velocidadMaxima){
        super(matricula, marca, plazas, velocidadMaxima);
    }

    //Metodos
    public double calcularPrecioAlquiler(int dias){
        return dias;
    };

    public String mostrarInfo(){
        System.out.println("--- FICHA COCHE ELECTRICO ---");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Marca: " + marca);
        return "";
    }

    public int cargarBateria() {
        int bateria = 0;
        while (bateria < 100) {
            System.err.println("Nivel de batería = " +bateria);
            bateria++;
        }
        System.err.println("Nivel de batería = " +bateria);
        return bateria;
    }

    public int getNivelBateria(){
        int bateria = 100;
        System.out.println(bateria);
        return bateria;
    };
}
