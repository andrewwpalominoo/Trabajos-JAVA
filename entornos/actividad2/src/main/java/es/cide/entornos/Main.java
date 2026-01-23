package es.cide.entornos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int resta = 0;
        int invertir = 0;
        
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.err.println("3. Invertir");
        System.err.println("4. Salir");

        int a=sc.nextInt();
        do {
        
            if (a >=1 && a <= 3){
                    switch (a) {
                        case (1):
                            System.out.println("Introduce el valor 1");
                            int num1=sc.nextInt();
                            System.out.println("Introduce el valor 2");
                            int num2=sc.nextInt();
                            suma = num1 + num2;
                            System.out.println("El resultado de la suma es: "+suma);
                            break;
                        case (2):
                            System.out.println("Introduce el valor 1");
                            int num3=sc.nextInt();
                            System.out.println("Introduce el valor 2");
                            int num4=sc.nextInt();
                            resta = num3 - num4;
                            System.out.println("El resultado de la resta es: "+resta);
                            break;
                        case (3):
                            System.out.println("Introduce el numero a invertir");
                            int num5=sc.nextInt();
                            invertir = -(num5);
                            System.out.println("El resultado de la inversión es: "+invertir);
                            break;
                        
                        }
                a = 0;
                }
        } while (a !=4);
        
        System.out.println("Adios");
        
        
    }
}

