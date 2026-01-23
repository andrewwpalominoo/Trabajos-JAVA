package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Solicitamos que el usuario le de valor a la variable "a"

        System.out.println("Introduce la contraseña");
        String a=sc.next();
        
        //Los posibles resultados

        if(!"java123".equals(a)){
            System.out.println("Acceso denegado");
        }

        else {
            System.out.println("Acceso Permitido");
        }
    }
}