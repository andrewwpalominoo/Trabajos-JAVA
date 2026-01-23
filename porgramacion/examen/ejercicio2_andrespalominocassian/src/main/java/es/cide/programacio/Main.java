package es.cide.programacio;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaramos Random y Scanner
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        //Declaramos variables
        int ganar = 0;
        int intentos=1;
        int jugar=0;       

        //Iniciamos el juego, mientras no se seleccione la opcion de dejar de jugar, se seguira ejecutando
        while (jugar ==0){

            //El programa escoje un numero entre 1 y 200
            int numeroaleatorio = aleatorio.nextInt(201);
            
            //Buscle y posibles escenarios, se cerrará cuando el usuario adivine el número
            while (ganar < 1) {

                //Solicitamos un valor al usuario
                System.out.println("Introduce un numero entre 1 y 200"); 
                int num = sc.nextInt();

                if (num < 1  || num > 200){
                    System.out.println("Valor incorrecto");
                }

                //Escenario de victoria, al ser el mismo numero felicitamos y aumentamos la variable de victoria
                else if (num == numeroaleatorio){
                    System.out.println("Enhorabuena! Has acertado el numero");
                    ganar++;
                }

                //Si el numero es equivalente a una mitad, o esta entre una mitad arriba y una  mitad abajo, es caliente
                else if (num > (numeroaleatorio/2) && num < (numeroaleatorio*1.5) || num == (numeroaleatorio/2) || num == (numeroaleatorio*1.5)) {
                    System.out.println("Caliente");
                    intentos++;
                }

                //Caso contrario
                else if (num < (numeroaleatorio/2) || num > (numeroaleatorio*1.5)) {
                    System.out.println("Frío");
                    intentos++;
                }
            }


            //Casos posibles tras victoria

            //Al adivinar en un intento
            if (intentos == 1){
                System.out.println("Eres un crack! Has acertado a la primera");
            }

            //Al adivinar entre 2 y 10 intentos
            else if (intentos >= 2 && intentos <=10) {
                System.out.println("No está mal, lo has adivinado en "+intentos+" intentos");
            }

            //Al adivinarlo en 10 o mas, no indico nada ya que no se puede hacer en menos de 1 y aquí solo es a partir de 11
            else {
                System.out.println("Se puede mejorar, lo has divinado en "+intentos+" intentos");
            }


            //Al terminar el juego, mostramos menú de elecicon para seguir jugando o no
            System.out.println("Quieres volver a jugar?");
            System.out.println("0.- Si");
            System.out.println("1.- No");

            //Solicitamos opcion
            int opcion = sc.nextInt();

            //Caso de seguir jugando, la variable de jugar sigue en 0 y reiniciamos la de victoria
            if (opcion == 0){
                System.out.println("Perfecto");
                ganar = 0;
            }

            //Si el usuario decide dejar de jugar, nos despedimos y finalizamos el programa
            else if (opcion == 1){
                System.out.println("Hasta otra!");
                jugar++;
            }
        }
    }
}