package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Solicitamos que el usuario le de valor a la variable "a"

        System.out.println("Introduce una letra");
        char a=sc.next().charAt(0);
        
        //Los posibles resultados

        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){

            System.out.println("Es una vocal");                  
            }
        else {
            System.out.println("Es una consonante");
        }
    }
}
