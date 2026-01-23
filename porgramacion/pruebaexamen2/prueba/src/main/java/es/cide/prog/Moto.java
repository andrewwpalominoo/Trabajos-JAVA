package es.cide.prog;

import java.util.Random;

public class Moto extends Vehiculo implements Mantenimiento, Energia {

    public Moto() {
        super("Lucas", "LFP293892");
    }

    //Mantenimiento
    @Override
    public void revisarVehiculo(){
        System.out.println("Revisando moto...");
    };

    @Override
    public boolean finalizarMantenimiento(){
        System.out.println("Mantenimiento de la moto finalizado");
        return true;
    };

    @Override
    public boolean estaListo() {
        Random aleatorio = new Random();

        int listo = aleatorio.nextInt(1, 11);

        //De esta manera es un 80% de posibilidades
        if (listo > 6) {
            return true;
        } else {
            return false;
        }
    };

    //Energia
    @Override
    public void cargarBateria() {
        System.out.println("Batería de la moto cargada");
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
