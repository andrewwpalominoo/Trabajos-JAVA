package es.cide.prog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        double valor1 = sc.nextDouble();
        System.out.println("Introduce otro numero");
        double valor2 = sc.nextDouble();
        System.out.println("Introduce el tipo de operacion (1,2,3,4)");
        int operacion = sc.nextInt();

        Calculadora miCasio = new Calculadora(valor1, valor2);
        double resultado;

        switch (operacion) {
            case 1:
                resultado = miCasio.sumar();
                System.out.println(resultado);
                break;
            case 2:
                resultado = miCasio.restar();
                System.out.println(resultado);
                break;
            case 3:
                resultado = miCasio.dividir();
                System.out.println(resultado);
                break;
            case 4:
                resultado = miCasio.multiplicar();
                System.out.println(resultado);
                break;
        }
    }
}