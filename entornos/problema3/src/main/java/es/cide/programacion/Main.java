package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int multi=0;

        System.out.println("Introduce el valor 1");
        int num1=sc.nextInt();
        System.out.println("Introduce el valor 2");
        int num2=sc.nextInt();
        

        while (num2 > 0){
            multi = multi + num1;
            num2 = num2 - 1;
        }

        System.out.println("La multiplicacion es: "+multi);
    }
}