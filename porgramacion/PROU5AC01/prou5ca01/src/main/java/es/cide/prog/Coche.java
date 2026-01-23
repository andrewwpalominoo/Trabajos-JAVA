package es.cide.prog;

abstract class Coche extends Vehiculo implements Recargable {

    //Atr
    int plazas;
    int velocidadMaxima;

    //Constructor
    public Coche (String matricula, String marca, int plazas, int velocidadMaxima){
        super(matricula, marca);
        plazas = this.plazas;
        velocidadMaxima = this.velocidadMaxima;
    }

    //GetSet
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    
}
