package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Solicitamos al usuario que le brinde valor a la variable
        System.out.println("Introduce un número positivo");
        int a= sc.nextInt();
        int suma = 0;
        int acumulado = 0;

        //Resultado
        if (a < 0){System.out.println("Introduce un número positivo");}
        else {
        System.out.println("El número introducido es: "+a);
        while (suma <= a){
            if (suma%2==0){
                acumulado = suma + acumulado;
            }
            suma++;
        }
        System.out.println("La suma de todos los pares del 1 al "+a+" es: "+acumulado);
      }
    }
}