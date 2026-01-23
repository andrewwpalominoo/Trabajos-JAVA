package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bucle=1;
        int primo =0;

        System.out.println("Introduce un numero");

        int n = sc.nextInt();

        while (n>=bucle && primo <= 2){
            if (n%bucle==0){
                primo++;
            }
            bucle++;
        }

        if (primo ==2 || primo ==1){
                System.out.println("El numero "+n+" es primo");
            }
            else {
                System.out.println("El numero "+n+" no es primo");
            }
    }
}