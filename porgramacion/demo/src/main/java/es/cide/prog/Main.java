package es.cide.prog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int array[]={11, 11, 11, 11, 11, 11, 11, 11, 11, 11};

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce en la posicion " +i);
            int a=sc.nextInt();
            array[i]=a;
            System.out.println("La posicion "+i+ " es "+a);
        }
    }
}