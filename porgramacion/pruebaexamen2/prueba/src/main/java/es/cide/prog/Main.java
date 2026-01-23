package es.cide.prog;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al Taller Palomino");

        Vehiculo transporte = new Vehiculo("Lluc", "FKH815549");
        Coche cochecillo = new Coche(false);
        Moto motillo = new Moto();

        System.out.println("Registrado el coche de " +cochecillo.getPropietario());
        cochecillo.revisarVehiculo();
        cochecillo.cargarBateria();
        cochecillo.estaListo();

        System.out.println("Estado de la reparación...");
        while (cochecillo.estaListo() == false){
            System.out.println("El coche sigue en mantenimiento");
            cochecillo.estaListo();
        }

        System.out.println("El coche esta listo!");

        System.out.println("Registrada la moto de " +motillo.getPropietario());
        motillo.revisarVehiculo();
        motillo.cargarBateria();
        motillo.estaListo();

        System.out.println("Estado de la reparación...");
        while (motillo.estaListo() == false){
            System.out.println("La moto sigue en mantenimiento");
            motillo.estaListo();
        }

        System.out.println("La moto está lista!");

        cochecillo.finalizarMantenimiento();
        motillo.finalizarMantenimiento();
    }
}