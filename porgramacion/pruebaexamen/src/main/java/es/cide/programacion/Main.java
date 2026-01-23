package es.cide.programacion;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();

        int contador=0;
        int ganar=0;
        int numerorandom = aleatorio.nextInt(51);

        System.out.println("Introduce un numero del 1 al 50");

        while (contador < 6 && ganar < 1){
            int a = sc.nextInt();

            if (a > numerorandom){
                System.out.println("El numero es menor a "+a);
                contador++;
            }
            else if (a < numerorandom){
                System.out.println("El numero es mayor a "+a);
                contador++;
            }
            else {
                System.out.println("Enhorabuena! El numero es "+a);
                ganar++;
            }
        }

        if (contador == 6){
            System.out.println("Te has quedado sin intentos, el numero era "+numerorandom);
        }
        else {
            System.out.println("Has ganado, hasta otra");
        }
    }
}