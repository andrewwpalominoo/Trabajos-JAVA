package es.cide.prog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        boolean si=true;

        System.out.println("Introduce un texto que termine en punto");
        while (si=true) { 
            String texto = sc.nextLine();        
        
            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i)=='a'){
                    a++;
                }
                
            }
            System.out.println("La linea tiene " +a+ " letras a");
            a=0;
        }  
        
    }
}