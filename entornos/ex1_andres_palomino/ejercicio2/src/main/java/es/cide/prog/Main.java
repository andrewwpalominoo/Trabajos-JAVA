package es.cide.prog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introduce un numero natural (mayor a 0)");
        Scanner sc = new Scanner (System.in);

        String a = sc.nextLine();
        int bucle = 0;    
        int[] escribir = new int[a.length()];
        

        while (bucle < a.length()){
            System.out.println(escribir[bucle]=a.charAt(bucle));;
            bucle++;
        }
        

    }
}