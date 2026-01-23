package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Solicitamos que el usuario le de valor a la variable "a"

        System.out.println("Introduce un numero del uno al siete");
        int a=sc.nextInt();
        
        //Los posibles resultados

        if(a > 0 && a <= 7){

            switch (a) {
                case (1):
                    System.out.println("Lunes");
                    break;
                case (2):
                    System.out.println("Martes");
                    break;
                case (3):
                    System.out.println("Miercoles");
                    break;
                case (4):
                    System.out.println("Jueves");
                    break;
                case (5):
                    System.out.println("Viernes");
                    break;
                case (6):
                    System.out.println("Sabado");
                    break;
                case (7):
                    System.out.println("Domingo");
                    break;                   
            }
        }

        else {
            System.out.println("Has introducido un numero erroneo");
        }
    }
}
