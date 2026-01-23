package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Solicitamos que el usuario le de valor a las variables

        System.out.println("Introduce un numero");
        int a=sc.nextInt();
        System.out.println("Introduce un segundo numero");
        int b=sc.nextInt();
        System.out.println("Introduce un operador (+, -, *, /)");
        char c=sc.next().charAt(0);
        
        //Los posibles resultados
        if (c == '+' || c == '-' || c == '*' || c == '/'){
            switch (c) {
            case ('+'):
                System.out.println(a+b);
                break;
            case ('-'):
                System.out.println(a-b);
                break;
            case ('*'):
                System.out.println(a*b);
                break;
            case ('/'):
                System.out.println(a/b);
                break;
            }
        }

        else{
            System.out.println("Operador erroneo");
        }
        
    }
}