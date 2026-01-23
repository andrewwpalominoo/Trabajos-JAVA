package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notas={11, 11, 11, 11, 11, 11};
        int alumnos = 0;
        int aprobados = 0;
        int suspendidos = 0;
        
        while(alumnos < 6){
            System.out.println("Introduce la nota del alumno");
            notas[alumnos]=sc.nextInt();
            alumnos++;
        }
        alumnos=0;
        while (alumnos < 6){
            if (notas[alumnos] >= 5){
                aprobados++;
            }
            else {
                suspendidos++;
            }
            alumnos++;
        }
        System.out.println("La cantidad de alumnos aprobados es "+aprobados);
        System.out.println("La cantidad de alumnos suspendidos es "+suspendidos);
    }
}