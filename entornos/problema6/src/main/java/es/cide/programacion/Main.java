package es.cide.programacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String si = "*";

        System.out.println("Introduce un numero");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}