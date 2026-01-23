package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Solicitamos que el usuario le de valor a la variable "a"

        int a=sc.nextInt();
        
        //Los dos posibles resultados

        if (a%2 == 0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
    }
}