package es.cide.prog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int n = sc.nextInt();
        boolean buscNum = false;

        while (buscNum = true) {
            n=n/10;
            if (d == n % 10) {
                System.out.println("SI");
            } else if (d != n) {
                System.out.println("NO");
                buscNum = false;
            }
        }
        sc.close();
    }
}