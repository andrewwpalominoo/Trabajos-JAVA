package es.cide.prog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int bucle = 0;
        int acumulador = 0;

        System.out.println("Introduce un numero natural (mayor a 0)");
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();

        while (a < 0){
            System.out.println("Valor incorrecto, introduce un numero natural (mayor a 0)");
            a = sc.nextInt();
        }
        while (bucle < a){
            bucle++;
            if (a%bucle==0 && bucle!=a){
                acumulador = bucle + acumulador;
            }
        }
        
        if (acumulador == a){
            System.out.println("El numero "+a+" es perfecto");
        }
        else {
            System.out.println("El numero "+a+" no es perfecto");
        }
    }
}