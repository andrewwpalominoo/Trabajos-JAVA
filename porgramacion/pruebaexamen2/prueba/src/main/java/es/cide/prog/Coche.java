package es.cide.prog;

import java.util.Random;

public class Coche extends Vehiculo implements Mantenimiento, Energia {

    boolean esTesla;

    public Coche(boolean esTesla) {
        super("Blas", "XEF192784");
        this.esTesla = esTesla;
    }

    // GetSet
    public boolean getEsTesla() {
        return this.esTesla;
    }

    // Atributos
    // Mantenimiento
    @Override
    public void revisarVehiculo() {
        System.out.println("Revisando coche...");
    };

    @Override
    public boolean finalizarMantenimiento() {
        if (esTesla = true){
            System.out.println("Mantenimiento del coche finalizado. Es un Tesla");
        } else {
            System.out.println("Mantenimiento del coche finalizado. No es un Tesla");
        }
        return true;
    };

    @Override
    public boolean estaListo() {
        Random aleatorio = new Random();

        int listo = aleatorio.nextInt(1, 11);

        //De esta manera es un 80% de posibilidades
        if (listo > 8) {
            return true;
        } else{
            return false;
        }
    };

    // Energia
    @Override
    public void cargarBateria() {
        System.out.println("Batería del coche cargada");
    }

    public static boolean tieneCorriente() {
        Random aleatorio = new Random();

        boolean corriente = aleatorio.nextBoolean();

        if (corriente) {
            return true;
        } else {
            return false;
        }
    };

}
