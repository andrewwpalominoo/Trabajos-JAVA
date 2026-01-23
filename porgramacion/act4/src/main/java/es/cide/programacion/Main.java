package es.cide.programacion;

//Andrés Palomino Cassain
//45614964F
//7 de octubre de 2025

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Declaramos las variables

        int suma = 0;
        int resta = 0;
        int multi = 0;
        int divi = 0;
        int bucle = 0;

        //Iniciamos el bucle utilizando la variable, si deja de ser 0, dejará de ejecutarse

        while (bucle==0){
        
        //Visualización del menú
        System.out.println("----- MENÚ -----");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.err.println("3. Multiplicar");
        System.err.println("4. Dividir");
        System.err.println("5. Salir");
        
        //Solicitamos la opción

        int a=sc.nextInt();

        //Caso de numero incorrecto
        if (a <= 0 || a > 5){
            System.out.println("Introduce un numero del 1 al 5");
        }

        //Posibles opciones
        else{

            //Calculos (opciones del 1 al 5)

                if (a !=5){
                System.out.println("Introduce el valor 1");
                        int num1=sc.nextInt();
                        System.out.println("Introduce el valor 2");
                        int num2=sc.nextInt();
                switch (a) {
                    case (1):
                        suma = num1 + num2;
                        System.out.println("El resultado de la suma es: "+suma);
                        num1=0; num2=0; suma=0;
                        break;
                    case (2):
                        resta = num1 - num2;
                        System.out.println("El resultado de la resta es: "+resta);
                        num1=0; num2=0; resta=0;
                        break;
                    case (3):
                        multi = num1*num2;
                        System.out.println("El resultado de la multiplicacion es: "+multi);
                        num1=0; num2=0; multi=0;
                        break;
                    case (4): 
                        //Caso de dividir entre 0, no es posible asi que se pide otro numero hasta que deje de ser 0                      
                        while (num2 == 0){
                                System.out.println("No se puede dividir entre 0");
                                num2=sc.nextInt();     
                            }                           
                        
                        divi = num1/num2;
                        System.out.println("El resultado de la división es: "+divi);
                        num1=0; num2=0; divi=0;
                        break;
                    }
                }

                //Si se selecciona la opción de salir, el programa se despide y aumenta la variable de bucle en uno, cerrandolo de esta manera

                else {                         
                    System.out.println("Adiós!");
                    bucle++;
                    sc.close();
                }
            }
         }
      }          
    }