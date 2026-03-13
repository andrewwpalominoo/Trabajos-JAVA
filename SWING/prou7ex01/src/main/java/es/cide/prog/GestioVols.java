package es.cide.prog;

import java.util.ArrayList;

//Implementamos la interface
public class GestioVols implements IGestioPassatgers{

    //Creamos arrayList
    ArrayList<String> llistaPassatgers = new ArrayList<>();

    //Iniciamos la lista en vacio
    public GestioVols() {
        this.llistaPassatgers = new ArrayList<>();
    }

    @Override
    //Nombre del pasajero
    public void registrarPassatger(String nom) {
        llistaPassatgers.add(nom);
    }


    @Override
    //Set del indice y el nombre modificado
    public void modificarReserva(int index, String nouNom) {
        llistaPassatgers.set(index, nouNom);
    }


    @Override
    //Eliminamos el nombre de la lista
    public void cancelarReserva(String nom) {
        llistaPassatgers.remove(nom);
    }


    @Override
    public String obtenirPassatger(int index) {
        //Asociamos el nombre del index y lo devolvemos
        return llistaPassatgers.get(index);
    }


    @Override
    //For each para listar los elementos de llistaPassatgers
    public void llistarPassatgers() {
        for (Object elem : llistaPassatgers) {
            System.out.println(elem + "");
        }
    }
}