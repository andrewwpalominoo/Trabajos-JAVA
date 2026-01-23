package es.cide.prog;

public class Patinete extends Vehiculo implements Recargable{

    //Atributos
    
    //Constructor
    public Patinete(String matricula, String marca) {
        super(matricula, marca);
    }

    //Metodo
    public double calcularPrecioAlquiler(int dias){
        return dias;
    };

    @Override
    public String mostrarInfo(){
        System.out.println("--- FICHA PATINETE ---");
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
